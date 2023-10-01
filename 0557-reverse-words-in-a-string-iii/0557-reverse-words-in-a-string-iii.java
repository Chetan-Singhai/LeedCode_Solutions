class Solution {
    public String reverseWords(String s) {
        String newS = " ";
        int i = 0;
        int j = 0;
        while( i < s.length()){
            if (s.charAt(i) == ' '){
        StringBuilder str = new StringBuilder (s.substring(j,i));
                  str. reverse();
                  newS = newS + str + " " ;
                  j = i+1;
            }
            i++;
        }
        StringBuilder lastWord = new StringBuilder(s.substring(j, i));
         lastWord.reverse();
         newS = newS + lastWord;
        return newS.trim();
    }
}