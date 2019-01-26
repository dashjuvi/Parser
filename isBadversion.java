public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // boundary case, make sure the input n is valid 
        if(n <= 0 ) return 0;
        // corner case: the first version is a bad version ,just return 1 ;
        if(isBadVersion(1)){
             return 1;
        }
        int begin = 1; 
        int end = n;
        return findIndex(begin,end);
    }
    private int findIndex(int left, int right){
        // when left and right meet each other we return left 
        if(left >= right) return left;
        int mid = left + (right -left) / 2;
        // shrink the search space; 
        if(isBadVersion(mid)){
            return findIndex(left,mid);
        }
        return findIndex(mid+1,right); 
    }
}
