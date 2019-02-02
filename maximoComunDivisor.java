public class Solution {
	public int gcd(int A, int B) {
	    int Dividendo;
    int Divisor;
    int Resto;
    if(A == 0) return B;
    if(B == 0) return A;
    {
    if(A > B)
        {
            Dividendo = A;
            Divisor = B;
        }
    else
        {
            Dividendo = B;
            Divisor = A;
        }
    Resto = Dividendo  %  Divisor;
    do
        {
            Dividendo = Divisor;
            Divisor = Resto;
                    if(Divisor == 0) return Dividendo;

            Resto = Dividendo  %  Divisor;
        }
    while (Resto!= 0);
 
    }
return Divisor;
	}
}
