package baitap.DemoSearchAlgorithms;

public class BinarySearch {
    int binarySearch(int array[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
//            int length = array.length;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x) {
                for (int i = 0; i < mid; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println("\n");
                return binarySearch(array, x, low, mid - 1);
            }
            System.out.println("\n");
            for (int i = mid; i <= high; i++) {
                System.out.print(array[i] + ", ");
            }
            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 20, 23, 25 };
        int n = array.length;
        int x = 23;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("\n Element found at index " + result);
    }
}
