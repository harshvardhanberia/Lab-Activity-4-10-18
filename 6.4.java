import java.io.*;
import java.util.*;
class Test{
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		FileWriter f1=new FileWriter("Even.txt");
		FileWriter f2=new FileWriter("Odd.txt");
		for(int i=0;i<s.length();i++){
			if(i%2==0)
				f1.write(s.charAt(i));
			else
				f2.write(s.charAt(i));
		}
		f1.close();
		f2.close();
	}
}