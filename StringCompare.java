package minggu_2;

import java.util.Scanner;

/*
*@author Xaviera
*Program String compare alphabetically
*@version 1.0
*@since 2023-09-02
*/

public class StringCompare {

	public static void main(String[] args) {
		String A, B;
		int jmlh, compare;
		String container;
		
		Scanner keyboard = new Scanner(System.in); //Objek Scanner untuk mengambil input dari pengguna.
		
		System.out.print("Masukkan String A: ");
		A = keyboard.next();
		
		System.out.print("Masukkan String B: ");
		B = keyboard.next();
		
		keyboard.close(); //menutup objek Scanner dan menghindari memory leak
		
		jmlh= A.length() + B.length();
		
		compare = A.compareTo(B);
		
		container = (compare < 0)? "No" : (compare > 0)? "Yes" : "Equal";
		
		System.out.println("Jumlah String " +A + " dengan " +B +": " +jmlh);
		System.out.println("is " +A + " lexicographically greater than " +B + "? " +container);
		
		if(!A.isEmpty()) {
			String output1 = A.substring(0,1).toUpperCase() + A.substring(1);
			System.out.print(output1+" ");
		}
		if(!B.isEmpty()) {
			String output2 = B.substring(0,1).toUpperCase() + B.substring(1);
			System.out.println(output2);
		}
	
	}

}
