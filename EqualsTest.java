public class EqualsTest {

   public static void main(String[] args) {
   
    Integer aaa=new Integer(5);
    Integer bbb=new Integer(5);
   
    Integer a=100;
    Integer b=100;
    a++;
    a--;
    String str1=new String("justice");
    String str2=new String("justice");
    String str3;
    str3=str1;
    System.out.println(aaa==bbb);
    System.out.println(aaa.equals(bbb));
    System.out.println(a==b);
    System.out.println(a);
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    System.out.println(str1==str3);
    System.out.println(str1.equals(str3));
    }
    
}
