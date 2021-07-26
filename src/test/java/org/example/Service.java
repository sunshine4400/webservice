package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.example.service.impl.HelloServiceImp;

public class Service {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //设置webservice服务地址
        factory.setAddress("http://localhost:9000/ws/hello");

        //设置服务类
        factory.setServiceBean(new HelloServiceImp());

        //发布服务
        factory.create();

        System.out.println("发布服务成功，端口为：9000 ");
    }
}
