import java.io.*;
import java.util.Scanner;
class crtlB{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
int num2 = scan.nextInt();
boolean result = LastDigit(num1,num2);
System.out.println(result);
}
public static boolean LastDigit(int num1, int num2){
return (num1%10) == (num2%10);
}
}