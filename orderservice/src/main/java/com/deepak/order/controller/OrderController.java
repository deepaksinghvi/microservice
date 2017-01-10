package com.deepak.order.controller;


import com.deepak.order.model.Item;
import com.deepak.order.client.CatalogClient;
import com.deepak.order.client.UserClient;

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
@RequestMapping("/orderservice/")
public class OrderController {

  @Autowired
  private UserClient userClient;

  @Autowired
  private CatalogClient catalogClient;

  @RequestMapping("/user/{id}")
  public boolean isValidUser(@PathVariable("id") String userId) {
     return null!= userClient.getUser(userId);
  }

  @RequestMapping(value = "/items", method = RequestMethod.GET)
  public Collection<Item> getItemsAvailableForCatalog() {
    return catalogClient.getItems();
  }
}
