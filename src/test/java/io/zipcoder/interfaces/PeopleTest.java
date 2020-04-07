package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PeopleTest {

    Person testInstructor;
    Person testStudent;
    Person testPerson;
    String expectedName;
    People test;

    private static final Logger LOGGER =
            Logger.getLogger((PeopleTest.class.getName()));

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

    @Test
    public void removeAllAndIsEmptyTest(){
        test.add(testStudent);
        test.add(testPerson);
        test.add(testInstructor);

        test.removeAll();

        assertTrue(test.isEmpty());

        assertFalse(test.contains(testStudent));
    }

    @Test
    public void countTest(){
        test.add(testStudent);
        test.add(testPerson);
        test.add(testInstructor);

        test.removeAll();
        Integer expected = 0;
        assertEquals(expected, test.count());
    }

    @Test
    public void countTest2(){
        test.add(testStudent);
        test.add(testPerson);
        test.add(testInstructor);

        Integer expected = 3;
        assertEquals(expected, test.count());
    }

    @Test
    public void toArrayTest(){
        test.add(testStudent);
        test.add(testPerson);
        test.add(testInstructor);
        Person[] expected = new Person[]{testStudent, testPerson, testInstructor};
        Person[] actual = test.toArray();

        for (int i = 0; i < test.count(); i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}