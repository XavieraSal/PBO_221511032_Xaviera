package tes1;

public class coba {
	public static void main (String[] args) {
		byte angka1 = 125;
		byte angka2 = 6;
		byte hasil = (byte) (angka1+angka2);
		
		System.out.println("Hasil 1 "+hasil);
	}
}

//tipe data byte yang memiliki rentang nilai dari -128 hingga 127
//Ketika menjalankan operasi (byte) (angka1 + angka2)
//terjadi overflow karena hasil dari penjumlahan melampaui rentang tsb
//overflow pada tipe data byte akan "melompat" dari nilai maksimum ke nilai minimum 
//jika nilainya melebihi batas atas atau batas bawah
//131 berada di luar rentang -128 hingga 127, nilainya akan "dibungkus" menjadi -125