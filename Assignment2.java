import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

//1. Write a program to take student details as input and display the result
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=scanner.nextLine();

        System.out.print("Enter Your Address: ");
        String address=scanner.nextLine();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}


//2. Write a program to calculate sum of four numbers taking user input
class Second {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.print("Enter a number :");
        int num1= number.nextInt();

        System.out.print("Enter a number :");
        int num2= number.nextInt();

        System.out.print("Enter a number :");
        int num3= number.nextInt();

        System.out.print("Enter a number :");
        int num4= number.nextInt();

        int total=num1+num2+num3+num4;
        System.out.println("Your total will be "+total);
    }
}

//3. Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class Third {
    public static void main(String[] args) {
        Scanner mark= new Scanner(System.in);
        System.out.println("Enter your Architecture mark: ");
        int Architecture=mark.nextInt();

        System.out.println("Enter your OOP marks:");
        int OOP=mark.nextInt();

        System.out.println("Enter your Database marks: ");
        int Database=mark.nextInt();

        System.out.println("Enter your Business marks: ");
        int Business=mark.nextInt();

        int total=Architecture+OOP+Database+Business;
        int per=(total*100)/400;

        if (per >= 80) {
            System.out.print("A");
        } else if (per >= 60 && per < 80) {
            System.out.print("B");
        } else if (per >= 40 && per < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}

//4.Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results.

class FourthandFifth{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1= number.nextInt();

        System.out.print("Enter a number: ");
        int num2=number.nextInt();

        int sum=num1+num2;
        int product =num1*num2;

        System.out.println("Total sum of the given integer is " +sum+ " and product is "+product);
        int sum2=sum+product;
        int product2=sum*product;

        System.out.println("Sum :" +sum2+ " Product: " +product2);
    }
}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type
//       casted to int.
class Six{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("The area is: " + (int) area);
    }
}


//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//       my name is xyz and my roll number is xyz. My field of interest are xyz.
class Seven {
    public static void main(String[] args) {
        Scanner info=new Scanner(System.in);

        System.out.println("Name: ");
        String name=info.nextLine();

        System.out.println("Roll number: ");
        int roll=info.nextInt();

        System.out.println("Field of interest: ");
        String interest=info.nextLine();

        System.out.println("My name is "+name+" and my roll number is "+roll+". My field of intrest are "+interest+".");


    }
}

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
  //      of triangle and Volume of Cube and Cuboid. Take the attributes as user input

class Eight {
    public static void main(String[] args) {
        // LSA = Lateral Surface Area of a Cube, SA = Surface Area
        float length, width, height, SA, Volume, LSA;
        Scanner sc=new Scanner(System.in);

        System.out.print("Please Enter the Length of a Cuboid : ");
        length = sc.nextFloat();
        System.out.print("Please Enter the Width of a Cuboid : ");
        width = sc.nextFloat();
        System.out.print("Please Enter the Height of a Cuboid : ");
        height = sc.nextFloat();

        SA = 2 * (length * width + length * height + width * height);
        Volume = length * width * height;
        LSA = 2 * height * (length + width);

        System.out.println("The Surface area of a Cuboid ="+SA);
        System.out.println("The Volume of a Cuboid = "+Volume);
        System.out.println("The Lateral Surface area of a Cuboid = "+LSA);
    }
}

//9.Write a program to find square of a number.
//        E.g.- INPUT : 2 OUTPUT : 4
 //       INPUT : 5 OUTPUT : 25

class Nine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        int square=number*number;
        System.out.println("Square of given number is "+square+".");
    }
}

//10. Take two different string input and print them in same line. E.g.-
  //      INPUT : Codes
    //    Dope
      //  OUTPUT : CodesDope
class Ten{
    public static void main(String[] args) {
        Scanner word=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String first=word.nextLine();
        System.out.print("Enter a word: ");
        String second=word.nextLine();
        System.out.println(first+""+second);
    }
}
//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator
class eleven{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter a number");
        int num1=num.nextInt();

        System.out.print("Enter a number");
        int num2=num.nextInt();

        System.out.print("Enter a number");
        int num3=num.nextInt();

        System.out.println("All are equal: "+(num1==num2&&num2==num3&&num3==num1));
        System.out.println("Any two are equal: "+(num1==num2||num2==num3||num3==num1));
    }
}

//12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.

class Twelve{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number");
        num2=num.nextInt();
        System.out.println("Enter Second number");
        num1=num.nextInt();
        System.out.println(num1<num2||num1<50);
    }
}
//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks
class thirteen{
    public static void main(String[] args) {
        Scanner robert=new Scanner(System.in);
        int sub1,sub2,sub3,sum,per;
        System.out.println("Mark of Sub1:");
        sub1=robert.nextInt();

        System.out.println("Mark of Sub2:");
        sub2= robert.nextInt();

        System.out.println("Mark of Sub3:");
        sub3=robert.nextInt();

        sum=sub1+sub2+sub3;
        per=(sum*100)/300;

        System.out.println("Robert's total mark is "+sum+" out of 300 and percentage is "+per+"%.");
    }
}