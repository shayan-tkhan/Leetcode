class Solution {
    public boolean isValid(String s) {
        int lengthBefore;
        do {
            lengthBefore = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (lengthBefore != s.length());
        
        return s.isEmpty();
    }
}