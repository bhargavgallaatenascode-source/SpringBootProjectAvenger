package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.demo.entity.Avenger;

@Service
public class AvengerService {

    List<Avenger> avengers = new ArrayList<>();

    public AvengerService() {
        avengers.add(new Avenger(1, "Iron Man", "Tech Genius", 95));
        avengers.add(new Avenger(2, "Captain America", "Super Soldier", 90));
        avengers.add(new Avenger(3, "Thor", "God of Thunder", 100));
        avengers.add(new Avenger(4, "Hulk", "Gamma Strength", 99));
        avengers.add(new Avenger(5, "Black Widow", "Espionage Expert", 85));
    }

    public List<Avenger> getAllAvengers() {
        return avengers;
    }

    public Avenger addAvenger(Avenger avenger) {
        avengers.add(avenger);
        return avenger;
    }

    public Avenger getAvengerById(int id) {
        for (Avenger a : avengers) {
            if (a.getAvengerId() == id) {
                return a;
            }
        }
        return new Avenger();
    }

    public Avenger updateAvenger(int id, Avenger updatedAvenger) {
        for (Avenger avenger : avengers) {
            if (avenger.getAvengerId() == id) {
                avenger.setAvengerName(updatedAvenger.getAvengerName());
                avenger.setPower(updatedAvenger.getPower());
                avenger.setStrengthLevel(updatedAvenger.getStrengthLevel());
                return avenger;
            }
        }
        return new Avenger();
    }

    public String deleteAvengerById(int id) {
        boolean removed = avengers.removeIf(a -> a.getAvengerId() == id);
        return removed ? "Avenger retired successfully: " + id
                       : "Avenger not found with id: " + id;
    }
}
