public class MaxSubarraySum {
    public static void maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                currSum=0;
               // int currSum = (start +=end);
                for (int k = start; k <= end ;k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum){
                    maxSum = currSum;
                }

            }

        }
        //return maxSum;
        System.out.println("Maximum Sum =" + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubarraySum(arr);
    }
}
