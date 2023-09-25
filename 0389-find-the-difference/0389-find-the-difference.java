class Solution {
     public char findTheDifference(String s, String t) {
         int ans = 0;
    //     int i = 0;
    //     char ch= ' ' ;
    //     while( i < t.length()){
    //         char ch2 = t.charAt(i);
    //         char ch1 = ' ';


    //         if(s.contains(String.valueOf(ch2)) && String.valueOf(ch2) != String.valueOf(ch1)  ){
    //             i++;
    //             ch1 = ch2;
    //         } else{
    //             ch = ch2;
    //             break;
    //         }
    //     }
    //     return ch;
         

         for (int i=0; i < t.length(); i++) {
            ans = ans + t.charAt(i);
        }

       for (int i=0; i < s.length(); i++) {
            ans = ans - s.charAt(i);
        }

     return (char) ans;
}
}