class Sample{
  String s1="ABC";
  String s2="ABC";
  public static void main(String[] args){
    String s3="ABC"; 
    String s4="ABC"; 
    Sample s=new Sample();
    System.out.println(s.s1==s.s2);
    System.out.println(s3==s4);
    System.out.println(s.s1==s3);
  }
}

//https://ide.geeksforgeeks.org/XoWEkzWiLC
