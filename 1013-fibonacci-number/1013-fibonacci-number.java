class Solution {
    public int fib(int n) {
        // if(n==0 || n==1){
        //     return n;
        // }
        //  int fn =  fib(n-1)+fib(n-2);
        // return fn;

         int array []= new int[n+1];
        
        if(n == 0 || n==1){
            return n;
        }
        
        if(array[n]!=0){
            return n;
        }
        
        array[n] = fib(n -1) + fib(n -2) ;
        
        return array[n];

    }
}