/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap08 {
    public static void main(String[] args) {
        int n;
        int s;
        Scanner sc=new Scanner(System.in);
        System.out.println("---TINH TOAN DAY SO : 1+2+3...+5---");
        //b1. doc so nguyen tu ban phim
        System.out.print("Nhap gia tri n:");
        n=sc.nextInt();
        //b2. tinh tong day so
        s=0;
        for (int i = 1; i <=n ; i++) {
            s=s+i; //s+=i;
        }
        //b3. xuat ket qua
        System.out.println("Trong day so:" + s);
    }
}
