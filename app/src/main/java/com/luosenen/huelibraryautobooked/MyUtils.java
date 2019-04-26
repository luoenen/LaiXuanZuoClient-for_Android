package com.luosenen.huelibraryautobooked;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {

    public static String booked_url = "http://wechat.laixuanzuo.com/index.php/prereserve/save/libid=";
    public static String index_url = "http://wechat.laixuanzuo.com/index.php/reserve/index.html?f=wechat";

    public static String times = String.valueOf(System.currentTimeMillis());

    public static Map<String,String> header;

    public static Map<String,String> cv;

    public static String netWork(String url,String cookie) throws IOException {

        header = new HashMap<>();
        header.put("Host","wechat.laixuanzuo.com");
        header.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        header.put("Connection","keep-alive");
        header.put("Cookie","Hm_lpvt_7838cef374eb966ae9ff502c68d6f098=+"+times+"; Hm_lvt_7838cef374eb966ae9ff502c68d6f098="+times+"; FROM_TYPE=weixin; wechatSESS_ID="+cookie);
        header.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/605.1.15 (KHTML, like Gecko) MicroMessenger/2.3.24(0x12031810) MacWechat NetType/WIFI WindowsWechat");
        header.put("Accept-Language","zh-cn");
        header.put("Referer","https://wechat.laixuanzuo.com/index.php/prereserve/index.html");
        header.put("Accept=Encoding","br, gzip, deflate");

        Document doc = (Document) Jsoup.connect(url).ignoreContentType(true).headers(header).get();
        return doc.body().text();
    }


    public static String getJs(String url,String cookie) throws IOException {
        header = new HashMap<>();
        List<String> jss = new ArrayList<>();
        header.put("Host","wechat.laixuanzuo.com");
        header.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        header.put("Connection","keep-alive");
        header.put("Cookie","Hm_lpvt_7838cef374eb966ae9ff502c68d6f098=+"+times+"; Hm_lvt_7838cef374eb966ae9ff502c68d6f098="+times+"; FROM_TYPE=weixin; wechatSESS_ID="+cookie);
        header.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/605.1.15 (KHTML, like Gecko) MicroMessenger/2.3.24(0x12031810) MacWechat NetType/WIFI WindowsWechat");
        header.put("Accept-Language","zh-cn");
        header.put("Referer","https://wechat.laixuanzuo.com/index.php/prereserve/index.html");
        header.put("Accept=Encoding","br, gzip, deflate");

        Document doc = (Document) Jsoup.connect(url).headers(header).get();
        Elements links = ((Element) doc).select("script");
        for (Element link : links) {
            String linkHref = link.attr("src");
            if(!linkHref.equals("")){
                jss.add(linkHref);
            }

        }
        String js[] = jss.get(1).split("/");

        return js[7];
    }

    public static String cv(String c){
        cv = new HashMap<>();
        cv.put("XDFsK2hRQrEAMJtR","xmShQQ7SaY3");
        cv.put("hSNQnPyN3zf3jbQz","pNT8tdaT");
        cv.put("MGYaYRCEp5JARsBT","YS2AWje");
        cv.put("knBe7batAktyw2MB","i6R5FwWwbAyH");
        cv.put("XwrzkzZ5nr4w6FWi","A7hYcwdThpfXDs");
        cv.put("JBQdQwZ75idj747i","sECk8n");
        cv.put("kwBQ6zAazmP7fcpZ","GfrjAs");
        cv.put("fJ3FeX2MWmxGP4MW","CQ2w8Kx6QitBZh7");
        cv.put("APp6QpMm56RTQXFn","RAFBQsSQ8PD");
        cv.put("MSeFjttBD3nTCtwH","2WMpkYnmZ5");
        cv.put("PY3cN4imk5EQThnF","XSCF37jDYdz");
        cv.put("PQpjAnxt68SZ7xTK","GhBikixQsJEr");
        cv.put("YaSp7MxDxwweMNHc","rJh5pd8Bi6tk2Jm");
        cv.put("ZphPm2MWPXaXe4wd","6F8an8GmKh2pjAN");
        cv.put("QfKXDYT5MXJj6z8c","Y752kB");
        cv.put("rDdQD8f8rwF7jFjz","YdNtiF");
        cv.put("8rhZ5QcMMfMm5pCa","cr3bjxZAJ7AMF3y");
        cv.put("b5NMSASXRKFSsBG3","Zm67%C3%86YF");
        cv.put("pCMa3yDitNJ4MNxZ","Em6rya32Qs4p");
        cv.put("QA8KwfM2tZRaBCKp","3mDxm5cz7Sbk");
        cv.put("FkbhKtzPmHEKZa4Q","NSSJyYp53");
        cv.put("w4BZ4n6jymP6CKcS","Sn6iBrnQn");
        cv.put("prHnnwfSfYsprrC8","dcsBzzizpiS6Y7f");
        cv.put("t3DHEF5Hxsf3NjSi","QMss78iaxK");
        cv.put("7hWyFHt4pr2AF3BE","ZfZG2mSaKDC");
        cv.put("SzNebPNzGbkaETnW","KzZJcpGyJe");
        cv.put("HGFxTc7PYDJtB86c","BmQAzZzPxBsH7xX");
        cv.put("ZcBhmx8NiWEpxerk","mRKtQBCiCenPS");
        cv.put("eCAiwFMydcTrxeW5","nAx8ekydKYs");
        cv.put("HGZKrGt5ABT8QfNa","ezYw3f");
        cv.put("ibKXDX8dtcRTCpdZ","DeDM7aSKfmKDD8");
        cv.put("dHSYWKZyEfFZFWAy","DymFXaDw");
        cv.put("ZFQdjnFzRHp5n7wn","6ArCwESBD4");
        cv.put("T7JiQnstDmEDihJE","tz3JpJ");
        cv.put("2k3Qa2FtdtZD3T63","7GxakmDpmxz");
        cv.put("FRnWXMx8Qd6akF38","fzaapfSpixhw");
        cv.put("C26ze47mCCNXppxY","TKMGmdRcMmB7f");
        cv.put("c8aFXkGXtStRXWCe","nym5pzyS8sTzMp");
        cv.put("3PDbtG4y2EbCwXeS","p7amPiTBWMm");
        cv.put("Tzj36Qe5kD3iFH4N","rb5Eij4nKJi");
        cv.put("ZAh2sRExKjd6X3Kp","YKQh5M8fm8");
        cv.put("wCGybQXrDHPQeM5B","PQnjzYN7nEsD");
        cv.put("4bAEGCeQ5EjTWSsC","MR5CzSmKs8aK");
        cv.put("AS4wt4wpk6sY4kbJ","ZpksXrYTT");
        cv.put("i6aktSYrpMs2X48y","wkzAYtS");
        cv.put("rTEYNRMaT7CexYZW","MERkHtxFzsZP");
        cv.put("S76AAffwzXPGGYki","fj7aHyJN");
        cv.put("kjmCcGchHriBrzNM","6xTahhmpymQdhH");
        cv.put("PAhkcFtcXPkxMAic","mbjsGm");
        cv.put("hhJKPkkPCZNmpY6C","6F7RiAJb");
        cv.put("28jhHRbfHQBjsecd","xdrbtN8M%C2%A5eJpm");
        cv.put("s7SYKZepdwyG8taC","p6XPNBBR");
        cv.put("jxQ27QfSfWmhkGkk","Q3CXtGhwn");
        cv.put("t66Dky7WDsAsbJDx","BpW47kne");
        cv.put("beb7srX24CGcwr7e","FMDDs4sBymznP");
        cv.put("6rQcWXfEj2aZi2Z2","n5HHWTS");
        cv.put("AQyRYXe5axkbDkMz","nZNkM6irGdb");
        cv.put("aR4RJnZARiijjnDA","nFDGYkYDfnca");
        cv.put("7BPwQxMX7z862TFf","GDi82CGxz");
        cv.put("py5zZ38pGEYi7fEr","8H7SBmmXNQN");
        cv.put("Wbi7yrjtC37MCJkF","mc6hz6MN57ZX");
        cv.put("HMmjr5Kj6Dn7Hjcz","MW53STa25jaSzf");
        cv.put("4zBa4iHiZjMRaFGB","Q2WBATsSN");
        cv.put("3bzbNSkJE7t6CcHS","3hpWAm3TzpDMK7b");
        cv.put("ERZYECATnk3rpy57","Rd7mhiBe");
        cv.put("5KT7Whe76jHa3M3F","iQmkpd335");
        cv.put("PebyiyYahBRTxD74","7NAp7c2Qc");
        cv.put("MBmMtxNjrff6DJey","FY6cCjZWZHid");
        cv.put("MAzFQsYHehKRzzep","225Q5hp4");
        cv.put("KRyKsS2D6ktz75fb","JZwSYP");
        cv.put("neXpwwKdzSpNdfmR","QDc28PEmPeZhWcd");
        cv.put("yntthnW7zGFpdnXk","YbBWtysQw78mF4D");
        cv.put("3ccftFcXbSJw6F3t","aCAbA7XXEZ6");
        cv.put("nHen28SZTwcf8nZm","iB7p8WNJifGM");
        cv.put("bbJfKEDp4KMTsT8w","m7J6fJ7KtXRZ");
        cv.put("Y4xBeJD6zXGRTnyB","5GfKr4dwk");
        cv.put("DsZQTEXTNbkjMWZr","53BSbfcpDyyJFc");
        cv.put("hesYDysNwKAMz5e5","Mf6wBQh7yhe");
        cv.put("3PTsCdrfyYiWjkeC","BRPMH5");
        cv.put("YTPhNW3a5h5nfwAk","ZmhfjkBX2f");
        cv.put("YFaM4BTAeWeS6Pbh","wJWrphQp");
        cv.put("z7JbNX5hJipx3wJN","RQTM52XnkdcpAKA");
        cv.put("68hjEEbWxDiYn6by","sTKmM3nQBnQEx");
        cv.put("NJHB5zmPtt8zHHXw","MRSmY8r3mEJe4");
        cv.put("B7aZQHibD8wdAcG2","EW4dAH");
        cv.put("8zieCQ2xtBYx6pEJ","fxmWAsRMwM");
        cv.put("BDCDmSnKrfBGJZXE","DTb3RP6HttnwDS");
        cv.put("67nYG5rSWJtmmTK8","AAywFjhHrN8ZP");
        cv.put("7yAy5AbRT7RiRm43","HQsRKYa2Y");
        cv.put("6hrt64i4SEsyFzfp","WYEGEY5hAD5");
        cv.put("ctf4Ki8BbKsB8NpT","Q75N7RCr");
        cv.put("pDbG6aHte2b3Q8iG","7GxakmDpmxz");
        cv.put("rhJnmJbyTXefSKcx","KKfixBstziEJjYj");
        cv.put("dABf7twxc7Efmyfm","RAFBQsSQ8PD");
        cv.put("NAcyx8EyssQ4tazr","5xNxN6252p7QGT");
        return cv.get(c);
    }

    public static double timer() throws InterruptedException {

        Date date = new Date();
        Date goal = new Date();
        goal.setMinutes(01);
        goal.setSeconds(00);

        return goal.getTime()-date.getTime();
    }


}
