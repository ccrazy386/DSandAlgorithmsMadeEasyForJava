package chapter10.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] inputArr = {2, 1, 8, 4, 5, 3};
        int[] outputArr = new int[6];
        outputArr = bubbleSort(inputArr);

        for (int i = 0; i < outputArr.length; i++) {
            System.out.println(outputArr[i]);
        }
    }

    public static int[] bubbleSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
