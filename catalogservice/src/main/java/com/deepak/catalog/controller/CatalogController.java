package com.deepak.catalog.controller;

import com.deepak.catalog.model.Item;
import com.deepak.catalog.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/catalogservice/")
/**
 * Deepak Singhvi
 */
public class CatalogController {

  @Autowired
  private ItemService itemService;

  @RequestMapping(value = "/items", method = RequestMethod.GET)
  public Collection<Item> getItems() {

    return itemService.getAllItems();
  }

  @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
  public Item getItem(@PathVariable("id") String itemId) {
    return itemService.getItem(itemId);
  }

  @RequestMapping(value = "/addItem", method = RequestMethod.POST)
  public void addItem(Item item) {
    itemService.addItem(item);
  }
}
