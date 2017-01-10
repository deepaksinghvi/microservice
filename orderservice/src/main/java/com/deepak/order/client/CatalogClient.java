package com.deepak.order.client;

import com.deepak.order.model.Item;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Deepak Singhvi
 */

@FeignClient("catalogservice")
public interface CatalogClient {

  @RequestMapping("/catalogservice/items")
  Collection<Item> getItems();

  @RequestMapping(value = "/catalogservice/item/{id}", method = RequestMethod.GET)
  Item getItem(@PathVariable("id") String itemId);

  @RequestMapping(value = "/catalogservice/addItem", method = RequestMethod.POST)
  void addItem(Item item);
}
