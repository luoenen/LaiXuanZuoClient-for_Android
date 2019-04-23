package com.luosenen.huelibraryautobooked;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    private static String times = String.valueOf(System.currentTimeMillis());

    private static Map<String,String> header;

    private static Map<String,String> cv;

    public static void netWork(String url,String cookie) throws IOException {

        header = new HashMap<>();
        header.put("Host","wechat.laixuanzuo.com");
        header.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        header.put("Connection","keep-alive");
        header.put("Cookie","Hm_lpvt_7838cef374eb966ae9ff502c68d6f098=+"+times+"; Hm_lvt_7838cef374eb966ae9ff502c68d6f098="+times+"; FROM_TYPE=weixin; wechatSESS_ID="+cookie);
        header.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/605.1.15 (KHTML, like Gecko) MicroMessenger/2.3.24(0x12031810) MacWechat NetType/WIFI WindowsWechat");
        header.put("Accept-Language","zh-cn");
        header.put("Referer","https://wechat.laixuanzuo.com/index.php/prereserve/index.html");
        header.put("Accept=Encoding","br, gzip, deflate");

        Document connect = (Document) Jsoup.connect(url);
        Connection data = ((Connection) connect).headers(header);
        Document document = data.get();
    }

    public static void cv(){
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
        cv.put("","");
        cv.put("","");
    }
            "    'i6aktSYrpMs2X48y':'wkzAYtS',\n" +
            "    'rTEYNRMaT7CexYZW':'MERkHtxFzsZP',\n" +
            "    'S76AAffwzXPGGYki':'fj7aHyJN',\n" +
            "    'kjmCcGchHriBrzNM':'6xTahhmpymQdhH',\n" +
            "    'PAhkcFtcXPkxMAic':'mbjsGm',\n" +
            "    'hhJKPkkPCZNmpY6C':'6F7RiAJb',\n" +
            "    '28jhHRbfHQBjsecd':'xdrbtN8M%C2%A5eJpm',\n" +
            "    's7SYKZepdwyG8taC':'p6XPNBBR',\n" +
            "    'jxQ27QfSfWmhkGkk':'Q3CXtGhwn',\n" +
            "    't66Dky7WDsAsbJDx':'BpW47kne',\n" +
            "    'beb7srX24CGcwr7e':'FMDDs4sBymznP',\n" +
            "    '6rQcWXfEj2aZi2Z2':'n5HHWTS',\n" +
            "    'AQyRYXe5axkbDkMz':'nZNkM6irGdb',\n" +
            "    'aR4RJnZARiijjnDA':'nFDGYkYDfnca',\n" +
            "    '7BPwQxMX7z862TFf':'GDi82CGxz',\n" +
            "    'py5zZ38pGEYi7fEr':'8H7SBmmXNQN',\n" +
            "    'Wbi7yrjtC37MCJkF':'mc6hz6MN57ZX',\n" +
            "    'HMmjr5Kj6Dn7Hjcz':'MW53STa25jaSzf',\n" +
            "    '4zBa4iHiZjMRaFGB':'Q2WBATsSN',\n" +
            "    '3bzbNSkJE7t6CcHS':'3hpWAm3TzpDMK7b',\n" +
            "    'ERZYECATnk3rpy57':'Rd7mhiBe',\n" +
            "    '5KT7Whe76jHa3M3F':'iQmkpd335',\n" +
            "    'PebyiyYahBRTxD74':'7NAp7c2Qc',\n" +
            "    'MBmMtxNjrff6DJey':'FY6cCjZWZHid',\n" +
            "    'MAzFQsYHehKRzzep':'225Q5hp4',\n" +
            "    'KRyKsS2D6ktz75fb':'JZwSYP',\n" +
            "    'neXpwwKdzSpNdfmR':'QDc28PEmPeZhWcd',\n" +
            "    'yntthnW7zGFpdnXk':'YbBWtysQw78mF4D',\n" +
            "    '3ccftFcXbSJw6F3t':'aCAbA7XXEZ6',\n" +
            "    'nHen28SZTwcf8nZm':'iB7p8WNJifGM',\n" +
            "    'bbJfKEDp4KMTsT8w':'m7J6fJ7KtXRZ',\n" +
            "    'Y4xBeJD6zXGRTnyB':'5GfKr4dwk',\n" +
            "    'DsZQTEXTNbkjMWZr':'53BSbfcpDyyJFc',\n" +
            "    'hesYDysNwKAMz5e5':'Mf6wBQh7yhe',\n" +
            "    '3PTsCdrfyYiWjkeC':'BRPMH5',\n" +
            "    'YTPhNW3a5h5nfwAk':'ZmhfjkBX2f',\n" +
            "    'YFaM4BTAeWeS6Pbh':'wJWrphQp',\n" +
            "    'z7JbNX5hJipx3wJN':'RQTM52XnkdcpAKA',\n" +
            "    '68hjEEbWxDiYn6by':'sTKmM3nQBnQEx',\n" +
            "    'NJHB5zmPtt8zHHXw':'MRSmY8r3mEJe4',\n" +
            "    'B7aZQHibD8wdAcG2':'EW4dAH',\n" +
            "    '8zieCQ2xtBYx6pEJ':'fxmWAsRMwM',\n" +
            "    'BDCDmSnKrfBGJZXE':'DTb3RP6HttnwDS',\n" +
            "    '67nYG5rSWJtmmTK8':'AAywFjhHrN8ZP',\n" +
            "    '28jhHRbfHQ':'',\n" +
            "    '7yAy5AbRT7RiRm43':'HQsRKYa2Y',\n" +
            "    'ESsfTSZJwd4ZXkmA':'',\n" +
            "    '6hrt64i4SEsyFzfp':'WYEGEY5hAD5',\n" +
            "    'ctf4Ki8BbKsB8NpT':'Q75N7RCr',\n" +
            "    'ZRE25YEF5rzees8P':'',\n" +
            "    'tw3RDcGtQT3mNaiQ':'',\n" +
            "    '6HK8DYhSJXziWxtC':'',\n" +
            "    'pDbG6aHte2b3Q8iG':'7GxakmDpmxz',\n" +
            "    'rhJnmJbyTXefSKcx':'KKfixBstziEJjYj',\n" +
            "    'dABf7twxc7Efmyfm':'RAFBQsSQ8PD',\n" +
            "    'MNDYE4jdKm3zxhF4':'',\n" +
            "    'NAcyx8EyssQ4tazr':'5xNxN6252p7QGT',";


}
