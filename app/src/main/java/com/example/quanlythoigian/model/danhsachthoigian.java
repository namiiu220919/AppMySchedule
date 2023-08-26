package com.example.quanlythoigian.model;

public class danhsachthoigian {

private String thu;
private int ngay;
private String loichuc;
private String loinhac;

    public danhsachthoigian() {

    }
    //class này bỏ
    public danhsachthoigian(String thu, int ngay, String loichuc, String loinhac) {
        this.thu = thu;
        this.ngay = ngay;
        this.loichuc = loichuc;
        this.loinhac = loinhac;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public String getLoichuc() {
        return loichuc;
    }

    public void setLoichuc(String loichuc) {
        this.loichuc = loichuc;
    }

    public String getLoinhac() {
        return loinhac;
    }

    public void setLoinhac(String loinhac) {
        this.loinhac = loinhac;
    }
}
