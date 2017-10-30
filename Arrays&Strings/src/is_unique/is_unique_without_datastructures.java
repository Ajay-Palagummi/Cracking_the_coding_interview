package is_unique;

import java.util.Scanner;

public class is_unique_without_datastructures {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 	System.out.println("Enter the string to check if the string is unique");
 	String s = scan.nextLine();
 	if(isunique(s)){
 		System.out.println("The string is unique");
 	}
 	else{
 		System.out.println("the string is not unique");
 	}
 	scan.close();
	}
	
	public static boolean isunique(String s){
	 boolean isunique = true;
	 for (int i=0;i<s.length();i++ ){
		 int count = 0;
		 char a = s.charAt(i);
		 for (int j =0;j<s.length();j++){
			 if (a == s.charAt(j)){
				 count++;
			 }
		 }
		 if (count >1){
			 isunique = false;
			 break;
		 }
	}
	 
	return isunique;
}
}