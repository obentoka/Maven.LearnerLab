package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPerson {

    Long expectedId;
    String expectedName;
    Person test;

    @Before
    public void init(){
        expectedId = 100l;
        expectedName = "bob";
        test = new Person(expectedId, expectedName);
    }

    @Test
    public void constructorTest(){
        Long actualId = test.getId();
        String actualName = test.getName();

        assertEquals(expectedId, actualId);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        String expected = "erin";
        test.setName(expected);

        String actual = test.getName();

        assertEquals(expected, actual);
    }

}
