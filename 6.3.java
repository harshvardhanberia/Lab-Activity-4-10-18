import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i=0,j=str.length()-1;
		int flag=0;
		for(i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=-1;
				break;
			}
			j--;
		}
		if(flag==-1)
			System.out.println("Not palindrome");
		else
			System.out.println("Palndrome");
	}
}