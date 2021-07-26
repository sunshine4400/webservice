package org.example.service;

import javax.jws.WebService;

/**
 * 对外发布的接口
 */

@WebService
public interface HelloService {
    String sayHello(String msg);

    /**
     * 对外发布服务的接口的方法
     */

}
