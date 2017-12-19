package com.zhegu.service.ctrl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RefreshScope
@RestController
public class BimServiceController {

//    @Value("${msg}")
//    private String msg;
//
////    @Value("${info}")
////    private String info;
//
//    @RequestMapping(value = "/msg" ,method = RequestMethod.GET)
//    public String msg() {
//        System.out.println("msg provider1");
//        return this.msg;
//    }

    @RequestMapping(value = "/ttt" ,method = RequestMethod.GET)
    public String ttt() {
        System.out.println("provider1");
        return "provider1";
    }


}
