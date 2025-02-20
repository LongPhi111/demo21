package com.example.demo21;

public class SinhVien {
    private int id;
    private String name;
    private double diemTB;

    public SinhVien(int id, String name, double diemTB) {
        this.id = id;
        this.name = name;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
