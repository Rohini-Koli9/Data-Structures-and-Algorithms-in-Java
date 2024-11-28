public class ReverseArray {

    public static void reverseArray(int arr[]){
        int first = 0 , last =arr.length-1;

        while( first < last ){
            //swap 
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,44,3,6,9};
        reverseArray(arr);

        //printing array
        for(int i =0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
}
