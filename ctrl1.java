import java.io.*;
import java.util.Scanner;
class ctrl1{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();

boolean result = iseven(num);
System.out.println(result);
}
public static boolean iseven(int num){
return (num%2==0);
}
}
