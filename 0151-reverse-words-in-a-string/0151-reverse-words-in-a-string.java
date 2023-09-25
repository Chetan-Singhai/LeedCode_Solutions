class Solution {
    public String reverseWords(String s) {
        int start = 0;
        String word[] = s.split( "\\s+");
        int end = word.length -1;
        String temp ;
        while( start < end) {
            temp = word[start];
             word[start] =  word[end];
              word[end] =  temp;
              start++;
              end--;
        }
       StringBuilder result = new StringBuilder();
        for (String words : word) {
            result.append(words).append(" ");
        }

        // Remove the trailing space and return the reversed sentence
        return result.toString().trim();
    }
}
       

