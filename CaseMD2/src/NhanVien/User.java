package NhanVien;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String userName;
    private String passWord;
    private int role;
    public static final int ADMIN_ROLE = 1;
    public static final int USER_ROLE = 0;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getRole() {
        return role;
    }

    public static int getAdminRole() {
        return ADMIN_ROLE;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public static int getUserRole() {
        return USER_ROLE;
    }

    public User(String userName, String passWord, int role) {
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", role=" + role +
                '}';
    }
    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {
            System.out.println("Nhập Account ");
            String regexName = "[a-z0-9]{6,12}$";
            String inputName = sc.nextLine();
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcherName = patternName.matcher(inputName);
            if (matcherName.find()) {
                check = true;
                userName = inputName;
            } else {
                System.out.println("Nhập thiếu");
            }
        } while (!check);
        boolean check1 = false;
        do {
            System.out.println("Nhập password");
            String regexPassword = "[a-z0-9]{6,12}$";
            String inputPassword = sc.nextLine();
            Pattern patternPassword = Pattern.compile(regexPassword);
            Matcher matcherPassword = patternPassword.matcher(inputPassword);
            if (matcherPassword.find()) {
                check1 = true;
                passWord = inputPassword;
            } else {
                System.out.println("yêu cầu nhập lại ");
            }
        } while (!check1);
        role = USER_ROLE;
    }
}
