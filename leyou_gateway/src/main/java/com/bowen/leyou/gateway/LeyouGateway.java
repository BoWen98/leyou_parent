package com.bowen.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ProjectName: leyou_parent
 * @Package: com.bowen.leyou.gateway
 * @ClassName: LeyouGateway
 * @Author: Bowen
 * @Description: 网关接口
 * @Date: 2019/12/17 20:07
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGateway {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGateway.class, args);
    }
}
