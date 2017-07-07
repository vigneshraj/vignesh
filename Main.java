class Main {
  public static void main(String args[]) {
    int a;
    Scanner vc= new Scanner(System.in);
    a=vc.nextInt();
    if(a==0)
    {
    System.out.println("Equal to zero");
    }
    else if(a<0)
    {
    System.out.println("A is negative number");
    }
    else 
    {
    System.out.println("A is postive number");
    }
  }
}
