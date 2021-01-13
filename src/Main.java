import NhanVien.Nhanvien;
import NhanVien.NhanvienParttime;
import NhanVien.Nhanvienfulltime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager qlnv = new Manager();
        while (true) {
            System.out.println("Ứng dụng quản lý nhân viên :");
            System.out.println("Nhập 1: Thêm nhân viên");
            System.out.println("Nhập 2: Hiển thị nhân viên");
            System.out.println("Nhập 3: Hiển thị thông tin nhân viên Fulltime có lương dươi trung bình");
            System.out.println("Nhập 4: Hiển thị tổng số lương nhân viên Parttime");
            System.out.println("Nhập 5: Sắp xếp lại nhân viên fulltime theo thứ tự lương tăng dần");
            System.out.println("Nhập 0: Thoát");
            String change = sc.nextLine();
            switch (change) {
                case "1": {
                    System.out.println("Nhập a: Thêm nhân viên Fulltime");
                    System.out.println("Nhập b: Thêm nhân viên Parttime");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a":
                            qlnv.themNhanVien(nhapThongTin(sc, "a"));
                            break;
                        case "b":
                            qlnv.themNhanVien(nhapThongTin(sc, "b"));
                            break;
                        default:
                            System.out.println("sai cú pháp !");
                            break;
                    }
                    sc.nextLine();
                }
                break;
                case "2": {
                    qlnv.hienThiListNhanVien();
                }
                break;
                case "3":
                    qlnv.listLowSalory();
                    break;
                case "4":
                    qlnv.allSalaryOfParttime();
                    break;
                case "5":
                    qlnv.sortSalaryFullTime();
                    break;
                case "0": {
                    return;
                }
            }
        }
    }

    public static Nhanvien nhapThongTin(Scanner sc, String cate) {
        System.out.print("Nhập tên :");
        String name = sc.nextLine();
        System.out.print("Nhập mã nhân viên :");
        String id = sc.nextLine();
        System.out.print("Nhập số điện thoại :");
        String phone = sc.nextLine();
        System.out.print("Nhập email :");
        String email = sc.nextLine();
        if (cate.equals("a")) {
            System.out.print("Nhập lương cứng :");
            double luong = sc.nextDouble();
            System.out.print("Nhập thưởng :");
            double thuong = sc.nextDouble();
            System.out.print("Nhập phạt :");
            double phat = sc.nextDouble();
            return new Nhanvienfulltime(id, name, phone, email, luong, thuong, phat);
        } else if (cate.equals("b"))
            System.out.println("Nhập thời gian làm việc :");
        int timeWork = sc.nextInt();
        return new NhanvienParttime(id, name, phone, email, timeWork);

    }
}
