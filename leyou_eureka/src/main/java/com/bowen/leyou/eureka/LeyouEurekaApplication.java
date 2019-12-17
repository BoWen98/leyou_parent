package com.bowen.leyou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: leyou_parent
 * @Package: com.bowen.leyou.eureka
 * @ClassName: LeyouEurekaApplication
 * @Author: Bowen
 * @Description: 注册中心
 * @Date: 2019/12/17 18:11
 * @Version: 1.0.0
 */

@SpringBootApplication
@EnableEurekaServer
public class LeyouEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouEurekaApplication.class, args);
    }
}
