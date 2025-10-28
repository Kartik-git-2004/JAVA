// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr= {8,3,2,1,5,2};
        
        BubbleSort(arr);
        System.out.print("Bubble sort :" + Arrays.toString(arr));
         
         
        int [] arr2= {8,3,2,1,5,2};
        selectionSort(arr2);
       System.out.print("Selection sort :" + Arrays.toString(arr2));

       int [] arr3= {8,3,2,1,5,2};
       insertionSort(arr3);
       System.out.print("Insertion sort :" + Arrays.toString(arr3));



        removeDuplicate(new int[]{1,1,2,3,4,5,6});
        largestSmallest(new int[]{1,1,2,3,4,5,6});
        common(new int[]{1,1,2,3,4,5,6},new int[]{1,2,8,9,3,});
        secondLarger(new int[] {8,8,1,4,5});
        addTwoMatrices(new int [][] {{1,0,1},{2,3,4}},new int [][] {{2,2,1},{4,5,1}});
         min_max_Matrix(new int [][] {{1,0,1},{2,3,4}});
        
    }
    
    public static void min_max_Matrix(int [][] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int [] i:arr){
            for(int j :i){
                if(j>max){
                    max=j;
                }
                if(j<min){
                    min=j;
                }
            }
            
        }
        System.out.println("Max: "+max+"\nMin: "+min);

    }
    
    public static void addTwoMatrices(int [][] mat1, int [][] mat2){
    int[][] mat3= new int [mat1.length][mat1[0].length];
    for(int i =0 ;i<mat1.length;i++){
        for(int j=0;j<mat2[i].length;j++){
            mat3[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    
    System.out.println("New Matrix : "+Arrays.deepToString(mat3));
}
public static void insertionSort(int[] arr){
    for(int i =0 ;i<arr.length-1;i++){
       
        for(int j =i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }else{
             if(arr[j]>arr[i]) break;}
        }
    }
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
        
        for(int i =0;i<arr.length-1;i++){
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
    
    
    
    public static void removeDuplicate(int []arr){
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for(int i : arr){
            if(!unique.add(i)){
                duplicates.add(i);
            }
        }
        
        System.out.println("After removing duplicates "+unique);
    }    
        
     public static void largestSmallest(int [] arr){
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         
         for(int i =0 ;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
             if(arr[i]<min){
                 min = arr[i];
             }
         }
         
         System.out.println("max:"+max+"\nmin :"+min);
    
        
    }
public static void common(int [] arr1,int [] arr2){
     List<Integer> list = new ArrayList<>();
    for(int i=0;i<arr1.length;i++){
        for(int j = 0 ;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                if(!list.contains(arr1[i])) list.add(arr1[i]);
                
            }
        }
        
    }
    System.out.println("Common Elements are : "+list);
}
public static void secondLarger(int [] arr){
    int larger = Integer.MIN_VALUE;
    int second_larger = Integer.MIN_VALUE;
    for(int i : arr){
        if(i>larger){
            second_larger= larger;
            larger=i;
        }else if (i>second_larger && i!=larger){
            second_larger = i;
        }
    }
    
    System.out.println("Larger :"+larger+"\nSecond Larger: "+second_larger);
}




}