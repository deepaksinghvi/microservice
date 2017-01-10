package com.deepak.proxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

/**
 * Deepak Singhvi
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
public class ProxyServer {

    public static void main(String args[]) {

        SpringApplication.run(ProxyServer.class, args);
    }
}
