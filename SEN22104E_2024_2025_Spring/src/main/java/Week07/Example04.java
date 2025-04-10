
package Week07;

/**
 *
 * @author FSMVU
 */
public class Example04 {
  public static void main(String[] args) {
      String s1="Ahmet";
      String s2="Ahmet";
      System.out.println(s1==s2);
      
      String s3=new String("Ahmet");
      System.out.println(s1==s3);  

      System.out.println(s1.equals(s3));
  }
}
