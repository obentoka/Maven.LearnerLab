package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numOfHours) {
        learner.learn(numOfHours);
    }

    public void lecture(Learner[] learners, double numOfHours) {
        double numberOfHoursPerLearner = numOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
