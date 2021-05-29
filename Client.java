/**
 * Use piecewise recursion to write Fibonacci algorithm.
 * 5/11/2021
 * Ryan Wagner
 */
public class Client
{
    
    public Client()
    {
       
    }
    
    public int amount(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n > 1){
            return amount(n-1) + amount(n-2);
        }
        return 0;
    }
}
