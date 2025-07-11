public class RotateArrayRightByOnePosition{
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        RotateByOne(arr);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public static void RotateByOne(int[]arr){
        int n = arr.length;
        int last = arr[n - 1]; // Store's the last element.

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}