/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap01 {
    public static void main(String[] args) {
        double a,b;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("----GIAI PHUONG TRINH BAC 1: ax+b=0----");
        //b1. Nhap he so a,b
        System.out.print("Nhap he so a:");
        a=sc.nextDouble();
        System.out.print("Nhap he so b:");
        b=sc.nextDouble();
        //b2. giai va bien luan
        if(a==0)
        {
            if(b==0){
                kq="Phuong trinh VSN";
            }
            else{
                kq="Phuong trinh vo nghiem";
            }
        }else//a!=0
        {
            kq="Phuong trinh co nghiem x=" + (-b/a);
        }
        //b3. xuat ket qua
        System.out.println(kq);
    }
}
