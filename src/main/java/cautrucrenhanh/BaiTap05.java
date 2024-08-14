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
public class BaiTap05 {
    public static void main(String[] args) {
        double km;
        double tientra;
        Scanner sc= new Scanner(System.in);
        System.out.println("---TINH TIEN TAXI---");
        //b1. Nhap so km
        System.out.print("Cho biet so km:");
        km=sc.nextDouble();
        //b2. 1.tinh tien
        if (km<=1){
            tientra = 15000;
        }else if(km<=5){
            tientra = 15000 + (km-1)*13500;
        }
    }
}
