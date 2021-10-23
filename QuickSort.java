import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    void quickSort(int[] inputArray, int low, int high){
        if(low<high){
            int partitionIndex=partition(inputArray, low, high);

            quickSort(inputArray, low, partitionIndex-1);
            quickSort(inputArray, partitionIndex+1, high);
        }
    }

    int partition(int[] inputArray, int low, int high){
        int pivot=inputArray[high],i=low-1;
        for (int j = low; j < high; j++) {
            if(inputArray[j]<pivot){
                i++;
                swap(inputArray,i,j);
            }
        }
        swap(inputArray, i+1, high);
        return i+1;
    }

    void swap(int[] inputArray, int i, int j){
        int temp=inputArray[i];
        inputArray[i]=inputArray[j];
        inputArray[j]=temp;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sizeOfArray;
        int[] inputArray;

        System.out.println("\nProgram for Quick Sort\n");
        System.out.print("Enter the size of Array:");
        sizeOfArray=inp.nextInt();

        System.out.print("\nEnter the array:");
        inputArray=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i]=inp.nextInt();
        }
        inp.close();

        System.out.println("\nYour input array is:"+Arrays.toString(inputArray));
        QuickSort sort=new QuickSort();
        sort.quickSort(inputArray,0,sizeOfArray-1);
        System.out.println("\nYour sorted array is:"+Arrays.toString(inputArray));
    }
}