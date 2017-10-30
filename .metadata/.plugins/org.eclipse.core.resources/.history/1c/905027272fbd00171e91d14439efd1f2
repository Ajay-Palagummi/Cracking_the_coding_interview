package is_unique;

import java.util.Hashtable;
import java.util.Scanner;

public class is_unique_with_datastructures {

	public static void main(String[] args) {
		System.out.println("Enter a string to check wether it's unique");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(isunique(s)){
			System.out.println("The string is unique");
		}
		else{
			System.out.println("The string is not unique");
		}

	}

	public static boolean isunique(String s){
	 Hashtable<Integer,Character> a = new Hashtable<Integer,Character>();
	 int count = 0;
		for (int i = 0;i<s.length();i++){
		if(a.contains(s.charAt(i))){
		}
		else{
			a.put(count, s.charAt(i));
			count++;
		}
		}
		if (a.size() == s.length()){
	return true;
		}
		else{
			System.out.println(""+a.size());
			System.out.println(""+s.length());
			return false;
		}
	}
}
