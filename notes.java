/* 
Type of conversion

type compatible
destination type -> source type

byte -> short -> int -> float -> long -> double

int to long conversion is possible but long to int conversion is not possible 
it is because int has 4byte and long has 8 byte 

TYPE CASTING (Force to convert)

lose of data 
converting character to number a ->97

Type Promotion in Expressions
a=int , b=float , c=char , e=double
a+b*c/e

java automatically promotes each data type to int when evaluating an expression

if a=int , b f=float, c=long, d = double
ans=a+b+c+d;
ans will be converted to long all a,b,c,d will be converted to long within javabyte 

//wrong
byte b=5;
b=b*2; because this exp is converted into int

//right
byte b=5;
b=(byte)(b*2);

how is code running

(source code).java-> compiler-> (byte code).class -> Java Virtual Machine(JVM) -> Native Code (depending on the machine Mac, windows , linux native code will cgange)

java is called portable language , because in can run on any machine 
Byte code can run on any machine 
c++ is not a potable language 
native code is like machine code 101011 types


FUNCTIONS

retuneType name(){
  //body
  return statement;
}

taking parameter from user

retuneType name(type param1, type param2){
  //body
  return statement;
}





ARRAY

dataType arrayNmae[]=new dataType[size];

directly
int number[]={1,2,3};
String fruits[]={"apple" , "mango" , "orange"}



 
*/
import java.util.*;
public class notes {

    public static void main(String[] args) {

        //type casting
        // float a=37.89f; // loss of data .89
        // int b=(int)a;
        // System.out.println(b);

        // char ch='a';
        // int num=ch;
        // System.out.println(num);

        //type promotion in expresion

        // char a='a';
        // char b='b';
        // System.out.println(b-a);

        // double temp = 99.99;
        // if (temp>100) {
        //     System.out.println("you have fever");
        // }else{
        //     System.out.println("yoi dont have a fever");
        // }
       
        // Scanner sc= new Scanner(System.in);
        // int num=sc.nextInt();
        // switch (num) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tue");
        //     case 3-> System.out.println("Wen");
        //     case 4-> System.out.println("Tus");
        //     case 5-> System.out.println("Fir");
        //     case 6-> System.out.println("Sat");
        //     case 7-> System.out.println("Sun");

        // }

        Scanner sc= new Scanner(System.in);
    // do{
    //     int num=sc.nextInt();
    //     if (num%10==0) {
    //            continue;
    //     }
    //     // System.out.println(num);
    // }while(true);

     int num=sc.nextInt();
     int count=1;

    for (int i = 0; i < num-1; i++) {
        
        count=count*(num-i);

    }
    System.out.println(count);




    }
    
}

