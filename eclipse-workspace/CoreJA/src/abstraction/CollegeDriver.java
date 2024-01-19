package abstraction;
import java.util.Arrays;
import java.util.Scanner;

public class CollegeDriver {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of  college array");
	int size = sc.nextInt();
	College[]c1=new College[size];
	for(int i=0;i<c1.length;i++)
	{
		System.out.println("Enter the college name");
		String cname =sc.next();
		System.out.println("Enter the code of college");
		int code =sc.nextInt();
		c1[i]=new College(cname,code);
	}
	System.out.println("College array created successfully....");
	System.out.println(".......................................");
	System.out.println("Before sorting college array.....");
	for(int i=0;i<c1.length;i++)
	{
		System.out.println("College name:"+c1[i].Cname+"College code:"+c1[i]);
	}
	System.out.println("........................................");
	System.out.println("After sorting college array....");
	Arrays.sort(c1);
	for(int i=0;i<c1.length;i++)
	{
		System.out.println("College name:"+c1[i].Cname+"College code:"+c1[i]);
	}
	System.out.println("..................................");
	System.out.println("Enter the college name to search");
	String Cname=sc.next();
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i].Cname.equalsIgnoreCase(Cname))
		{
			System.out.println(c1[i].Cname+"College exist");
			return;
		}
	}
	System.out.println("College not exist");
	return;

	
}
}
