public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        swapAlternate(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void swapAlternate(int[]arr){
        int n = arr.length-1;

        for (int i = 0; i < n; i+=2) {
           int temp = arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;

        }
    }
}
