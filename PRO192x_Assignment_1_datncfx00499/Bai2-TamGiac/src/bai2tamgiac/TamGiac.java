package bai2tamgiac;

import java.util.Scanner;

public class TamGiac {
	
	
	private static Scanner scan;

	public static void main(String[] args) {
		LoaiTamGiac();
	}
	
	public static void LoaiTamGiac() {
		scan = new Scanner(System.in);
		System.out.println("Nhập vào ba cạnh của tam giác:");
		double canhA = scan.nextDouble();
		double canhB = scan.nextDouble();
		double canhC = scan.nextDouble();
		if((canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA)) {
			if((canhA == canhB) && (canhA == canhC) && (canhB == canhC)) {
				System.out.println("Đây là tam giác đều");
			}
			else if(canhA == canhB || canhA == canhC || canhB == canhC) {
				System.out.println("Đây là tam giác cân");
			}
			else {
				System.out.println("Đây là tam giác thường");
			}
		}
		else {
			System.out.println("Tam giác không hợp lệ. Vui lòng kiểm tra và thực hiện lại.");
			LoaiTamGiac();
		}
	}

}
