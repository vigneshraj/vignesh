import java.util.*;
import java.io.*;
class String2Integer {

public static void main(String args[]) throws Exception {
    String a;
    BufferedReader vc= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the value: ");
    a=vc.readLine();
    int v=Integer.valueOf(a);
    System.out.println("The integer value is: "+v);
      
}
}
