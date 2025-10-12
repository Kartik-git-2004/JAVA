package JAVA_DSA;

public public class Main{
    public static void main (String[] args )
    {
        String str = "abba";
        reverse(str);
        
    }
    public static void reverse(String str ){
        char[] ch = str.toCharArray();
      int s = 0, e = ch.length-1;
      while(s<e){
          char c = ch[s];
          ch[s]=ch[e];
          ch[e]=c;
          s++;
          e--;
      }
      System.out.println(ch);
      
      if(str.equals(String.valueOf(ch))){
           System.out.println("palindrome");
      }else{
           System.out.println("no palindrome");
      }
    }
} {
    
}
