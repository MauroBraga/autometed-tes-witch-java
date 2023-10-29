package br.com.mrb.ordenacao;

import org.junit.jupiter.api.*;

//@Order(1)

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    StringBuilder builder = new StringBuilder();

    @AfterEach
    public void  afterEach(){
        System.out.println("The actual value is: " + builder);
    }

    @Test
    @Order(0)
    void testC(){
        builder.append("1");
        System.out.println("Running Teste C");
    }

    @Test
    @Order(1)
    void testD(){
        builder.append("2");
        System.out.println("Running Teste D");
    }
    @Test
    @Order(2)
    void testA(){
        builder.append("3");
        System.out.println("Running Teste A");
    }

    @Test
    @Order(3)
    void testB(){
        builder.append("4");
        System.out.println("Running Teste B");
    }


}
