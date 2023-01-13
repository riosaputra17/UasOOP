/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.riosaputra.tugasuasoop;

/**
 *
 * @author Lenovo
 */
public class Programmer implements Karyawan{

    String id = "";
    String nama = "";
    String pekerjaan = "";
    Task mTask;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Task getmTask() {
        return mTask;
    }

    public void setmTask(Task mTask) {
        this.mTask = mTask;
    }

    public Programmer() {
        mTask = new Task();
    }

    @Override
    public String perkenalan() {
        return "Nama saya " + this.nama + " dengan nomor ID : " + this.id + " bekerja sebagai " + this.pekerjaan;
    }
    
    @Override
    public String pekerjaan() {
        return "Pekerjaan saya " + mTask.getTask() + " dengan melakukan " + mTask.getDeskripsi();
    }

    
}
