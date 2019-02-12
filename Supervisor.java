package com.company;

public class Supervisor extends Pegawai{
    public Supervisor(){
        this.tarif=600000;
    }
    public void gajiPegawai(){
        System.out.println("Tarif Gaji Pegawai"+ this.tarif);
    }
    public void Data( String Nama,String Jabatan){
       System.out.println(" Tarif Gaji Pegawai yang bernama"+" " + Nama+ " "+" dengan jabatan"+" " +Jabatan + " "+"adalah");
    }
}
