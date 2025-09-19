package test;

public class Car extends  Vehicals {  // Createing a Blueprint
    String color;   // variables or properties

    String brand;

    String model;

    int year;

     private int speed;

     public void setSpeed(int speed){
         this.speed=speed;
     }

     public int getSpeed(){
         return speed;
     }

    public void accelerate(int increment){   // methods
        speed+= increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed<0){
            speed=0;

        }
    }

    public  void  start(){
        System.out.println("brm brm");
    }

}
