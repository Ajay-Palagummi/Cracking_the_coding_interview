package palindrome_permutaion;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Palindrome_permutation {

	public static void main(String[] args) {
		System.out.println("Enter the string to check");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(ispalinedrome(s)){
		System.out.println("The string has a permutaion which is a palidrome");
		}
		else{
			System.out.println("The string does not have a permutation which is a palindrome");
		}
		scan.close();

	}
public static boolean ispalinedrome(String s){
	ConcurrentHashMap<Character,Integer> map = new ConcurrentHashMap<Character,Integer>();
	char[] a = new char[s.length()];
	a = s.toCharArray();
    for(int i=0;i<s.length();i++){
    	if(a[i] != ' '){
    	insertintomap(a[i],map);
    	}
    }
 //   System.out.println(map.keySet().toString());
 //   System.out.println(map.values().toString());
    for (Character key : map.keySet()){
    	if(map.get(key)%2 == 0){
    		map.remove(key);   		
    	}
     }
// System.out.println(map.keySet().toString());
 if(map.size() == 1 && map.containsValue(1)){
	 return true;
 }
 else{
	 return false;
 }
 
 }

public static void insertintomap(char a ,ConcurrentHashMap<Character,Integer> map){
	if (map.containsKey(a)){
		map.put(a, (map.get(a)+1));
	}
	else{
		map.put(a, 1);
	}
	
}
}
