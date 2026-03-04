public class sortedArr {
    public boolean sorted(int arr[], int idx) {
        if (arr[idx] == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            sorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 3 };
        sorted(a, 0);
    }
}
