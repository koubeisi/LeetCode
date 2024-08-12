

public class Solution {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
    

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        var magazineMap = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap[magazine.charAt(i) - 'a']++;
        } 

        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazineMap[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            magazineMap[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
