package final450.Find_Min_And_Max;

public class Min_Max {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 7, 8, 10, -3 };
        MinAndMax(arr);
    }
    // create a function that returns nothing.

    static void MinAndMax(int arr[]) {

        // check for the Edge case if array is empty.

        if (arr == null || arr.length == 0) {
            return;
        }

        // initialise min and max variable and assign them to array's first element

        int min = arr[0];
        int max = arr[0];

        // run a for loop to iterate through array element linearly

        for (int i = 0; i < arr.length; i++) {
            // check for two conditions to update both min and max.

            if (arr[i] < min) {
                // update minimum
                min = arr[i];
            }
            // same for maximum

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // print minimum and maximum.
        System.out.println(min + " <--- is minimum ");
        System.out.println(max + " <--- is Maximum ");
    }
}
