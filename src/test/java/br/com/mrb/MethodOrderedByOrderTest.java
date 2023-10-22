package br.com.mrb;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    @Test
    @Order(0)
    void testC(){
        System.out.println("Running Teste C");
    }

    @Test
    @Order(1)
    void testD(){
        System.out.println("Running Teste D");
    }
    @Test
    @Order(2)
    void testA(){
        System.out.println("Running Teste A");
    }

    @Test
    @Order(3)
    void testB(){
        System.out.println("Running Teste B");
    }


}
