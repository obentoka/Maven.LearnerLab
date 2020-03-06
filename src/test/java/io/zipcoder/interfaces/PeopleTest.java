package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    Person testInstructor;
    Person testStudent;
    Person testPerson;
    String expectedName;
    People test;

    @Before
    public void init(){
        expectedName = "bob";
        testInstructor = new Instructor(1l, expectedName);
        testStudent = new Student(2l, expectedName);
        testPerson = new Person(3l, expectedName);
        test = new People();
    }

    @Test
    public void addTest(){
        test.add(testPerson);

        Person actual = test.findById(3l);

        assertEquals(testPerson, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addTest2(){
        Person actual = test.findById(4l);
    }

    @Test
    public void containsTest(){
        test.add(testPerson);

         assertTrue(test.contains(testPerson));
    }

    @Test
    public void containsTest2(){
        test.add(testPerson);

        assertFalse(test.contains(testInstructor));
    }

    @Test
    public void removeTest(){
        test.add(testStudent);
        test.add(testPerson);

        test.remove(testStudent);

        assertFalse(test.contains(testStudent));
    }

    @Test
    public void removeTest2(){
        test.add(testStudent);
        test.add(testPerson);

        assertFalse(test.remove(testInstructor));
    }

    @Test
    public void removeTest3(){
        test.add(testStudent);
        test.add(testPerson);

        test.remove(2l);

        assertFalse(test.contains(testStudent));
    }

    @Test
    public void removeTest4(){
        test.add(testStudent);
        test.add(testPerson);

        assertFalse(test.remove(1l));
    }
}