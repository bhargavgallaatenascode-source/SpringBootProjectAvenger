package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.entity.Avenger;
import com.demo.service.AvengerService;

@RestController
@RequestMapping("/avengers")
public class AvengerController {

    @Autowired
    private AvengerService avengerService;

    @GetMapping("/getAll")
    public List<Avenger> getAllAvengers() {
        return avengerService.getAllAvengers();
    }

    @PostMapping("/add")
    public Avenger addAvenger(@RequestBody Avenger avenger) {
        return avengerService.addAvenger(avenger);
    }

    @GetMapping("/get/{id}")
    public Avenger getAvengerById(@PathVariable int id) {
        return avengerService.getAvengerById(id);
    }

    @PutMapping("/update/{id}")
    public Avenger updateAvenger(@PathVariable int id, @RequestBody Avenger avenger) {
        return avengerService.updateAvenger(id, avenger);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAvenger(@PathVariable int id) {
        return avengerService.deleteAvengerById(id);
    }
}
