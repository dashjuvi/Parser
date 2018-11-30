public class MyClass {
    public static void main(String args[]) {
        int[] s = {1,3,2};
        int p = getPermutation(s);
        System.out.println(p);
    }
    
    public static int getPermutation(int[] a){
        int l = a.length;
        int aux = 1;
        int n = 0;
        if(l==0){
            return n;
        }
            if(l!=0){
                    for (int i = 0; i < (1<<l); i++) 
                    n++;
                }
                return n;
            }
    }
