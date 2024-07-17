import java.io.*;
import java.util.Scanner;

class ctrlA{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
if(num==0){
System.out.println("The given " +num+ " is zero");
}
else if(num>0){
System.out.println("The given " +num+ " is positive");
}
else{
System.out.println("The given " +num+ " is negative");
}
}
}