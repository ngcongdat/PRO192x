package bai10tonghop;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai10TongHop {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        boolean runing = true;
        while (runing) {
            System.out.println("----------------------------");
            System.out.println("Chọn ứng dụng tương ứng: ");
            System.out.println("1. Tìm số lớn nhất của ba số.");
            System.out.println("2. Kiểm tra tam giác thường, cân, đều.");
            System.out.println("3. Tìm số lớn nhất trong mảng 10 số nguyên.");
            System.out.println("4. Đảo ngược dãy số.");
            System.out.println("5. Kiểm tra chuỗi đối xứng.");
            System.out.println("6. Kiểm tra độ dài chuỗi.");
            System.out.println("7. Kiểm tra hai mảng giống hay khác nhau.");
            System.out.println("8. Tổng các giá trị đã nhập");
            System.out.println("9. Tìm kiếm tỉnh/thành theo mã biển số xe máy.");
            System.out.println("0. Thoát");
            System.out.println("----------------------------");
            System.out.print("Mời đồng chí chọn số tương ứng (1 - 9): ");
            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    exam1();
                    break;
                case 2:
                    exam2();
                    break;
                case 3:
                    exam3();
                    break;
                case 4:
                    exam4();
                    break;
                case 5:
                    exam5();
                    break;
                case 6:
                    exam6();
                    break;
                case 7:
                    exam7();
                    break;
                case 8:
                    exam8();
                    break;
                case 9:
                    exam9();
                    break;
                case 0:
                    runing = false;
                    break;
            }
        }
    }

    private static void exam9() {
        System.out.println("Vui lòng nhập mã biển số bạn cần dò tìm:");
        scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {
            case 11:
                System.out.println("Cao Bằng");
                break;
            case 12:
                System.out.println("Lạng Sơn");
                break;
            case 13:
            case 98:
                System.out.println("Bắc Giang");
                break;
            case 14:
                System.out.println("Quảng Ninh");
                break;
            case 15:
            case 16:
                System.out.println("Hải Phòng");
                break;
            case 18:
                System.out.println("Nam Định");
                break;
            case 19:
                System.out.println("Phú Thọ");
                break;
            case 20:
                System.out.println("Thái Nguyên");
                break;
            case 21:
                System.out.println("Yên Bái");
                break;
            case 22:
                System.out.println("Tuyên Quảng");
                break;
            case 23:
                System.out.println("Hà Giang");
                break;
            case 24:
                System.out.println("Lào Cai");
                break;
            case 25:
                System.out.println("Lai Châu");
                break;
            case 26:
                System.out.println("Sơn La");
                break;
            case 27:
                System.out.println("Điện Biên");
                break;
            case 28:
                System.out.println("Hoà Bình");
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                System.out.println("Hà Nội");
                break;
            case 33:
                System.out.println("Hà Tây");
                break;
            case 34:
                System.out.println("Hải Dương");
                break;
            case 35:
                System.out.println("Ninh Bình");
                break;
            case 36:
                System.out.println("Thanh Hoá");
                break;
            case 37:
                System.out.println("Nghệ An");
                break;
            case 38:
                System.out.println("Hà Tĩnh");
                break;
            case 43:
                System.out.println("Đà Nẵng");
                break;
            case 47:
                System.out.println("Đắk Lắk");
                break;
            case 48:
                System.out.println("Đắk Nông");
                break;
            case 49:
                System.out.println("Lâm Đồng");
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                System.out.println("TP.HCM");
                break;
            case 60:
                System.out.println("Đồng Nai");
                break;
            case 61:
                System.out.println("Bình Dương");
                break;
            case 62:
                System.out.println("Long An");
                break;
            case 63:
                System.out.println("Tiền Giang");
                break;
            case 64:
                System.out.println("Vĩnh Long");
                break;
            case 65:
                System.out.println("Cần Thơ");
                break;
            case 66:
                System.out.println("Đồng Tháp");
                break;
            case 67:
                System.out.println("An Giang");
                break;
            case 68:
                System.out.println("Kiên Giang");
                break;
            case 69:
                System.out.println("Cà Mau");
                break;
            case 70:
                System.out.println("Tây Ninh");
                break;
            case 71:
                System.out.println("Bến Tre");
                break;
            case 72:
                System.out.println("Vũng Tàu");
                break;
            case 73:
                System.out.println("Quảng Bình");
                break;
            case 74:
                System.out.println("Quảng Trị");
                break;
            case 75:
                System.out.println("Thừa Thiên - Huế");
                break;
            case 76:
                System.out.println("Quảng Ngãi");
                break;
            case 77:
                System.out.println("Bình Định");
                break;
            case 78:
                System.out.println("Phú Yên");
                break;
            case 79:
                System.out.println("Khánh Hòa");
                break;
            case 81:
                System.out.println("Gia Lai");
                break;
            case 82:
                System.out.println("Kom Tum");
                break;
            case 83:
                System.out.println("Sóc Trăng");
                break;
            case 84:
                System.out.println("Trà Vinh");
                break;
            case 85:
                System.out.println("Ninh Thuận");
                break;
            case 86:
                System.out.println("Bình Thuận");
                break;
            case 88:
                System.out.println("Vĩnh Phúc");
                break;
            case 89:
                System.out.println("Hưng Yên");
                break;
            case 90:
                System.out.println("Hà Nam");
                break;
            case 92:
                System.out.println("Quảng Nam");
                break;
            case 93:
                System.out.println("Bình Phước");
                break;
            case 94:
                System.out.println("Bạc Liêu");
                break;
            case 95:
                System.out.println("Hậu Giang");
                break;
            case 97:
                System.out.println("Bắc Kạn");
                break;
            case 99:
                System.out.println("Bắc Ninh");
                break;
            default:
                System.out.println("Không có Tỉnh/Thành phù hợp");
                break;
        }
    }

    private static void exam8() {
        scan = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();
        boolean running = true;
        double result = 0;
        System.out.println("Mời bạn nhập vào mảng số: ");
        while (running) {
            double d = scan.nextDouble();
            if (d == 0) {
                running = false;
            } else {
                arr.add(d);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        System.out.println("Tổng giá trị mảng vừa nhập là: " + result);
    }

    private static void exam7() {
        scan = new Scanner(System.in);
        double[] a = new double[5];
        double[] b = new double[5];
        String temp = "";
        int count = 0;
        System.out.println("Mời bạn 5 phần tử của mảng thứ nhất: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextDouble();
        }
        System.out.println("Mời bạn 5 phần tử của mảng thứ nhất: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextDouble();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                temp += (count > 0 ? ", " : "") + i;
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Hai mảng khác nhau ở vị trí: " + temp);
        } else {
            System.out.println("Hai mảng giống nhau");
        }
    }

    private static void exam6() {
        scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một chuỗi: ");
        String s = scan.nextLine();
        System.out.println("Độ dài chuỗi vừa nhập là: " + s.length());
    }

    private static void exam5() {
        scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một chuỗi có số ký tự chẵn: ");
        String s = scan.nextLine();
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2, s.length());
        String temp = "";
        if (s.length() % 2 == 0) {
            for (int i = (s2.length() - 1); i >= 0; i--) {
                temp += s2.charAt(i);
            }
            if (s1.equals(temp)) {
                System.out.println("Hai chuỗi đối xứng");
            } else {
                System.out.println("Hai chuỗi không đối xứng");
            }
        }
        else {
            System.out.println("Bạn nhập chuỗi không hợp lệ!!!");
        }
    }

    private static void exam4() {
        scan = new Scanner(System.in);
        int[] arrInt = new int[10];
        System.out.println("Mời bạn nhập vào 10 số nguyên:");
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = scan.nextInt();
        }
        System.out.println("Mảng số nguyên của bạn sau khi đảo ngược là: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arrInt[i] + "\t");
        }
        System.out.println();
    }

    private static void exam3() {
        scan = new Scanner(System.in);
        int[] arrInt = new int[10];
        int max = arrInt[0];
        System.out.println("Mời bạn nhập vào 10 số nguyên:");
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = scan.nextInt();
        }
        for (int i = 0; i < arrInt.length; i++) {

            if (arrInt[i] > max) {
                max = arrInt[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng bạn vừa nhập là: " + max);
    }

    private static void exam2() {
        scan = new Scanner(System.in);
        double a, b, c;
        System.out.print("Mời bạn nhập cạnh thứ 1: ");
        a = scan.nextDouble();
        System.out.print("Mời bạn nhập cạnh thứ 2: ");
        b = scan.nextDouble();
        System.out.print("Mời bạn nhập cạnh thứ 3: ");
        c = scan.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a == b) && (b == c) && (a == c)) {
                System.out.println("Đây là tam giác đều");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Đây là tam giác cân");
            } else {
                System.out.println("Đây là tam giác thường");
            }
        } else {
            System.err.println("Đây không phải là tam giác hợp lệ");
        }
    }

    private static void exam1() {
        scan = new Scanner(System.in);
        double a, b, c, max, temp;
        System.out.print("Mời bạn nhập số thứ 1: ");
        a = scan.nextDouble();
        System.out.print("Mời bạn nhập số thứ 2: ");
        b = scan.nextDouble();
        System.out.print("Mời bạn nhập số thứ 3: ");
        c = scan.nextDouble();
        temp = Math.max(a, b);
        max = Math.max(temp, c);
        System.out.println("Số lớn nhất của ba số là: " + "\t" + max);

    }

}
