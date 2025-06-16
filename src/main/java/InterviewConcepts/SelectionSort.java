package InterviewConcepts;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        sort(arr);
        printArray(arr);
    }

    public static void sort(int arr[]){

        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minValue = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minValue])
                    minValue = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
