package br.com.mrb.service;

import br.com.mrb.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    Person p ;
    IPersonService service;

    @BeforeEach
    void setup(){
        p = new Person("Keith","Moon","kmoon@teste.com.br", "Wembley - UK", "Male");
        service = new PersonService();
    }

    @DisplayName("WHen Create a Person with Scucces Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPerson(){

        //Given / Arrange


        //When / Act
        var actual = service.createPerson(p);

        //Then / Assert
        assertNotNull(actual,() -> "The createPerson() should not have returned null");
    }

    @DisplayName("WHen Create a Person with Scucces Should Contains First Name in Returned a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldCotainsFirstNameInReturnedPersonObject(){

        //Given / Arrange


        //When / Act
        var actual = service.createPerson(p);

        //Then / Assert
        assertNotNull(actual,() -> "The createPerson() should not have returned null");
        assertNotNull(p.getId(),() -> "The Person Id is missing");
        assertEquals(p.getFirstName(),actual.getFirstName(),() ->"The first name is diferent");
        assertEquals(p.getLastName(),actual.getLastName(),() ->"The last name is diferent");
        assertEquals(p.getEmail(),actual.getEmail(),() ->"The e-mail is diferent");
        assertEquals(p.getGender(),actual.getGender(),() ->"The gender is diferent");
        assertEquals(p.getAddress(),actual.getAddress(),() ->"The address is diferent");


    }

    @DisplayName("When Create a Person with null e-Mail Should throw Exception")
    @Test
    void testCreatePerson_WhithNullEMail_ShouldThrowIllegalArgumentException() {

        //Given / Arrange
        p.setEmail(null);

        var expectedMessage = "The Person e-Mail is null or empty!";

        //When / Act && Then / Assert
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.createPerson(p),
                () -> "Empty e-mail should have cause an IllegalArgumentException");


        // Then / Assert
        assertEquals(
                expectedMessage,
                exception.getMessage(),
                () -> "Exception error message is incorrect!");

    }

}
