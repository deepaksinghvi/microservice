package com.deepak.order.model;

import java.math.BigDecimal;

/**
 * Deepak Singhvi
 */
public class Item {
  private String itemId;
  private String itemName;
  private BigDecimal itemPrice;

  public Item() {

  }
  public Item(String itemId, String itemName, BigDecimal itemPrice) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public BigDecimal getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(BigDecimal itemPrice) {
    this.itemPrice = itemPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Item item = (Item) o;

    return itemId.equals(item.itemId);

  }

  @Override
  public int hashCode() {
    return itemId.hashCode();
  }

  @Override
  public String toString() {
    return "com.deepak.order.model.Item{" +
        "itemId='" + itemId + '\'' +
        ", itemName='" + itemName + '\'' +
        ", itemPrice=" + itemPrice +
        '}';
  }
}
