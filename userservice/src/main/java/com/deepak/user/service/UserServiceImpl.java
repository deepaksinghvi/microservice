package com.deepak.user.service;

import com.deepak.user.model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Deepak Singhvi
 */

@Repository
public class UserServiceImpl implements UserService {
  private Collection<User> itemsCache = new ArrayList<User>();

  public UserServiceImpl(){
    itemsCache.add(new User("ds","Deepak","Singhvi"));
  }
  public Collection<User> getUsers() {
    return itemsCache;
  }

  public User getUser(String userId) {
    for (User item: itemsCache) {
      if(item.getEmailId().equalsIgnoreCase(userId)){
        return item;
      }
    }
    return null;
  }

  public void addUser(User user) {
    itemsCache.add(user);
  }

  public boolean removeUser(String userId){
    return itemsCache.remove(userId);
  }
}
