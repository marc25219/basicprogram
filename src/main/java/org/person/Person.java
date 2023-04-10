package org.person;

public class Person {

    String DNI;
    String name;
    String surname;
    int phone;
    int age;


    public Person(String DNI, String name, String surname, int phone, int age){
        setDNI(DNI);
        setName(name);
        setSurname(surname);
        setPhone(phone);
        setAge(age);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
