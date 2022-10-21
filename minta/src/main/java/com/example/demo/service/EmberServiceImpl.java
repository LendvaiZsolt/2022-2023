package com.example.demo.service;

import com.example.demo.repository.Ember;
import com.example.demo.repository.EmberRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmberServiceImpl implements EmberService {

    private final EmberRepository emberRepository;

    public EmberServiceImpl(EmberRepository emberRepository) {
        this.emberRepository = emberRepository;
    }

    @Override
    public void register(EmberPO ember) {
        emberRepository.save(ember.toEntity());
    }

    @Override
    public Iterable<EmberPO> getAll() {
        List<EmberPO> rv = new ArrayList<>();
        for (Ember ember : emberRepository.findAll()) {
            rv.add(new EmberPO(ember.getId(), ember.getNeve(), ember.getKor()));
        }
        return rv;
    }


}
