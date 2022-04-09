package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithMinimumKCharacters {
    public static int longestSubstring(String s, int k) {
        int n = s.length();
        //Base conditions
        if ( n<k || n == 0){
            return 0;
        }
        if ( k<=1 ){
            return n;
        }

        //Keep the number of occurance of all characters in the string in map
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()){
            counts.put(c, counts.getOrDefault(c,0)+1);
        }

        int l=0;
        //Finding the highest length of the substring which contains characters that are repeated atleaset k times
        while(l<n && counts.get(s.charAt(l)) >= k){
            l++;
        }

        //If l is one less than n, then it means that the entire substring has characters that are repeating n times except the last character of the string, in which case the returned value will be n-1 and if l = n then the entire substring is valid.
        if (l >= n-1){
            return l;
        }

        //Calling the longestSubstring operation on the substring which is left of the character that has occured less than k times
        int ls1 = longestSubstring(s.substring(0,l),k);

        /*Considering the case where there might be consequtive characters in the string that occurs less than k times. Skipping to the position after the last character that has occurance less than k times.
        Eg: s = aaabbbcdeaabba k=2
        ls1=aaabbb
        c,d and e is occuring less than k times, hence we can skip them and start considering ls2 from a. */

        while (l<n && counts.get(s.charAt(l))<k) l++;

        //Calling the longestSubstring operation on the substring which is right of the character that has occured less than k times. If while skipping l already reached the last position i.e. n then return 0
        int ls2 = (l<n) ? longestSubstring(s.substring(l),k) : 0;

        return Math.max(ls1,ls2);
    }

    public static void main(String[] args) {
       String s = "aaabb";
       int k = 3;
        System.out.println(longestSubstring(s,k));
    }
}
