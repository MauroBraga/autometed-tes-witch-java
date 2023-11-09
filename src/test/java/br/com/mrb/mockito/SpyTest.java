package br.com.mrb.mockito;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    void testV1(){
        //Given / Arrange
        var mockArrayList = spy(ArrayList.class);

        //When / Act & Then / Assert
        assertEquals(0, mockArrayList.size());

        when(mockArrayList.size()).thenReturn(5);
        mockArrayList.add("Foo-Bar");
        assertEquals(5, mockArrayList.size());
    }

    @Test
    void testV2(){
        //Given / Arrange
        var spyMockArrayList = spy(ArrayList.class);

        //When / Act & Then / Assert
        assertEquals(0, spyMockArrayList.size());

        spyMockArrayList.add("Foo-Bar");
        assertEquals(1, spyMockArrayList.size());

        spyMockArrayList.remove("Foo-Bar");
        assertEquals(0, spyMockArrayList.size());
    }

    @Test
    void testV3(){
        //Given / Arrange
        //spy é um mock parcial
        //código legado
        var spyMockArrayList = spy(ArrayList.class);

        //When / Act & Then / Assert
        when(spyMockArrayList.size()).thenReturn(5);
        spyMockArrayList.add("Foo-Bar");
        assertEquals(5, spyMockArrayList.size());
    }

    @Test
    void testV4(){
        //Given / Arrange
        //spy é um mock parcial
        //código legado
        var spyMockArrayList = spy(ArrayList.class);
        spyMockArrayList.add("Foo-Bar");
        verify(spyMockArrayList).add("Foo-Bar");
        verify(spyMockArrayList, never()).remove("Foo-Bar");
        verify(spyMockArrayList, never()).remove(anyString());
        verify(spyMockArrayList, never()).clear();
    }
}
