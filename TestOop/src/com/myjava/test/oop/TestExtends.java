package com.myjava.test.oop;

public class TestExtends {
    public void main(String[] args) {
        Student s1 = new Student("dayu", 180, "DATD analyze");
    }
class Person{
        String name;
        int height;
        public void rest(){
            System.out.println("rest!");
        }
}

class Student extends Person{

        String major;
        public void study(){
            System.out.println("Study!!!");
            rest();
            System.out.println(this.name);
        }

        public Student(String name,int height,String major){
            this.name=name;
            this.height=height;
            this.major=major;
        }
}


}
