package First;

public class IfElse {
	
	//Biggest number using if else
	public static void main(String args[])
	{
		int a=8 , b=7 , c=6;
		
		if(a>b && a>c)
		{
			System.out.println("A is big");
		}
		else if(b>c)
		{
			System.out.println("B is big");
		}
		else
		{
			System.out.println("C is big");
		}
		
	 //Biggest number using ternary Operator
		int result = ((a>b&&a>c))?a:(b>c)?b:c;
		System.out.println(result+" "+"is big");
	}

}
