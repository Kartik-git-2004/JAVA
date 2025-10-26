// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr= {8,3,2,1,5,2};
        
        BubbleSort(arr);
        System.out.print("Bubble sort :" + Arrays.toString(arr));

        int [] arr2= {8,3,2,1,5,2};
       System.out.print("Selection sort :" + Arrays.toString(arr));


        
    }
    
    
    
    
    public static void BubbleSort(int[] arr){
          for(int i = 0; i<arr.length-1;i++){
            
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }  
               

            }
        }
    }
    
    public static void selectionSort(int[] arr){
        
        for(int i =0;i<arr.length-i;i++){
            int last = arr.length-i-1;
           int maxIndex = getMax(arr, 0,last);
           swap(arr,maxIndex,last);
        }
    }
    
    public static int  getMax(int [] arr , int start , int end){
        int max = start;
        for(int i =start  ;i<=end;i++){
        if(arr[max]<arr[i]){
            max =i;
        }
        }
        return max;
    }
    public static void swap(int [] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
}