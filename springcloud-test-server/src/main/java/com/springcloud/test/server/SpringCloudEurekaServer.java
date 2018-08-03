/**
 * 
 */
package com.springcloud.test.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangping
 * 2018年8月1日
 */

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringCloudEurekaServer {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServer.class, args);
	}
}
