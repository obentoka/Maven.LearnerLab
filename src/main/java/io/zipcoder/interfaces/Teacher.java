package io.zipcoder.interfaces;

public interface Teacher {
    void teach(Learner learner, double numOfHours);

    void lecture(Learner[] learners, double numOfHours);
}
