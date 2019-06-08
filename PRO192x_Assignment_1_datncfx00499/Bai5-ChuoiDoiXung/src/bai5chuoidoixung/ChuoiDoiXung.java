package bai5chuoidoixung;

import java.util.Scanner;

public class ChuoiDoiXung {

	private static Scanner scan;
	public static String mangKyTu;
	
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập chuỗi gồm số chẵn ký tự: ");
		NhapMang();
		KiemTraMang();
	}

	public static void NhapMang() {
		scan = new Scanner(System.in);
		mangKyTu = scan.nextLine();
		if(mangKyTu.length()%2 != 0) {
			System.out.println("Nhập chuỗi không hợp lệ! Vui lòng nhập lại chuỗi!");
			NhapMang();
		}
	}
	
	public static void KiemTraMang() {
		String mangKyTu1 = mangKyTu.substring(0, mangKyTu.length()/2);
		String mangKyTu2 = mangKyTu.substring(mangKyTu.length()/2);
		StringBuffer mangTam = new StringBuffer(mangKyTu2);
		mangTam.reverse().toString();
		String mangDaoNguoc = new String(mangTam);
		if(mangDaoNguoc.equals(mangKyTu1) == true) {
			System.out.println("Đây là chuỗi ký tự đối xứng");
		} else {
			System.out.println("Đây không phải là chuỗi ký tự đối xứng");
		}
	}
}
