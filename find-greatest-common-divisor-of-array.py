class Solution {

    public int findGCD(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

       
        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        return min;
    }
}
