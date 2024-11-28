public class LargestNumber {

    public static int lagestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = { 23,56,7,88,1};
        System.out.println(lagestNumber(arr));
    }
}
