package cn.ekgc.crazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>系统消费者启动类</b>
 *
 * @author ASUS
 * @data 2022/7/5
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CrazySystemConsumerStarter {
    public static void main(String[] args) {
        SpringApplication.run(CrazySystemConsumerStarter.class, args);
    }
}

