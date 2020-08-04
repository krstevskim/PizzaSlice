package com.finki.pizzaslice.controllers;

import com.finki.pizzaslice.models.Extra;
import com.finki.pizzaslice.services.ExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/extras")
public class ExtraController {

    private final ExtraService extraService;

    @Autowired
    public ExtraController(ExtraService extraService) {
        this.extraService = extraService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Extra>> getAll(){
        return ResponseEntity.ok(extraService.getAllExtras());
    }
}
