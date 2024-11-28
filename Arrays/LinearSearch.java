public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(linearSearch(arr, 5)); 
        
    }


}
