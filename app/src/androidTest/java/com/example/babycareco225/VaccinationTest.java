package com.example.babycareco225;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VaccinationTest {

    @Test
    void getName() {

        Vaccination v= new Vaccination("Polio","2 months");
        assertEquals("Polio",v.getName());
        assertEquals("Polio",v.getName());

        assertEquals("Polio",v.getName());

        assertEquals("Polio",v.getName());

    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {

    }


    @Test
    void setAge() {
    }
}