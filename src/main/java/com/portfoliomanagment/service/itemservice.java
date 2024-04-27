
package com.portfoliomanagment.service;


import com.portfoliomanagment.models.Item;

import java.util.List;

public interface itemservice {
       public  List<Item> getAllItems();

       public Item saveItem(Item itemData);

       public Item findByItemId(Long itemid);
}
