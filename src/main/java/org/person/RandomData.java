package org.person;

import java.lang.String;
import java.lang.Math;
import java.util.Random;
import java.lang.Character;

import static java.lang.Character.toUpperCase;

public class RandomData {
    public RandomData(){

    }
    public String randomDNI(){

        int randomNumber = (int) (Math.random() * 10000000);
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');

        return (randomNumber + "-" + toUpperCase(randomChar));
    }
}
