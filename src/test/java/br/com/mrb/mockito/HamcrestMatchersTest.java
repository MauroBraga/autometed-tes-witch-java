package br.com.mrb.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.LessThan;

import static  org.hamcrest.MatcherAssert.*;
import static  org.hamcrest.Matchers.*;

import java.util.Arrays;

public class HamcrestMatchersTest {

    @Test
    void testHamcrestMatchersTest(){
        //Given
        var scores = Arrays.asList(99,100,101,105);

        //WHen e THen
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(100,101));
        assertThat(scores, everyItem(greaterThan(98)));
        assertThat(scores, everyItem(lessThan(106)));

        //Check Strings
        assertThat("",isEmptyString());
        assertThat(null, is(emptyOrNullString()));

        //Arrays
        Integer[] myArray = {1,2,3};
        assertThat(myArray, arrayWithSize(3));
        assertThat(myArray,arrayContaining(1,2,3));
        assertThat(myArray,arrayContainingInAnyOrder(3,2,1));
    }
}
