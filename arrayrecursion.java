package recursion;

public class arrayrecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,5,6,8};
        System.out.println(solution(arr, 0));

    }
    static boolean solution(int[]arr,int i){
        // based conditon
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && solution(arr,i+1);
    }
}
