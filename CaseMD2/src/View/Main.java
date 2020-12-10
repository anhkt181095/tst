package View;

import NhanVien.ChuyenVien;
import NhanVien.CongNhan;
import NhanVien.People;
import NhanVien.User;
import ThaoTacDuLieu.ListThanhVien;
import ThaoTacDuLieu.ListUser;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListUser listUser = new ListUser();
        ListThanhVien listThanhVien = new ListThanhVien();
        int cases = 99;
        do {
            System.out.println("1: Đăng Nhập (CHỈ DÀNH CHO NHÂN VIÊN ) ");
            System.out.println("2: tìm kiếm thông tin cá nhân");
            System.out.println("0: exit");
            try {
                cases = Integer.parseInt(sc.nextLine());
                switch (cases) {
                    case 1:
                        User user = listUser.checkUser();
                        if (user.getRole() == 1) {
                            int n = 9;
                            do {
                                System.out.println("Chọn chức năng:");
                                System.out.println("1:-> thêm thành viên");
                                System.out.println("2:-> Xóa Thông tin thành viên ");
                                System.out.println("0: Thoát.");
                                n = Integer.parseInt(sc.nextLine());
                                switch (n) {
                                    case 1:
                                        System.out.println("Chọn chức năng:");
                                        int num = 7;
                                        do {
                                            num = Integer.parseInt(sc.nextLine());
                                            listThanhVien.add();
                                            System.out.println("1: Thêm thành viên" );
                                            System.out.println("0: Quay lại menu");
                                        }
                                        while (num != 0);
                                        break;
                                    case 2:
                                        listThanhVien.delete();
                                        break;
                                }
                            } while (Integer.parseInt(sc.nextLine()) == 1);
                            break;
                        } else if (user.getRole() == 0) {
                        }
                    case 2:
                        listThanhVien.hienThiThongTinCaNhan();
                        break;
                }
            }catch (NullPointerException | NumberFormatException e){
                System.out.println("Sai tên tài khoản hoặc mật khẩu mời đăng nhập lại:");
            }

        } while (cases != 0);


    }
}
