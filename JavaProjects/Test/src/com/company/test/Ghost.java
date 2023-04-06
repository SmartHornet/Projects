package com.company.test;

public class Ghost {
    private double age;
    private boolean isFly;

    public Ghost(double age, boolean isFly) {
        this.age = age;
        this.isFly = isFly;
    }

    public String say(){
        return "Бу!";
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    @Override
    public String toString() {
        return "Ghost{" +
                "age=" + age +
                ", isFly=" + isFly +
                '}';
    }
}
