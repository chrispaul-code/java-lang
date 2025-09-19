package test;

public class Test {

    public static void main(String[] args) {
        Car car=new Car(); // Creating a object of the car Class
        car.color="Blue";

        System.out.println(evenOdd(16));




    }

    private static boolean  evenOdd(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }



}



//class & objects
//encapusulation   // binding of data and variables in a single unit  getrs and seters

//polymorphismm   // overloading and overidding

//inheritance  // inheriting properties or methord from child class to parent class

//abstraction  // hinding internal implementation
