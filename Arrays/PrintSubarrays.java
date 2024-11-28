public class PrintSubarrays {
    public static void printSubarrays(int arr[]){
        int totalSubarrays = 0;
        for (int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k =start; k<=end ; k++){ //print
                    System.out.print(arr[k]+" "); //subarray
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + totalSubarrays); //  (n*(n+1))/2 --> sum of n numbers
    }


    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10};
        printSubarrays(arr);
        
    }
}
