package com.example.demo.controller;

import com.example.demo.controller.dto.EmberCreateDTO;
import com.example.demo.controller.dto.EmberDTO;
import com.example.demo.service.EmberPO;
import com.example.demo.service.EmberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmberController {

    private final EmberService emberService;

    public EmberController(EmberService emberService) {
        this.emberService = emberService;
    }

    @PostMapping("/ember")
    public void register(@Valid @RequestBody EmberCreateDTO ember) {
        emberService.register(ember.toPO());
    }

    @GetMapping("/ember")
    public Iterable<EmberPO> all() {
        return emberService.getAll();
    }
}
