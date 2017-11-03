package check_permutation;

import java.util.Arrays;
import java.util.Scanner;

public class Check_permutation_generic {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first String");
	String a = scan.nextLine();
	System.out.println("Enter the second String");
	String b = scan.nextLine();
	if(ispermutation(a,b)){
		System.out.println("It is a permutation");
	}
	else{
		System.out.println("It is not a permutation");
	}
	scan.close();
	}

	
	public static boolean ispermutation(String s,String s2){
	if(s.length() != s2.length()){
		return false;
	}
	else{
	char [] a = new char[s.length()];
	char [] b = new char[s2.length()];
	a = s.toCharArray();
	b = s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	
	for(int i=0;i<s.length();i++){
		if(a[i] == b[i]){
			
		}
		else {
			return false;
			}
	}
	return true;
	
	}
}
}
