package com.example.babycareco225;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabyTest {

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getAge() {

        Baby b=new Baby("a001",02,"Karan",100,12);
    assertEquals(100,b.getAge());

        Baby b1=new Baby("a001",02,"Karan",100,12);
        assertEquals(100,b1.getHeight());
    }

    @Test
    void setAge() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void setHeight() {
    }

    @Test
    void getWeight() {
    }

    @Test
    void setWeight() {
    }

    @Test
    void getDateofBirth() {
    }

    @Test
    void setDateofBirth() {
    }
}