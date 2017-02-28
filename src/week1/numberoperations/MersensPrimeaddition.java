package week1.numberoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//sum of the digits in the mersens prime
public class MersensPrimeaddition 
{


	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\basha\\Desktop\\M74207281.txt";
			int sum=0;
			int temp=0;
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line=null;
			while( (line=bufferedReader.readLine())!= null) 
			{
				
			 sum=MersensPrimeaddition.sumDigits(line);
			 temp=temp+sum;
			}
			System.out.println(temp);
	}	
			
				
		public static int sumDigits(String str) 
		{

			    StringBuilder strAppend = new StringBuilder();

			    for (int i = 0; i < str.length(); i++) {
			        if (Character.isDigit(str.charAt(i))) {
			            strAppend.append(str.charAt(i));
			        }
			    }

			    int total = 0;
			    String strDigits = strAppend.toString();

			    for (int i = 0; i < strDigits.length(); i++) {
			        total += Integer.parseInt(strDigits.substring(i, i+1));
			    }

			    return total;

			}			
	}
			
