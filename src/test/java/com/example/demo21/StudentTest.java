package com.example.demo21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testDiem(){
        assertEquals(8.0, Student.TinhDTB(new double[]{8,8,8}),0.01);
        assertEquals(5.5, Student.TinhDTB(new double[]{5,6}),0.01);
        assertEquals(0.0, Student.TinhDTB(new double[]{}),0.01);
        assertEquals(10.0, Student.TinhDTB(new double[]{10,10,10}),0.01);
        assertEquals(2.5, Student.TinhDTB(new double[]{0, 5}),0.01);
    }

    @Test
    void testXLHL(){

        assertEquals("Giỏi", Student.xepLoai(8.5));
        assertEquals("Trung bình", Student.xepLoai(5.5));
        assertEquals("Yếu", Student.xepLoai(0.0));
        assertEquals("Giỏi", Student.xepLoai(10.0));
        assertEquals("Yếu", Student.xepLoai(2.5));
    }
}