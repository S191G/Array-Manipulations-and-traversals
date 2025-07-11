public class DeleteElementFromArray {
    public static int[] deleteAtPosition(int[] arr, int position) {
        int n = arr.length;

        if (position < 0 || position >= n) {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i == position) continue;
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int position = 2;

        int[] result = deleteAtPosition(original, position);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

