package MinimumSwaps2;

public class Solution {
    static int minimumSwaps(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int minSwaps = 0;

        while (first < last) {
            for (int i = first; i < arr.length; i++) {
                if (arr[i] == (first + 1)) {
                    if ((first) == i) {
                        System.out.println("Skipping index#"+first+" value:"+arr[first]);
                        first++;
                        continue;
                    }
                    //System.out.println("swap #"+(swapCounter++)+": " + arr[first] + "<=>" + arr[i] + " (" + first + "," + i + ")");
                    int temp = 0;
                    temp = arr[first];
                    arr[first] = arr[i];
                    arr[i] = temp;
                    first++;
                    minSwaps++;
                }
            }
        }
        return minSwaps;
    }

    static int minimumSwaps2(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int minSwaps = 0;

        while (first < last) {
            while (arr[first] == first + 1 && first < last) {
                first++;
            }
            if (first < last) {
                int temp = arr[arr[first] - 1];
                arr[arr[first] - 1] = arr[first];
                arr[first] = temp;
                minSwaps++;
            }
        }
        return minSwaps;
    }

}
