import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int v=0,c=0,s=0;
		int i;
		str=str.toLowerCase();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				v++;
			else if(str.charAt(i)==' ')
				s++;
			else
				c++;
		}
		System.out.println("Vowel "+v+" Consonant "+c+" Spaces"+s);
	}
}