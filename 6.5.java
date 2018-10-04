import java.io.*;
import java.util.*;
class Test{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("XYZ.txt");
		String str;
		int i;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(i=0;i<str.length();i++)
			fw.write(str.charAt(i));
		fw.close();
		FileReader fr;
		try{
			fr=new FileReader("XYZ.txt");
			do{
				i=fr.read();
				if(i!=-1)
					System.out.print((char)i);
				
			}while(i!=-1);
					fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("FNF");
		}
		

	}
}