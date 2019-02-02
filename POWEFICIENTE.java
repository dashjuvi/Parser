public class Solution {
  static boolean isPower(int a) 
    { 
    if (a == 1) 
        return true; 
  
    for (int i = 2; i * i <= a; i++) { 
        double val = Math.log(a) / Math.log(i); 
        if ((val - (int)val) < 0.00000001) 
            return true; 
    } 
  
    return false; 
    } 
}
