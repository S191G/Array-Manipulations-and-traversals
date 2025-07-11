public class RotateArrayLeftByOnePosition {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        RotateLeft(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void RotateLeft(int[]arr){
        int n = arr.length;
        int first = arr[0];

        for (int i = 0; i < n-1; i++) {
            arr[i]= arr[i+1];
        }
        arr[n-1]=first;
    }
}
