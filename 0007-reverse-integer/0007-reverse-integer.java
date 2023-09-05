class Solution {
    public int reverse(int x) {
         long rev = 0;
       while(x != 0){
            long last_num = x % 10;
            rev = rev*10 + last_num ;
            x = x/10;
        }
        if(rev>Math.pow(2,31) || rev<Math.pow(-2,31)) return 0;
        return (int)rev;
    }
}
