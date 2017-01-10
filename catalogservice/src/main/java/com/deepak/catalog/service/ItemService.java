package com.deepak.catalog.service;

import com.deepak.catalog.model.Item;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Deepak Singhvi
 */
public interface ItemService {
  public Collection<Item> getAllItems();

  public Item getItem(String itemId) ;

  public void addItem(Item item);
}
