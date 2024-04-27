package com.portfoliomanagment.service.impl;

import com.portfoliomanagment.models.Item;
import com.portfoliomanagment.models.Position;
import com.portfoliomanagment.repository.ItemRepository;
import com.portfoliomanagment.repository.PositionRepository;
import com.portfoliomanagment.service.PositionService;
import com.portfoliomanagment.service.itemservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;
    public List<Position> getPosition(){
        return positionRepository.findAll();
    }
}
