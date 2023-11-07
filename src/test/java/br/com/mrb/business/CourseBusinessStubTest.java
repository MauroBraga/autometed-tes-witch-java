package br.com.mrb.business;

import br.com.mrb.service.CourseService;
import br.com.mrb.stubs.CourseServiceStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseBusinessStubTest {


    @Test
    void testCourseRelatedToSpring_When_UsingAStub(){

        //Given/Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
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
