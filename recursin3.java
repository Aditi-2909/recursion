package recursion;

public class recursin3 {
    public static void main(String[] args) {
        funRev(5);
    }
    static void funRev(int n){
         if(n == 0){
            return;
         }
         
         funRev(n-1);
         System.out.println(n);
    }
    
}
