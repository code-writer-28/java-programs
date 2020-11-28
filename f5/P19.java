class Sample{
  public static void main(String[] args){
    String s1=new String("ABC");
    String s2=new String("XYZ");
    String s3=new String("ABC");
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
  }
}

// https://ide.geeksforgeeks.org/NLPcMhb07P
