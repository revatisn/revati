package in.edu.Shopping;

public class Prime {
	static void prime_N(int n) {
		
		int x,y,flag;
		System.out.println("All the prime numbers between 1 and "  +n  +"are");
		for(x=1;x<=n;x++)
		{
			if(x==1 || x==0)
				continue;
			flag=1;
			for(y=2;y<=x/2;++y)
			{
				if(x%y==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(x+    "   ");
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		prime_N(n);

	}

}
