import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) 
	{
		int [] array = new int [10];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<10; i++ )
		{
			System.out.println(" \n A["+i+"] = ");
			array[i]=input.nextInt();
			
		}                 
		for(int j=0; j<10; j++)
		{
			System.out.println(" A["+j+"] = "+array[j] );
		}

	}

}
