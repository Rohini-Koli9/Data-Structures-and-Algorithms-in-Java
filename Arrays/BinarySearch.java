public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        int start = arr[0];
        int end = arr.length-1;
        while (start <= end ){
           int mid =  (start + end )/2;

           //comparisons
           if(arr[mid] == key ){
            return mid;
           }
           if(arr[mid] < key){ 
            start = mid +1; //right half
           }else{
            end = mid -1; // left half
           }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,8,9};
        int key = 8;
        System.out.println(binarySearch(arr, key));

    }
    
}
