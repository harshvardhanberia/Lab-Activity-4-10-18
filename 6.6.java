import java.io.*;
import java.util.*;
class Test{
	public static void main(String args[])throws IOException{
		FileReader fr1;
		FileReader fr2;
		FileWriter fw=new FileWriter("ABC.txt");
		int i,j;
		try{
			fr1=new FileReader("Even.txt");
			fr2=new FileReader("Odd.txt");
			do{
				i=fr1.read();
				if(i!=-1)
					fw.write((char)i);
				
			}while(i!=-1);
			do{
				j=fr2.read();
				if(j!=-1)
					fw.write((char)j);
				
			}while(j!=-1);
			fr1.close();
			fr2.close();
			fw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("FNF");
		}
	}
}