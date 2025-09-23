// celing of a number

public class Main {
    public static void main(String[] args) {

        int [] arr= {1,2,36,77,88,99,110,112,113,115};
        int res = celings(arr,78);
        System.out.println(res+":");

    }
    public  static int celings(int [] x, int target){
        int left = 0, right=x.length-1;
        
       
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            
            if(x[mid]==target){
                return x[mid];
            }
            if(target>x[mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
         if (left == x.length) {   
             return -1;           
           }
        return x[left];

    }
}