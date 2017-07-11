import java.util.*;
import java.io.*;
class Vowel {
  public static void main(String args[]) throws Exception
  {
  String b;
  char a;
 
  BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
  b=vc.readLine();
  a=b.charAt(0);
  if(a=='A' || a=='E'|| a=='I' || a=='O' || a=='U' ||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
  {
  System.out.println(a+" is a Vowel");
  }
  else
  {
  System.out.println(a+" is a Consonant");
  }
  }
}
