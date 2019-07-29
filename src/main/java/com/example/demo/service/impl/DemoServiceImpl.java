package com.example.demo.service.impl;

import com.example.demo.service.DemoService;

import java.util.Date;

/**
 * 实现webservice的方法
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/7/29 上午11:29
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String user) {
        return user + ":hello" + "(" + new Date() + ")";
    }
}
