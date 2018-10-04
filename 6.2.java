import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int s=1;
		int i;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				s++;
		}
		String str1[]=new String[s];
		System.out.println("Spaces "+s);
		System.out.println("Input again");
		for(i=0;i<s;i++)
		{
			str1[i]=sc.next();
		}
		String temp;
		for(i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(str1[i].compareTo(str1[j])>0)
				{
					temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
				}
			}
		}
		for(i=0;i<s;i++)
		{
			System.out.println(str1[i]);
		}
	}
}