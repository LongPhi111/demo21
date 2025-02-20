package com.example.demo21;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    List<SinhVien> sinhVien;

    public StudentService() {
        this.sinhVien = new ArrayList<>();
    }

    public void addStudent(SinhVien s) {
        this.sinhVien.add(s);
    }

    public void removeStudent(int id) {
        sinhVien.removeIf(s -> s.getId() == id);
    }

    public void updateStudent(SinhVien updateS) {
        for (SinhVien sinhVien : sinhVien) {
            if (sinhVien.getId() == updateS.getId()) {
                sinhVien.setName(updateS.getName());
                sinhVien.setDiemTB(updateS.getDiemTB());
            }
        }
    }
    public Optional<SinhVien> findById(int id) {
        return sinhVien.stream().filter(si -> si.getId() == id).findFirst();
    }


    public List<SinhVien> getSinhVien() {
        return sinhVien;
    }
}
