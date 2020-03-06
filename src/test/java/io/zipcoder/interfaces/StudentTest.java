package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student test;
    String expectedName;
    Long expectedId;

    @Before
    public void init(){
        expectedId = 100l;
        expectedName = "bob";
        test = new Student(expectedId, expectedName);
    }

    @Test
    public void implementationTest(){
        assertTrue(test instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        assertTrue(test instanceof Person);
    }

    @Test
    public void learnTest(){
        Double expected = 10.0;

        test.learn(10.0);

        Double actual = test.getTotalStudyTime();

        assertEquals(expected, actual);
    }
}