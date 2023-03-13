package demo.autotest;

public class BaiTap {

    public static void main(String[] args) {
        int arrpara[] = {18, 26, 24, 24, 18, 20, 22};
        System.out.println(Solutiondsadas(arrpara));
    }

    public static int Solutiondsadas(int[] arr) {
        int a = compare1(arr);
        int b = compare2(arr);

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int compare1(int[] arr) {
// Initialize a counter for translational numbers
        int count = 0;

// Store the length of the array in a variable
        int len = arr.length;

// Loop through every pair of numbers in the array backwards
        for (int i = len - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                // Find their difference
                int diff = Math.abs(arr[j] - arr[i]);
                // Loop through the rest of the array backwards
                for (int k = j - 1; k >= 0; k--) {
                    // Check if any other number matches the difference
                    if (arr[k] - arr[j] == diff) {
                        // Increment the counter and break out of the loop
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static int compare2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int last = arr[0];
        int max = 0;
        int currNumDupes = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == last) {
                currNumDupes++;
            } else {
                max = max > currNumDupes ? max : currNumDupes;
                currNumDupes = 1;
            }
            last = arr[i];
        }
        max = max > currNumDupes ? max
                : currNumDupes; //if the most dupes is from the highest element
        return max;
    }
}