import java.io.*;
class Arguments2{
public static void main(String[] args){
if(args.length!=1){
return;
}

String arg = args[0];
System.out.println("Welcome " + arg);

}
}