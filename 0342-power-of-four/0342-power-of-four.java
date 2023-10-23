class Solution {
    public boolean isPowerOfFour(int n) {
        //    if(n==0){
        //        return false;
        //    }
        //    while( n % 4 == 0){
        //       n = n/4;
        //    }
        // if (  n == 1 ){
        //     return true;
        // }
        // return false;

         if(n==0){
               return false;
            }
            int x = (int)(Math.log(n) / Math.log(4));

            if(Math.pow(4,x) == n)
              return true;

         return false;
    }
}