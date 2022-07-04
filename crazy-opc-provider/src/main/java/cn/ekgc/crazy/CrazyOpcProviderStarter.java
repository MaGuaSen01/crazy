package cn.ekgc.crazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CrazyOpcProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(CrazyOpcProviderStarter.class, args);
	}
}
