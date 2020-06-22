/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbubblesort;

/**
 *
 * @author 92020362
 */
public class BasicBubbleSort {
    
    
    private static int parseCounter = 0;
    private static int swapCheckCounter = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        BasicBubbleSort ob = new BasicBubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("The Unsorted array is");
        ob.printArray(arr);

        // apply sort
        ob.doBubbleSort(arr);
        System.out.println("The Basic Bubble Sorted array is");
        ob.printArray(arr);
        System.out.println("The number of times the array was parsed was " + parseCounter);
        System.out.println("The number of compare operations was " + swapCheckCounter);
        
    }
    
    void doBubbleSort(int arr[]) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            
            for (int j = 0; j < n - i - 1; j++) {
                parseCounter ++;
                
                if (arr[j] > arr[j + 1]) {
                    swapCheckCounter ++;
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }

    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    
}
