package com.designpattern.thread.t6;

public final class ProductMgrImpl extends AbstractProductMgr {
	private static volatile ProductMgrImpl instance;
	private final String lock = new String("LOCK");
	// private final Object Obj = new Object();

	private ProductMgrImpl() {
	};

	/**
	 * 功能描述：得到产品管理单例对象（只允许存在一个对象个数),规则如下 1·建议使用延迟加加载方式实现单例 2·安全编程考查点：建议5·2
	 * 避免使用不正确形式的双重锁定检查
	 * 
	 * @return ProductMgrlmpl
	 */
	public static ProductMgrImpl getlnstance() {
		if (instance == null) {
			synchronized (ProductMgrImpl.class) {
				if (instance == null) {
					instance = new ProductMgrImpl();
				}
			}
		}
		return instance;
	}

	@Override
	public void createProduct() {
		while (!finishFlag) {
			synchronized (lock) {
				try {
					while (products.size() >= 3) {
						lock.wait();
					}
					System.out.println("进入生产  products.size------> " + products.size());
					String p = getProductName();
					products.add(p);
					recordProductInfo(p, true);
					Thread.sleep(1000);
					lock.notifyAll();
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	@Override
	public void consumeProduct() {
		while (!finishFlag) {
			synchronized (lock) {
				try {
					while (products.isEmpty()) {
						lock.wait();
					}
					System.out.println("进入消费  products.size------> " + products.size());
					String p = products.remove(0);
					recordProductInfo(p, false);
					Thread.sleep(2000);
					lock.notifyAll();
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	@Override
	public void shutdown() throws InterruptedException {
		Thread.sleep(20000);
		finishFlag = true;
	}

	@Override
	public int getProductNumber() {
		return (products.size() > 0 ? products.size() - 1 : 0);
	}

}
