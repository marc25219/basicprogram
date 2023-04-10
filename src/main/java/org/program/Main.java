package org.program;

import org.person.Person;
import org.person.RandomData;

public class Main {
    public static void main(String[] args) {

        RandomData random = new RandomData();

        Person person = new Person("77408564-E", "Pepe", "Garcia", 656565655, 35);
        Person person1 = new Person(random.randomDNI(), "Pepe", "Garcia", 656565655, 35);

        System.out.println("Esta persona tiene Edad:" + person.getAge());
        System.out.println("Esta persona tiene Edad:" + person1.getDNI());
    }
}