import java.io.*;
import java.util.Scanner;
class Arguments3{
public static void main(String[] args){
Scanner scan  = new Scanner(System.in);
int num1= scan.nextInt();
int num2 = scan.nextInt();
int sum = num1+num2;
System.out.println("The sum of " + num1 + " and " + num2+ " is " + sum);
}
}