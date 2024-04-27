
package com.portfoliomanagment.service;


import com.portfoliomanagment.models.item;

import java.util.List;

public interface itemservice {
       public  List<item> getAllItems();

       public item saveItem(item itemData);

       public  item findByItemId(Long itemid);
}
