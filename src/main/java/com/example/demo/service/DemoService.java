package com.example.demo.service;

import javax.jws.WebService;

/**
 * 提供webservice接口
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/7/29 上午11:21
 */
@WebService
public interface DemoService {
    /**
     * 打印hello
     *
     * @param user 用户名
     * @return 响应结果
     */
    String sayHello(String user);
}
