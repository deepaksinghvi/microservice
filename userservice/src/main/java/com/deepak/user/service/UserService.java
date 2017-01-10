package com.deepak.user.service;

import com.deepak.user.model.User;

import java.util.Collection;

/**
 * Deepak Singhvi
 */

public interface UserService {
  public Collection<User> getUsers();

  public User getUser(String userId) ;

  public void addUser(User user);

  public boolean removeUser(String userId);
}
