package com.finki.pizzaslice.services;

import com.finki.pizzaslice.models.Extra;
import com.finki.pizzaslice.repos.ExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraService {

    private final ExtraRepository extraRepository;

    @Autowired
    public ExtraService(ExtraRepository extraRepository){
        this.extraRepository = extraRepository;
    }

    public List<Extra> getAllExtras(){
        return extraRepository.findAll();
    }

    // no need for this shit
    public List<Extra> getExtrasForPizza(Long id){
        return null;
    }

}
