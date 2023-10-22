package br.com.mrb;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running Teste A");
    }

    @Test
    void testB(){
        System.out.println("Running Teste B");
    }

    @Test
    void testC(){
        System.out.println("Running Teste C");
    }

    @Test
    void testD(){
        System.out.println("Running Teste D");
    }
}
