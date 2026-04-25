package recursion;

public class linearsearchrecursion {
    public static void main(String[] args) {
        
    }
    static boolean find(int[]arr,int target,int i){
        if(i == arr.length){
            return false;
        }

        return arr [i]== target || find(arr, target, i+1);
    }
    static int findIndex(int[]arr,int target,int i){
         if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else{
            findIndex(arr,target,i+1)  ;
        }
    }
    static int findIndexLast(int[]arr,int target,int i){
         if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else{
            findIndexLast(arr,target,i+1)  ;
        }
}
}