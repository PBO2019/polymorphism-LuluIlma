package com.company;

public class Pegawai {

    protected int tarif=600000;

   public static void main(String[]args){
       Supervisor Sp= new Supervisor();
       Staff St= new Staff();
       Perhitungan Ph= new Perhitungan();

       Sp.Data("Alamismansyah","Suupervisor");
       Ph.jumlahGaji(Sp.tarif);
       St.gajiPegawai("Cici Paramida","Staff Keuangan");
       Ph.jumlahGaji( St.tarif);
   }
}
