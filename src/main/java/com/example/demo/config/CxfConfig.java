package com.example.demo.config;

import com.example.demo.service.DemoService;
import com.example.demo.service.impl.DemoServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * 配置并发布
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/7/29 上午11:30
 */
@Configuration
public class CxfConfig {
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/demo/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public DemoService demoService() {
        return new DemoServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), demoService());
        endpoint.publish("/api");
        return endpoint;
    }
}
