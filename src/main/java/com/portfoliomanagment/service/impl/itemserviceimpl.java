package com.portfoliomanagment.service.impl;

import com.portfoliomanagment.models.item;
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
    public List<item> getAllItems(){
        return itemRepository.findAll();
    }
    public item saveItem(item itemData){
       return itemRepository.save(itemData);
    }
    public  item findByItemId(Long itemid){
        Optional<item> itemOptional=itemRepository.findById(itemid);
        if(itemOptional.isEmpty()){
            return  null;
        }
        else{
            return  itemOptional.get();
        }
    }
}
