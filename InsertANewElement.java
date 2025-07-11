public class InsertANewElement {

    public static int[]insertAtPosition(int[]arr, int element, int position){
        int n = arr.length;

        int [] newArr = new int[n+1];
        for (int i = 0; i < position; i++) {
            newArr[i]=arr[i];
        }

        newArr[position]=element;

        for (int i = position; i < n; i++) {
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr [] = {5,1,5,8,9,17};
        int element = 25;
        int position = 2;

        int[]result = insertAtPosition(arr, element, position);

        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
