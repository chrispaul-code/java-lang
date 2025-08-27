// package OOPSJava;


class Student{
    String name;
    int age;

    // when same fuction have diffrent 
    // implementation it is called polymorphism

    public void printInfo(String name){
       System.out.println(name);   
    }

    public void printInfo(int age){
        System.out.println(name);   
     }

     public void printInfo(String name, int age){
        System.out.println(name);   
     }         
}
public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="chris";
        s1.age=24;
        s1.printInfo(s1.name, s1.age);
    }
}


 The Inheritance is a process of obtaining the data 
 members and methods from one class to another class, 
plus can have its own is known as inheritance

class Shape{         //Base class or parent Class
    String color;
}

class Triangle extends Shape{   //Sub class or Child class

}


Abstraction means hiding lower-level details 
and exposing only the essential and 
relevant details to the users.

abstract class Animal{
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 Legs");
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();;
        
    }
}
