package com.example.tprak4;

public class logomodel {
    String nama;
    String pencipta;
    String tahun;
    int image;

    public logomodel(String nama,String pencipta,String tahun,int image){
        this.nama = nama;
        this.pencipta = pencipta;
        this.tahun = tahun;
        this.image = image;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getPencipta(){
        return pencipta;
    }
    public void setPencipta(String pencipta){
        this.pencipta = pencipta;
    }

    public String getTahun(){
        return tahun;
    }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }

}
