package com.example.demo.service;

public interface EmberService {
    void register(EmberPO ember);

    Iterable<EmberPO> getAll();
}
