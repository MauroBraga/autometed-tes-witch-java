package br.com.mrb;

import br.com.mrb.model.Person;
import br.com.mrb.service.IPersonService;
import br.com.mrb.service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {


    @DisplayName("WHen Create a Person with Scucces Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPerson(){

        //Given / Arrange
        IPersonService service = new PersonService();
        var p = new Person("Keith","Moon","kmoon@teste.com.br", "Wembley - UK", "Male");

        //When / Act
        var actual = service.createPerson(p);

        //Then / Assert
        assertNotNull(actual,() -> "The createPerson() should not have returned null");
    }

}
