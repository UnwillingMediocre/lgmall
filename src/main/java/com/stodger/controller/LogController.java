package com.stodger.controller;

import com.stodger.pojo.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: lgmall
 * @description: 用户登录
 * @author: Stodger==
 * @create: 2019-03-27 19:27
 * @Version: 1.0
 **/
@RequestMapping(value = "/user")
public class LogController {

    private static final Logger logger = LogManager.getLogger(LogController.class);

    /**
    * @Description: 用户登录校验
    * @Param: []
    * @return: void
    * @Author: Stodger
    * @Date: 2019/3/29
    */
   @RequestMapping(value = "/login.action")
   public void login(){
       logger.debug("debug");
       logger.debug("error");
   }

   /**
   * @Description: 用户名校验
   * @Param: []
   * @return: java.lang.String
   * @Author: Stodger
   * @Date: 2019/3/29
   */
   @RequestMapping(value = "/usernameCode.action")
   @ResponseBody
   public String usernameCode(){


       logger.debug("debug");
       logger.debug("error");
       return "OK";
   }
   /**
   * @Description: 用户注册
   * @Param: []
   * @return: void
   * @Author: Stodger
   * @Date: 2019/3/29
   */
   @RequestMapping(value = "/register.action")
   @ResponseBody
   public String register(User user){

       return "OK";
   }

}