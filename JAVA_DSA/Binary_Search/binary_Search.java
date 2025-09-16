public class binary_Search{
    public static void main (String[] args){
     int [] arr ={-9,-8,-4,1,2,5,6,7,9,14,15,117};
int result= binarySearch(arr,14);
System.out.println(result);
        
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        

        // return -1 if it doesnot exist ..
        while(s<=e){
            //find the element 
            int mid  = start +(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            if(target>arr[mid]){
                start= mid+1;

            }
            if(target==arr[mid]){
                return mid;
            }

        }

        return -1 ;
    }

}