package com.designpattern.thread.t6;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProductMgr {
	protected final List<String> products = new ArrayList<String>();
	// 完成标识
	protected volatile boolean finishFlag = false;
	// 产品计数
	private int productIndex = 0;

	/**
	 * 功能描述：得到产品名称
	 * 
	 * @return String
	 */
	public String getProductName() {
		productIndex++;
		return "Product " + productIndex;
	}

	/**
	 * 功能描述：记录产品信息
	 * 
	 * @param ondProduct
	 * @param isCreate   是否创建true:表示创建 false：表示消费
	 */
	public void recordProductInfo(String ondProduct, boolean isCreate) {
		if (isCreate) {
			System.out.println(ondProduct + " create finish!");
		} else {
			System.out.println(ondProduct + " consume finish!");
		}
	}

	/**
	 * 功能描述：创建产品方法，规则如下 1.每隔一秒钟创建一个产品，并用 recordProductInfo记录日志
	 * 2.创建产品时，当前集合中产品大于3时，需要等待且释放锁（待监控对象通知 后才继续执行） 3.当前产品数量小于3时直接添加到
	 * 4·安全编程考查点：建议5·1避免在 产生阻塞操作中持有锁 publicabstractvoidcreateProduct();
	 * 
	 */
	public abstract void createProduct();

	/**
	 * 功能描述：消费产品，规则如下 1.每隔二秒钟消费一个产品，并用 recordProductInfo记录日志
	 * 2.消费产品，当集合中没有产品时，需要等待且释放锁（待监控对象通知后才 继续执行） 3.安全编程考查点：建议5·1避免在 产生阻塞操作中持有锁
	 */

	public abstract void consumeProduct();

	/**
	 * 功能描述：关闭产品工厂，规则如下 1.等待10秒后关闭产品创建和消费线程 2.安全编程考查点：规则5·9禁止使 用Thread.stop()来终止线程
	 * 
	 * @throws InterruptedException异常 publicabstractvoidshutdown()
	 * 
	 */
	public abstract void shutdown() throws InterruptedException;

	/**
	 * 功能描述：得到产品的数量（安全编程 考查点：注意数据的一致性）
	 * 
	 * @return int
	 */
	public abstract int getProductNumber();

}
