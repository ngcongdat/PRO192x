package bai9tinhthanhvn;

import java.util.Scanner;

public class TinhThanhVN {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		TinhThanh();
	}

	public static void TinhThanh() {
		System.out.println("Vui lòng nhập mã biển số bạn cần dò tìm:");
		scan = new Scanner(System.in);
		int i = scan.nextInt();
		switch(i) {
		case 11: System.out.println("Cao Bằng"); break;
		case 12: System.out.println("Lạng Sơn"); break;
		case 13:
		case 98: System.out.println("Bắc Giang"); break;
		case 14: System.out.println("Quảng Ninh"); break;
		case 15:
		case 16: System.out.println("Hải Phòng"); break;
		case 18: System.out.println("Nam Định"); break;
		case 19: System.out.println("Phú Thọ"); break;
		case 20: System.out.println("Thái Nguyên"); break;
		case 21: System.out.println("Yên Bái"); break;
		case 22: System.out.println("Tuyên Quảng"); break;
		case 23: System.out.println("Hà Giang"); break;
		case 24: System.out.println("Lào Cai"); break;
		case 25: System.out.println("Lai Châu"); break;
		case 26: System.out.println("Sơn La"); break;
		case 27: System.out.println("Điện Biên"); break;
		case 28: System.out.println("Hoà Bình"); break;
		case 29:
		case 30:
		case 31:
		case 32: System.out.println("Hà Nội"); break;
		case 33: System.out.println("Hà Tây"); break;
		case 34: System.out.println("Hải Dương"); break;
		case 35: System.out.println("Ninh Bình"); break;
		case 36: System.out.println("Thanh Hoá"); break;
		case 37: System.out.println("Nghệ An"); break;
		case 38: System.out.println("Hà Tĩnh"); break;
		case 43: System.out.println("Đà Nẵng"); break;
		case 47: System.out.println("Đắk Lắk"); break;
		case 48: System.out.println("Đắk Nông"); break;
		case 49: System.out.println("Lâm Đồng"); break;
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57: 
		case 58:
		case 59: System.out.println("TP.HCM"); break;
		case 60: System.out.println("Đồng Nai"); break;
		case 61: System.out.println("Bình Dương"); break;
		case 62: System.out.println("Long An"); break;
		case 63: System.out.println("Tiền Giang"); break;
		case 64: System.out.println("Vĩnh Long"); break;
		case 65: System.out.println("Cần Thơ"); break;
		case 66: System.out.println("Đồng Tháp"); break;
		case 67: System.out.println("An Giang"); break;
		case 68: System.out.println("Kiên Giang"); break;
		case 69: System.out.println("Cà Mau"); break;
		case 70: System.out.println("Tây Ninh"); break;
		case 71: System.out.println("Bến Tre"); break;
		case 72: System.out.println("Vũng Tàu"); break;
		case 73: System.out.println("Quảng Bình"); break;
		case 74: System.out.println("Quảng Trị"); break;
		case 75: System.out.println("Thừa Thiên - Huế"); break;
		case 76: System.out.println("Quảng Ngãi"); break;
		case 77: System.out.println("Bình Định"); break;
		case 78: System.out.println("Phú Yên"); break;
		case 79: System.out.println("Khánh Hòa"); break;
		case 81: System.out.println("Gia Lai"); break;
		case 82: System.out.println("Kom Tum"); break;
		case 83: System.out.println("Sóc Trăng"); break;
		case 84: System.out.println("Trà Vinh"); break;
		case 85: System.out.println("Ninh Thuận"); break;
		case 86: System.out.println("Bình Thuận"); break;
		case 88: System.out.println("Vĩnh Phúc"); break;
		case 89: System.out.println("Hưng Yên"); break;
		case 90: System.out.println("Hà Nam"); break;
		case 92: System.out.println("Quảng Nam"); break;
		case 93: System.out.println("Bình Phước"); break;
		case 94: System.out.println("Bạc Liêu"); break;
		case 95: System.out.println("Hậu Giang"); break;
		case 97: System.out.println("Bắc Kạn"); break;
		case 99: System.out.println("Bắc Ninh"); break;
		default: System.out.println("Không có Tỉnh/Thành phù hợp"); break;
		}
		System.out.println();
		TinhThanh();
	}
}
