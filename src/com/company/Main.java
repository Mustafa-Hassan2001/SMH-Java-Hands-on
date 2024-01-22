package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Hello World!");
    String Name = "Mustafa";
    System.out.println(Name);
    int num = 033;
    float CGPA = 3.94f;
    char Grade = 'A';
    boolean Choice = true;

    System.out.println(num);
    System.out.println(CGPA);
    System.out.println(Grade);
    System.out.println(Choice);
    //    float
//   Primative Data Types ion Java
        byte B = 36;
        System.out.println(B);
        double D =563.786483d;
        System.out.println(D);
        int num1 = 35, num2 = 43 ;
/*Operators in Java
Arthamatic, assigement, logical, comparassion

 */
        System.out.println("The result of num1 and num2 is : ");
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1++);     //postfix
        System.out.println(++num1);     //perfix
        System.out.println(num2--);
        System.out.println(--num2);
        num1 += 34;  // 35+35;
        System.out.println(num1);
        num1 -= 34;
        System.out.println(num1);

//         Scanner scan = new Scanner(System.in);
//        System.out.println("Enter ID: ");
//        String ID =  scan.nextLine();
//         System.out.println("Enter your Full Name: ");
//        String name = scan.nextLine();
//        System.out.println("Enter Your Middle Name: ");
//        String Mname = scan.next();
//        System.out.println("Enter your Age: ");
//        int age = scan.nextInt();
////        System.out.println("Enter your ID: ");
//        //String ID = scan.nextLine();
//        System.out.println(name);
//        System.out.println(Mname);
//        System.out.println(age);
//        System.out.println(ID);
        String name = " Mustafa ";
        System.out.println(name + "from " + "MAJU");
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(3));
        System.out.println(name.contains("Mus"));
        System.out.println(name.endsWith("af"));
        System.out.println(name.chars());
        System.out.println(name.codePointBefore(4));
        int num3 =4, num4= 5;
        System.out.println(Math.max(num3, num4));
        System.out.println(Math.min(num3, num4));
        System.out.println(Math.abs(-4));
        System.out.println(Math.random());
        System.out.println(4+(8-4)*Math.random());
        






    }
}
/* Variables in Java: Variables are containers that store data
    int,  char,  string, boolean
*/

