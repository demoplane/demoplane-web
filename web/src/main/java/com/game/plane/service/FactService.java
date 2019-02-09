package com.game.plane.service;

import com.game.plane.entity.Fact;
import com.game.plane.repository.FactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactService {

    @Autowired
    private FactRepository factRepository;

    public void insert(Fact fact) {
        factRepository.save(fact);
    }
}
