class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1,end=num/2;
        int sqrt =0;
        
        while(start<=end){
            int mid= start +(end-start)/2;
            if((long)mid*mid==num){
                return true;
            }if((long)mid*mid<num){
                start=mid+1;

            }if((long)mid*mid>num){
                end=mid-1;

            }
        }
        if(num<2){
            return true;
        }
        return false;
    }

}