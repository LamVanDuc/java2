package doifyourself;

import java.util.Date;

public class Student {
    private int Roll;
    private String name;
    private int age ;
    private float mark;

    public Student(int roll, String name, int age, float mark) {
        this.Roll = roll;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
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

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    @Override
    public String toString(){
        return "Roll : "+getRoll() + " name : "+getName() + " Age : " +getAge() + " Mark : "+getMark() ;
    }
}
