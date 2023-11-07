package br.com.mrb.business;

import br.com.mrb.service.CourseService;
import br.com.mrb.stubs.CourseServiceStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CourseBusinessMockTest {

    CourseService mockService;
    CourseBusiness business;
    List<String> courses =null;
    @BeforeEach
    public void setup(){
        //Given/Arrange
        mockService = mock(CourseService.class);
        business= new CourseBusiness(mockService);
        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
        );
    }

    @Test
    void testCourseRelatedToSpring_When_UsingAStub(){
        //Given/Arrange

        when(mockService.retrieveCourses("Leandro")).thenReturn(courses);

        //When/Act
        var filteredCourses =  business.retriveCoursesRelatedToSpring("Leandro");

        //Then/Assert
        Assertions.assertEquals(4, filteredCourses.size());
    }

    @Test
    void testCourseRelatedToSpring_When_UsingFoorBarStudent(){

        //Given/Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        //When/Act
        var filteredCourses =  business.retriveCoursesRelatedToSpring("Foo Bar");

        //Then/Assert
        Assertions.assertEquals(0, filteredCourses.size());
    }
}
