class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char min = letters[0]; // Initialize min to the first character
        int tar = (int) target;
        
        while (start <= end) { // Use <= to handle the case when start and end meet
            int mid = start + (end - start) / 2; // Calculate the mid index correctly

            if ((int) letters[mid] > tar) {
                min = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If there is no character greater than the target, return the first character in the array
        if (min <= target) {
             return letters[0];
         }
        
        return min;
    }
}
