import java.util.*;
import java.io.*;
class ReverseString {

public static void main(String args[]) throws IOException {
  String a;
  BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the String : ");
  a=vc.readLine();
  StringBuilder rev= new StringBuilder(a);
  rev.reverse();
   System.out.println("The reverse String is : "+rev);
}
}
