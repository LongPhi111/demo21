package com.example.demo21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;
    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @Test
    void testaddS(){
        SinhVien sinhVien = new SinhVien(1, "Phạm Lương Hiệp", 8.5);
        studentService.addStudent(sinhVien);
        assertEquals(1, studentService.getSinhVien().size());
    }

    @Test
    void testRemove(){
        SinhVien sinhVien = new SinhVien(1, "Phạm Lương Hiệp", 8.5);
        studentService.addStudent(sinhVien);
        studentService.removeStudent(1);
        assertEquals(0, studentService.getSinhVien().size());
    }

    @Test
    void testUpdate(){
        SinhVien sinhVien = new SinhVien(1, "Phạm Lương Hiệp",8.5);
        studentService.addStudent(sinhVien);
        SinhVien updateS = new SinhVien(1, "Phạm Lương Hiệp",9.5);
        studentService.addStudent(updateS);
        Optional<SinhVien> sinhVien1 = studentService.findById(1);
        assertTrue(sinhVien1.isPresent());
        assertEquals("Phạm Lương Hiệp", sinhVien1.get().getName());
    }

    @Test
    void testFindAll(){
        SinhVien sinhVien = new SinhVien(1, "Phạm Lương Hiệp",8.5);
        studentService.addStudent(sinhVien);
        Optional<SinhVien> sinhVien1 = studentService.findById(1);
        assertTrue(sinhVien1.isPresent());
        assertEquals("Phạm Lương Hiệp", sinhVien1.get().getName());
    }

}