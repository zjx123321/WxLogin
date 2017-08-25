package com.example.utils;

import com.example.controller.LoginController;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by dell on 2017/8/25.
 */
public class AuthUtil {

    public static final String APP_ID = "wxf9f1c0fdc636bdd9";

    private static final Logger logger = LoggerFactory.getLogger(AuthUtil.class);

    public static void doGet(String url) {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        try {
            int statusCode = client.executeMethod(method);
            logger.info("返回状态码：" + statusCode);
            method.releaseConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
