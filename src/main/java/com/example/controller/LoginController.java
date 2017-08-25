package com.example.controller;

import com.example.utils.AuthUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by dell on 2017/8/25.
 */
@Controller
public class LoginController {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }

    //映射一个action
    @RequestMapping("/login")
    public void login(HttpServletResponse response) throws IOException {
        //输出日志文件
        String url = "https://open.weixin.qq.com/connect/qrconnect?" +
                "appid=" + AuthUtil.APP_ID +
                "&redirect_uri=" + URLEncoder.encode("http://localhost:8090/index") +
                "&response_type=code" +
                "&scope=snsapi_login" +
                "&state=STATE#wechat_redirect";
        logger.info("登录请求。。。");
        response.sendRedirect(url);
    }

}
