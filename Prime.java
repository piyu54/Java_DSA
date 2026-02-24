
public class Prime {

	public static void main(String[] args) {
		


		int n=2;
		boolean isprime=true;
		
//		if(n<2)
//		{
//			isprime=false;
//		}
//		else
//		{
//			
//		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
		}
		
		if(isprime)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
	
	}
}
