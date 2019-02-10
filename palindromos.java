class Solution {
    public boolean isPalindrome(int x) {
        int a =x;
        if(x<0) return false;
        if(x>=0 && x<=9) return true;
        int aux;
        while(x!=0){
            aux=aux*10+a%10;
            a=a/10;
            if(a==x)return true;
        }
    }return false;
}
