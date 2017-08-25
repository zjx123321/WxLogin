package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2017/8/25.
 */
@Controller
public class LoginController {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //映射一个action
    @RequestMapping("/login")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }

}
