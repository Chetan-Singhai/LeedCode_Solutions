class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                str1.append(s.charAt(i));
            } else if (s.charAt(i) == '#' && str1.length() > 0) {
                str1.deleteCharAt(str1.length() - 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) != '#') {
                str2.append(t.charAt(j));
            } else if (t.charAt(j) == '#' && str2.length() > 0) {
                str2.deleteCharAt(str2.length() - 1);
            }
        }

        return str1.toString().equals(str2.toString());
    }
}
