import java.util.*;
import static java.lang.System.out;

class Dog {

    int size=0;
    String breed;
    String name;
    
    void bark()
    {
        System.out.println("Ruff! Ruff!");
    }
    void bark(int a)
    {
        System.out.println(a);
    }
}
class Cat extends Dog{
    int k = 8;
    void bark(){
        super.bark();
        System.out.println("mi~ao~");
    }
}


interface me {
    abstract void hi();
    
}
abstract class i implements me{
    void hey(int n){};
    public void hi(){
        System.out.println("hi~");
    }
}
class my extends i{
    
}

public class DogTestDrive{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        long t = c.getTimeInMillis();
        c.set(c.HOUR,-5);
        out.println(c.getTime());
        out.println(t);
        System.out.println("hello 3");
        //Scanner cin=new Scanner(System.in);
         
        
        //System.out.println(a);
    }
}