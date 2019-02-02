public class Solution {
	public int lengthOfLastWord(final String a) {
	    int c=0;
	    int p=0;
	    for(int i=0;i<a.length();i++){
	        if(a.charAt(i) != ' '){
	            c++;
	            p=c;
	        }else{
	            c=0;
	        }
	        
	    }return p;
	}
}
