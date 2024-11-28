public class MaxSubarraySum_KadanesAlgo {
    public static void kadanesAlgo(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum = currSum+arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum=0;
            }
            //maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = { -1,-2};
        kadanesAlgo(arr);

    }
}
