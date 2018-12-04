//First letter in a String without a pair
//pseudo code, need to revise
public class MyClass {
    public static void main(String args[]) {
        String s = "this is a test";
        String sol = solve(s);

        System.out.println("First letter without a pair: " + s);
    }
    public static int value(String s){
        // p es un array con una letra en cada posicion, s.charAt(i)
        int l = s.lenght;
        int[] x = new int[l];
        int [] p = new int[];
        for(int i=0; i<l;i++){
            p = s.charAt(i);
            for(int a=0; a<l; a++){
                if(p(i) == p(a)){
                    return p(i);
                }
            }
        }
    }
}
