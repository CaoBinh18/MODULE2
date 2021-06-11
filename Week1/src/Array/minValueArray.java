package Array;

public class minValueArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValueArray(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValueArray(int arr[]){
        int minValue = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(minValue>arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
