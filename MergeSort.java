import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    void merge(int[] inputArray, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = inputArray[low + i];
        }
        for (int i = 0; i < n1; i++) {
            rightArray[i] = inputArray[middle + i + 1];
        }

        int i=0, j=0, k = low;
        while(i<n1 && j<n2){
            if(leftArray[i]<rightArray[j])
            inputArray[k++] = leftArray[i++];
            else
            inputArray[k++] = rightArray[j++];
        }

        while(i<n1)
        inputArray[k++] = leftArray[i++];
        while(j<n2)
        inputArray[k++] = rightArray[j++];
    }

    void sort(int[] inputArray, int low, int high){
        if(low<high){

            int middle = low + (high - low)/2;

            sort(inputArray, low, middle);
            sort(inputArray, middle+1, high);
            
            merge(inputArray, low, middle, high);
        }
    }
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sizeOfArray;
        int[] inputArray;

        System.out.println("\nProgram for Merge Sort\n");
        System.out.print("Enter the size of Array:");
        sizeOfArray=inp.nextInt();

        System.out.print("\nEnter the array:");
        inputArray=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i]=inp.nextInt();
        }
        inp.close();

        System.out.println("\nYour input array is:"+Arrays.toString(inputArray));
        MergeSort sort=new MergeSort();
        sort.sort(inputArray,0,sizeOfArray-1);
        System.out.println("\nYour sorted array is:"+Arrays.toString(inputArray));
    }
}