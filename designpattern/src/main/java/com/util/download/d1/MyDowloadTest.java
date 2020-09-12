package com.util.download.d1;

public class MyDowloadTest {
    public static void main(String[] args) {
        DownUtil downUtil = new DownUtil(
                "http://122.246.9.250/67747A6C5D84B71E22A3C3CFE/03000A03005B9A34F27DF9800CB6C41096EB0F-B8A1-40F9-BE9D-77E1AD6E6E21.mp4?ccode=0502&duration=391&expire=18000&psid=12d0040bed59918644c5f644cc4ffd32&sp=&ups_client_netip=73cd74c8&ups_ts=1537256639&ups_userid=&utid=WqjDEjj3X1oCATy6JD6F%2Fbwk&vid=XMzgyMjM0MzUwNA%3D%3D&vkey=Be4882f87d72ed2b036aa6d16b12d2968&s=efbfbd135a731defbfbd&ali_redirect_domain=vali-dns.cp31.ott.cibntv.net",
                "C:\\Users\\abc\\Desktop\\xbl\\img\\2.mp4", 8);
        try {
            downUtil.downLoad();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}