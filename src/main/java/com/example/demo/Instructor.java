package com.example.demo;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

            double count = 0;
            for (Learner b : learners) {
                count++;
            }

            double numberOfHoursPerLearner = numberOfHours / count;

            for (Learner a : learners) {
                a.learn(numberOfHoursPerLearner);
            }

    }
    
}
