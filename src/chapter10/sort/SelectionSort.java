package chapter10.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] inputArr = {5, 2, 4, 6, 1, 3};
        int[] outputArr = new int[6];
        outputArr = selectionSort(inputArr);

        for (int i = 0; i < outputArr.length; i++) {
            System.out.println(outputArr[i]);
        }
    }

    public static int[] selectionSort(int arr[]){
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
