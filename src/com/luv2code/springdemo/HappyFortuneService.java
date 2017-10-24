package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

    List<String> data = new ArrayList<>();

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        data.add("7 is your lucky number");
        data.add("You will be cursed forever, but you are use to it.");
        data.add("One million dollars will be yours!");
        data.add("You will meet a love interest tomorrow.");
        data.add("You will eat something delicious tonight");
        data.add("Hey now, you're an allstar!");

        int index = myRandom.nextInt(data.size());

        String theFortune = data.get(index);

        return theFortune;
    }
}
