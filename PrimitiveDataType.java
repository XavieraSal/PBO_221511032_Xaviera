package minggu_2;

/*
*@author Xaviera
*Primitive Data Type Generator
*@version 1.0
*@since 2014-03-31
*/

import java.util.Scanner;
public class PrimitiveDataType {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Jumlah test case: ");
        int tescase = keyboard.nextInt(); //Nomor test case

        for (int i = 0; i < tescase; i++) {
            System.out.print("Masukkan angka: ");
            long input = keyboard.nextLong(); //Input bertipe long karena long memiliki range paling tinggi

            System.out.println(input + " can be fitted in:");

            System.out.println((input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) ? "* byte" : "");
            System.out.println((input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) ? "* short" : "");
            System.out.println((input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) ? "* int" : "");
            if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE) {
                System.out.println("* long");
            } else {
                System.out.println("can't be fitted anywhere");
            }
        }
        System.out.print("-selesai- ");
        keyboard.close();
	}
}
