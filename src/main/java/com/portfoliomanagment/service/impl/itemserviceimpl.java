package com.portfoliomanagment.service.impl;

import com.portfoliomanagment.models.Item;
import com.portfoliomanagment.repository.ItemRepository;
import com.portfoliomanagment.service.itemservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class itemserviceimpl implements itemservice {

    @Autowired
    ItemRepository itemRepository;
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public Item saveItem(Item itemData){
       return itemRepository.save(itemData);
    }
    public Item findByItemId(Long itemid){
        Optional<Item> itemOptional=itemRepository.findById(itemid);
        if(itemOptional.isEmpty()){
            return  null;
        }
        else{
            return  itemOptional.get();
        }
    }
}
