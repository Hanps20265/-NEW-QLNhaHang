package Model;

public class ThucDon {
    public String maMon;
    public String maLoaiMon;
    public String tenMon;
    public String gia;
    public String donViHoaDon;

    public ThucDon() {
    }

    public ThucDon(String maMon, String tenMon, String gia, String donViHoaDon, String maLoaiMon) {
        this.maMon = maMon;
        this.maLoaiMon = maLoaiMon;
        this.tenMon = tenMon;
        this.gia = gia;
        this.donViHoaDon = donViHoaDon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaLoaiMon() {
        return maLoaiMon;
    }

    public void setMaLoaiMon(String maLoaiMon) {
        this.maLoaiMon = maLoaiMon;
    }

    public String getDonViHoaDon() {
        return donViHoaDon;
    }

    public void setDonViHoaDon(String donViHoaDon) {
        this.donViHoaDon = donViHoaDon;
    }
    
    
}
