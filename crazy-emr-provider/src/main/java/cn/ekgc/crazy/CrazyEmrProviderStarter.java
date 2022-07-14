package cn.ekgc.crazy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("cn.ekgc.crazy.dao")
public class CrazyEmrProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(CrazyEmrProviderStarter.class,args);
	}
}
