class Sample { 
  static int x=1;
  static int y=2;
  public static void main(String[] args) { 
    System.out.println(x); // 1
    System.out.println(y); // 2
    int x=3;
    System.out.println(x); // block level var // 3
    System.out.println(y); // 2

    System.out.println(Sample.x); // class level var // 1
  }
}
