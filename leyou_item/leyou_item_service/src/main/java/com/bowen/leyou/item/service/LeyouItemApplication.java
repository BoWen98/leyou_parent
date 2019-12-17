package com.bowen.leyou.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName: leyou_parent
 * @Package: com.bowen.leyou.item.service
 * @ClassName: LeyouItemApplication
 * @Author: Bowen
 * @Description: 商品
 * @Date: 2019/12/17 22:01
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bowen.leyou.item.service.mapper")
public class LeyouItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemApplication.class, args);
    }
}
