package leetcode;

public class Problem28IndexOfFirstOccurrenceInAString {
	
	public int strStr(String haystack, String needle) {
		
		if(needle.isEmpty()) return 0;
		int haystackLeng = haystack.length();
		int needleLength = needle.length();
		
		for(int i = 0; i <= haystackLeng - needleLength; i++) {
			int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength) {
                return i;
            }
		}
		return -1;
	}

}
