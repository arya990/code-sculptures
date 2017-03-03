package week3.feb28;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class MorsecodeusingDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Character,String> a=new Hashtable<Character,String>();
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
//		char ch = s.charAt(i);
		char ch1=s1.charAt(i);
		a.put('a', ".-");
		a.put('b', "-...");
		a.put('c', "-.-" );
		a.put('d', "-..");
		a.put('e', ".");
		a.put('f', "..-.");
		a.put('g', "--.");
		a.put('h', "....");
		a.put('i', "..");
		a.put('j', ".---");
		a.put('k',"-." );
		a.put('l', ".-..");
		a.put('m', "--");
		a.put('n', "-.");
		a.put('o', "---");
		a.put('p', ".--.");
		a.put('q', "--.-");
		a.put('r',".-." );
		a.put('s', "...");
		a.put('t', "-");
		a.put('q', "..-");
		a.put('v', "...-");
		a.put('w', ".--");
		a.put('x', "-..-");
		a.put('y', "-.--");
		a.put('z', "--..");
		a.put('0', "-----");
		a.put('1',".----" );
		a.put('2',"..---" );
		a.put('3', "...--");
		a.put('4', "....-");
		a.put('5', ".....");
		a.put('6',"-...." );
		a.put('7',"--..." );
		a.put('8', "---..");
		a.put('9', "----.");
		a.put(' ', " ");
		
		System.out.print(a.get(ch1));
		}
		in.close();
		
	}

}
