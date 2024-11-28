package Recursion;
public class CheckSortedArray {
    public static boolean checkSortedArray(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        
        return checkSortedArray(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,8,33,2,5};
        System.out.println(checkSortedArray(arr, 0));
    }
}
