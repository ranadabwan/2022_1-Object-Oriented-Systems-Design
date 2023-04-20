package Week12;
import java.util.ArrayList;
import java.util.Scanner;

    public class Eratos {
        public static ArrayList<Integer> sieve(int n) {
            // Create a boolean array "prime[0..n]" and initialize
            // all entries it as true. A value in prime[i] will
            // finally be false if i is not a prime, else true.
            boolean prime[] = new boolean[n+1];
            for(int i=0;i<=n;i++)
                prime[i] = true;

            for(int p = 2; p*p <=n; p++)
            {
                // If prime[p] is not changed, then it is a prime
                if(prime[p] == true)
                {
                    // Update all multiples of p
                    for(int i = p*p; i <= n; i += p)
                        prime[i] = false;
                }
            }

            // create an arraylist
            ArrayList<Integer> pnums = new ArrayList<Integer>();

            // store all prime numbers in the create arraylist
            for(int i = 2; i <= n; i++)
            {
                if(prime[i] == true)
                    pnums.add(i);
            }

            return(pnums);
        }

    }
