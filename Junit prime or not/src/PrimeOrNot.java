
public class PrimeOrNot {
	
	boolean checkPrime(int n)
	{
		int i,j,k;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
			
		}
		return true;
	}

}
