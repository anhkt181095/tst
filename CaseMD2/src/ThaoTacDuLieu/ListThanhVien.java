package ThaoTacDuLieu;

import NhanVien.ChuyenVien;
import NhanVien.CongNhan;
import NhanVien.People;

import java.util.ArrayList;
import java.util.Scanner;

public class ListThanhVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<People> peoples = new ArrayList<>();
    public ArrayList<People> getPeople() {
        return peoples;
    }

    public void setPeople(ArrayList<People> people) {
        this.peoples = people;
    }

    public void add(){
        System.out.println("1: thêm chuyên viên ");
        System.out.println("2: thêm công nhân");
        System.out.println("0: trở lại");
        int n = Integer.parseInt(sc.nextLine());
        switch (n){
            case 1:
                ChuyenVien chuyenVien = new ChuyenVien();
                chuyenVien.nhap();
                getPeople().add(chuyenVien);
                break;
            case 2:
                CongNhan congnhan = new CongNhan();
                congnhan.nhap();
                getPeople().add(congnhan);
                break;
        }
    }
    public void hienThiThongTinCaNhan(){
        System.out.println("nhap id cần tìm");
        String timKiem = sc.nextLine();
        int n =0;
        for (int i = 0; i < getPeople().size(); i++) {
            if (timKiem.equals(getPeople().get(i).getMaNhanVien())) {
                System.out.println(getPeople().get(i).toString());
                n++;
            }
        }
        if (n==0){
            System.out.println(" Không tìm thấy dữ liệu ");
        }
    }
    public void delete() {
        System.out.println(" nhập thông tin người dùng cần xóa");
        String name = sc.nextLine();
        int index = 0;
        for (int i = 0; i < getPeople().size(); i++) {
            if (name.equals(getPeople().get(i).getHoTen())) {
                System.out.println(" thông tin tài khoản đã xóa " + getPeople().get(i).toString());
                getPeople().remove(getPeople().get(i));
                index++;
            }
        }
        if (index == 0) {
            System.out.println(" người dùng không tồn tại! ");
        }
    }

}
