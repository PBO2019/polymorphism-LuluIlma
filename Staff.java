package com.company;

public class Staff extends Pegawai {
    public Staff() {
        this.tarif=700000;

    }
    public void gajiPegawai(String nama,String Jabatan){
        System.out.println(" Tarif Gaji Pegawai"+ " "+ nama + "dengan jabatan "+ " "+Jabatan+ " "+ " adalah");
    }
}
