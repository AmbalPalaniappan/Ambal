package Assignment;

public class conditionalstatements {
	
	int num1 = 10; 
	int num2 = 20;
	int num3 = 7;
	public void largestoftwo (int num1, int num2)	{
	
		if( num1 >= num2) {
			 System.out.println(num1+" is the largest Number");
		}
		else
			{
			System.out.println(num2+" is the largest Number");
			}
	}
	public void largestofthree ()	{
    if( num1 >= num2 && num1 >= num3)
        System.out.println(num1+" is the largest Number");

    else if (num2 >= num1 && num2 >= num3)
        System.out.println(num2+" is the largest Number");

    else
        System.out.println(num3+" is the largest Number");
}
}
