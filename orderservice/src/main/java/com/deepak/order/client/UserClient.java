package com.deepak.order.client;

import com.deepak.order.model.User;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created by i333127 on 01/01/17.
 */
@FeignClient("userservice")
public interface UserClient {
  @RequestMapping("/userservice/users")
  Collection<User> getUsers();

  @RequestMapping(value = "/userservice/user/{id}", method = RequestMethod.GET)
  User getUser(@PathVariable("id") String userId) ;

  @RequestMapping(value = "/userservice/adduser", method = RequestMethod.POST)
  void addUser(User user);
}
