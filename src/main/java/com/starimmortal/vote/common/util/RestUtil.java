package com.starimmortal.vote.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 接口调用工具类
 */
public class RestUtil {

    public String load(String url) throws Exception {
        URL restURL = new URL(url);
        /*
         * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类 的子类HttpURLConnection
         */
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        //请求方式
        conn.setRequestMethod("POST");
        //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
        conn.setDoOutput(true);
        //allowUserInteraction 如果为 true，则在允许用户交互（例如弹出一个验证对话框）的上下文中对此 URL 进行检查。
        conn.setAllowUserInteraction(false);

        BufferedReader bReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line, resultStr = "";

        while ( (line = bReader.readLine())!= null) {
            resultStr += line;
        }
//        System.out.println("3412412---" + resultStr);
        bReader.close();

        return resultStr;

    }

    //测试
    public static void main(String[] args) throws Exception {
        RestUtil restUtil = new RestUtil();
        String resultString = restUtil.load("https://api.weixin.qq.com/sns/jscode2session?appid=wxef2fe548162e3a02&secret=a0880a9a13ad24b5b080e42d943427bd&js_code=061QkIGa1i5hbC0cW6Ia1EUsWk1QkIGb&grant_type=authorization_code");
        System.out.println("resultString:"+resultString);
    }
}