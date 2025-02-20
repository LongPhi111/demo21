package com.example.demo21;

public class Student {

    public static double TinhDTB(double[] dtb){
        if(dtb.length == 0) return 0.0;
        double tong = 0;
        for(double d : dtb){
            tong += d;
        }
        return tong/dtb.length;
    }

    public static String xepLoai(double hocLuc){
        if(hocLuc >= 8.0) return "Giỏi";
        if(hocLuc >= 6.5) return "Khá";
        if(hocLuc >= 5) return "Trung bình";
        return "Yếu";
    }
}
