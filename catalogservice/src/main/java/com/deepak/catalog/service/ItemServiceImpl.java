package com.deepak.catalog.service;

import com.deepak.catalog.model.Item;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Deepak Singhvi
 */
@Repository
public class ItemServiceImpl implements ItemService{
  private Collection<Item> itemsCache = new ArrayList<Item>();

  public ItemServiceImpl(){
    itemsCache.add(new Item("I001","iPhone6",new BigDecimal("400.0")));
    itemsCache.add(new Item("I002","Laptop123",new BigDecimal("510.0")));
    itemsCache.add(new Item("I003","Cable",new BigDecimal("20.0")));
    itemsCache.add(new Item("I004","RPi",new BigDecimal("100.0")));
  }
  @Override
  public Collection<Item> getAllItems() {
    return itemsCache;
  }

  @Override
  public Item getItem(String itemId) {
    for (Item item: itemsCache) {
      if(item.getItemId().equalsIgnoreCase(itemId)){
        return item;
      }
    }
    return null;
  }

  @Override
  public void addItem(Item item) {
    itemsCache.add(item);
  }
}
