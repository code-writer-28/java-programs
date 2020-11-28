class Sample { 
  int x;
  int y;
  static Sample s;
  public static void main(String[] args) { 
    Sample s1=new Sample();
    s = s1;
    //can't give access to non-static variable //if s is non-static
    System.out.println(s1.s.x);
  }
}
