package URLify;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to URLify");
		String s =scan.nextLine();
		System.out.println("Enter the size of the string");
		int a = scan.nextInt();
		System.out.println("The String "+s+ "when URLified is "+(urlify(s,a)) );
	}

public static String urlify(String a,int b){
	char array[] = new char[a.length()];
	array = a.toCharArray();
	char []array2 = new char[a.length()];
	int j =0;
	for(int i = 0;i<b;i++){
		if (array[i] == ' '){
			array2[j] = '%';
			array2[j+1] = '2';
			array2[j+2] = '0';
			j = j+2;
		}
		else {
			array2[j]=array[i];
			j++;
		}
	}
	System.out.println(array2.length);
	String str = String.valueOf(array2);
	return str;
}


}