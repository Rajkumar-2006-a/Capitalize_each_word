import java.util.*;
public class caps
{
public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	char str[]=new char[100];
	str=a.toCharArray();
	str[0]-=32;
	int n=a.length();
	for(int i=0;i<n;i++)
	{
	if(str[i]==32)
	{
		str[i+1]-=32;
	}
	}
	String f=new String(str);
	System.out.print(f);
	sc.close();
}
}
