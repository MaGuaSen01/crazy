package cn.ekgc.crazy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>系统生产者启动类</b>
 *
 * @author ASUS
 * @data 2022/7/5
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("cn.ekgc.crazy.*.*.dao")
public class CrazySystemProviderStarter {
    public static void main(String[] args) {
        SpringApplication.run(CrazySystemProviderStarter.class, args);
    }
}
