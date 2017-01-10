package com.deepak.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Deepak Singhvi
 */

//@ComponentScan
//@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class UserApplication
{
  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class, args);
  }
}
