import javax.swing.*;
import java.util.Optional;
import java.util.Scanner;

//1. Write a program to take student details as input and display the result
public class Assignment2pt2 {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name:");
        String address=JOptionPane.showInputDialog("Enter your address:");
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: "));

        JOptionPane.showMessageDialog(null,"Your name is "+name+". You live in "+address+", and your age is "+age);
    }
}


//2. Write a program to calculate sum of four numbers taking user input
class Second1 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,total;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));
        num4=Integer.parseInt(JOptionPane.showInputDialog("Enter fourth number:"));
        total=num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"Your total will be "+total+".");
    }
}

//3. Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
//class Third3{
//    public static void main(String[] args) {
//        int sub1,sub2,sub3,sub4,sum,per;
//        sub1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your mark"));
//        sub2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your mark"));
//        sub3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your mark"));
//        sub4=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your mark"));
//        sum=sub1+sub2+sub3+sub4;
//        per=(sum*100)/400;
//        if (per >= 80) {
//            System.out.print("A");
//        } else if (per >= 60 && per < 80) {
//            System.out.print("B");
//        } else if (per >= 40 && per < 60) {
//            System.out.print("C");
//        } else {
//            System.out.print("D");
//        }
//        JOptionPane.showMessageDialog(null,"");
//    }
//}


//4.Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results.

class Fourfive{
    public static void main(String[] args) {
        int num1,num2,sum,product,sum1,product1;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your number: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your number: "));
        sum=num1+num2;
        product=num1*num2;
        sum1=sum+product;
        product1=sum*product;
        JOptionPane.showMessageDialog(null,"Total sum of the given integer is " +sum+ " and product is "+product);
        JOptionPane.showMessageDialog(null,"Total sum of the given integer is " +sum1+ " and product is "+product1);
    }
}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type
//  casted to int.

//class Six6{
//    public static void main(String[] args) {
//        double length,breath,area;
//        length=Double.parseDouble(JOptionPane.showInputDialog(null,"Length: "));
//        breath=Double.parseDouble(JOptionPane.showInputDialog(null,"Rectangle: "));
//        area=length*breath;
//        double total=Double.parseDouble(area);
//        total=Integer.parseInt(JOptionPane.showMessageDialog(null,"Area:"+ total));
//    }
//}

//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//       my name is xyz and my roll number is xyz. My field of interest are xyz.
class Seven7 {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"Name");
        int roll=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll no."));
        String interest=JOptionPane.showInputDialog(null,"Field of Interest");
        JOptionPane.showMessageDialog(null,"My name is "+name+" and roll number is "+roll+". My field of interest are "+interest);
    }
}

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input
class eight8 {
    public static void main(String[] args) {

        //LSA=Lateral surface area, SA=surface area
        double length, width, height,LSA, SA,Volume;

        length=Double.parseDouble(JOptionPane.showInputDialog(null,"Length"));
        width=Double.parseDouble(JOptionPane.showInputDialog(null,"Width"));
        height=Double.parseDouble(JOptionPane.showInputDialog(null,"Height"));


        SA = 2 * (length * width + length * height + width * height);
        Volume = length * width * height;
        LSA = 2 * height * (length + width);

        JOptionPane.showMessageDialog(null,"Total surface are of cuboid is "+SA);
        JOptionPane.showMessageDialog(null,"The volume of a Cuboid is "+Volume);
        JOptionPane.showMessageDialog(null,"The Lateral Surface area is "+LSA);
    }
}

//9.Write a program to find square of a number.
//        E.g.- INPUT : 2 OUTPUT : 4
//       INPUT : 5 OUTPUT : 25
class nine9{
    public static void main(String[] args) {
        int number=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: "));
        int total=number*number;
        JOptionPane.showMessageDialog(null,"Square of "+number+" is "+total);
    }
}


//10. Take two different string input and print them in same line. E.g.-
//      INPUT : Codes
//    Dope
//  OUTPUT : CodesDope
class Ten10{
    public static void main(String[] args) {
        String one,two;
        one=JOptionPane.showInputDialog(null,"First word ");
        two=JOptionPane.showInputDialog(null,"Second word");
        JOptionPane.showMessageDialog(null,one+two);
    }
}

//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator
class eleven11{
    public static void main(String[] args) {
        int num1,num2,num3;
        num1 =Integer.parseInt(JOptionPane.showInputDialog("First number"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Second number"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Third number"));
        JOptionPane.showMessageDialog(null,(num1==num2&&num2==num3&&num3==num1));
    }
}
//12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.
class twelve12{
    public static void main(String[] args) {
        int num1,num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"First number"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Second number"));

        JOptionPane.showMessageDialog(null,(num1<num2||num1<50));
    }
}

//13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.
class Last{
    public static void main(String[] args) {
        int sub1=Integer.parseInt(JOptionPane.showInputDialog(null,"Mark"));
        int sub2=Integer.parseInt(JOptionPane.showInputDialog(null,"Mark"));
        int sub3=Integer.parseInt(JOptionPane.showInputDialog(null,"Mark"));

        int sum=sub1+sub2+sub3;
        int per=(sum*100)/300;

        JOptionPane.showMessageDialog(null,"Robert's total marks is "+sum+" out of 300 and percentage is "+per);
    }
}