
public class Operator 
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		int c = (a == 110 ? 21 : 11); //Ternary operator
		System.out.println("Ternary operator : "+c);
		
		int x = 53; //00110101
		int y = 42; //00101010
		int z = x & y;  //Bitwise AND
		int w = x ^ y;	//Bitwise OR
		System.out.println("AND : "+z); //00100000
		System.out.println("OR : "+w);  //00011111 
	}
}
