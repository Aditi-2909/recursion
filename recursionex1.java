package recursion;
public class recursionex1 {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        //base condition 
        if(n == 5){
            return;
        }
        System.out.println(n);
        //recursive call
         
        print(n+1);
    }
}
