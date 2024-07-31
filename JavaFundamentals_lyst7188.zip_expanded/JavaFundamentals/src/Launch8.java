
public class Launch8 
{

	public static void main(String[] args) 
	{
//		System.out.print("Telusko");
//		System.out.println(" Java");
//		System.out.println(" By Hyder Abbas");
		
		int i, j;
		int n=10;
		
//		for(i=0; i<n; i++)
//		{
//			for(j=0;j<n;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(i=0; i<n; i++)
//		{
//			for(j=0;j<n;j++)
//			{
//				System.out.print( i);
//			}
//			System.out.println();
//		}
		
//		for(i=0; i<n; i++)
//		{
//			for(j=0;j<n;j++)
//			{
//				if(i==0 || i==n-1 || j==0 || j==n-1)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		for(i=0; i<n; i++)
		{
			for(j=0;j<n;j++)
			{
//				if(i==0 || i==n-1 || j==0)
//				if(i==0 || j==(n-1)/2)
//				if(i==0 || i==n-1 || j==0 || i==(n-1)/2)
//				if(i==0 || i==(n-1)/2 || j==0 || j==n-1)
//				if(i==0 && j>0 || i==n-1 && j>0 || j==0 && i>0 && i<n-1)
//				if((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) 
//						|| (j==n-1 && i>0 && i<n-1))
				
				if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
