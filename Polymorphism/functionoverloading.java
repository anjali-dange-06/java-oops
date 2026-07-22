package OOPS;
import java.util.Scanner;
public class functionoverloading {	
void login(long mobileno) {
int otp=(int)(Math.random()*10000);
Scanner sc=new Scanner(System.in);
System.out.println("enter otp : "+otp);
int userotp=sc.nextInt();
if(userotp==otp) {
	System.out.println("login success");
}
else {
	System.out.println("login failed");
}
}
void login(String username,String pass) {
if(username.equals("anjali")&& pass.equals("1212")) {
	System.out.println("login successful");
}
else {
	System.out.println("login failed");
}
}
void login(String email) {
	if(email.contains("@")) {
		System.out.println("login success");
	}
	else {
		System.out.println("login faled");
	}
}
public static void main(String[] args) {
	functionoverloading u1=new functionoverloading();
	u1.login(9094433244L);
	
	u1.login("aadi","1212");
	u1.login("anjali@gmail.com");
}
}



//package Polymorphism;
//import java.util.Scanner;
//
//public class functionoverloading {
//
//    void login(long mobileno) {
//        int otp = (int)(Math.random() * 10000);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Generated OTP: " + otp);
//        System.out.print("Enter OTP: ");
//        int userotp = sc.nextInt();
//
//        if (userotp == otp) {
//            System.out.println("Login successful via Mobile");
//        } else {
//            System.out.println("Login failed");
//        }
//    }
//
//    void login(String username, String pass) {
//        if (username.equals("anjali") && pass.equals("1212")) {
//            System.out.println("Login successful via Username");
//        } else {
//            System.out.println("Login failed");
//        }
//    }
//
//    void login(String email) {
//        if (email.contains("@")) {
//            System.out.println("Login successful via Email");
//        } else {
//            System.out.println("Login failed");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        functionoverloading u1 = new functionoverloading();
//
//        System.out.println("===== LOGIN MENU =====");
//        System.out.println("1. Login with Mobile");
//        System.out.println("2. Login with Username & Password");
//        System.out.println("3. Login with Email");
//
//        System.out.print("Enter your choice: ");
//        int choice = sc.nextInt();
//
//        switch (choice) {
//
//            case 1:
//                System.out.print("Enter Mobile Number: ");
//                long mobile = sc.nextLong();
//                u1.login(mobile);
//                break;
//
//            case 2:
//                sc.nextLine(); // clear buffer
//                System.out.print("Enter Username: ");
//                String uname = sc.nextLine();
//                System.out.print("Enter Password: ");
//                String pass = sc.nextLine();
//                u1.login(uname, pass);
//                break;
//
//            case 3:
//                sc.nextLine(); // clear buffer
//                System.out.print("Enter Email: ");
//                String email = sc.nextLine();
//                u1.login(email);
//                break;
//
//            default:
//                System.out.println("Invalid Choice");
//        }
//
//        sc.close();
//    }
//}
























