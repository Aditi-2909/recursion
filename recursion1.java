package recursion;
public class recursion1 {
    public static void main(String[] args) {
        message();
    }
    static void message(){
       System.out.println("aditi");
       message1();
    }
    static void message1(){
       System.out.println("aditi");
       message2();
    }
    static void message2(){
       System.out.println("aditi");
       message3();
    }
    static void message3(){
       System.out.println("aditi");
    }
}
