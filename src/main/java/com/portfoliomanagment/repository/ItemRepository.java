package com.portfoliomanagment.repository;

import com.portfoliomanagment.models.item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository  extends CrudRepository<item,Long> {
    List<item> findAll();
}
