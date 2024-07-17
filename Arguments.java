import java.io.*;
class Arguments{
public static void main(String[] args){
if(args.length!=2){
return;
}

String arg1 = args[0];
String arg2 = args[1];
System.out.println(arg1 + " Technologies " + arg2);

}
}