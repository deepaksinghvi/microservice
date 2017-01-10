package com.deepak.user.controller;

import com.deepak.user.model.User;
import com.deepak.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Deepak Singhvi
 */

@RestController
@RequestMapping("/userservice/")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping({"/users"})
  public Collection<User> getUsers() {
    return userService.getUsers();
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable("id") String userId) {
    return userService.getUser(userId);
  }

  @RequestMapping(value = "/adduser", method = RequestMethod.POST)
  public void addUser(User user) {
    userService.addUser(user);
  }
}
