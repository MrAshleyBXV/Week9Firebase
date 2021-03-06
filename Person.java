package com.example.lmadmin.week9_firebase;


public class Person {

    private String name;
    private int age;
    private boolean gradHS;

    public Person() {
    }

    public Person(String name, int age, boolean gradHS) {
        this.name = name;
        this.age = age;
        this.gradHS = gradHS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGradHS() {
        return gradHS;
    }

    public void setGradHS(boolean gradHS) {
        this.gradHS = gradHS;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradHS=" + gradHS +
                '}';
    }
}
