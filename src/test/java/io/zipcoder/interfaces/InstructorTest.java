package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    Instructor testInstructor;
    Student testStudent;
    String expectedName;
    Long expectedId;

    @Before
    public void init(){
        expectedId = 100l;
        expectedName = "bob";
        testInstructor = new Instructor(expectedId, expectedName);
        testStudent = new Student(10l, "ken");
    }

    @Test
    public void implementationTest(){
        assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest(){
        assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void teachTest(){
        testInstructor.teach(testStudent, 10.0);

        Double actual = testStudent.getTotalStudyTime();

        assertEquals(10.0, actual,3);
    }

    @Test
    public void lectureTest(){
        Student han = new Student(1l, "han");
        Student ham = new Student(2l, "ham");
        Student hon = new Student(3l, "hon");
        Student[] stuArry = new Student[]{han, ham, hon};

        testInstructor.lecture(stuArry, 9.0);

        for (int i = 0; i < stuArry.length; i++) {
            assertEquals(3.0, stuArry[i].getTotalStudyTime(), 3);
        }
    }
}