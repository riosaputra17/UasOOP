/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.riosaputra.tugasuasoop;

/**
 *
 * @author Lenovo
 */
public class Manager implements Karyawan{
    
    String id = "";
    String nama = "";
    String jabatan = "";
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

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Task getmTask() {
        return mTask;
    }

    public void setmTask(Task mTask) {
        this.mTask = mTask;
    }

    public Manager() {
        mTask = new Task();
    }

    @Override
    public String perkenalan() {
        return "Nama saya " + this.nama + " dengan nomor ID : " + this.id + " menjabat sebagai " + this.jabatan;
    }
    
    @Override
    public String pekerjaan() {
        return "Pekerjaan saya " + mTask.getTask() + " dengan melakukan " + mTask.getDeskripsi();
    }

    
}
