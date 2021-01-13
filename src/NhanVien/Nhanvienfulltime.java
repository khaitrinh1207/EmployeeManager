package NhanVien;

public class Nhanvienfulltime extends Nhanvien{
    private double luongCung;
    private double tienThuong;
    private double tienPhat;

    public Nhanvienfulltime() {
    }

    public Nhanvienfulltime(String id, String hoTen, String phone, String email, double luongCung, double tienThuong, double tienPhat) {
        super(id, hoTen, phone, email);
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double luongThucLinh(){
        return getLuongCung()-(getTienThuong()-getTienPhat());
    }

    @Override
    public String toString() {
        return "Nhân viên Fulltime : { " +
                super.toString()+
                " ,lương cứng : "+luongCung+" VNĐ"+
                ", thưởng : "+tienThuong+" VNĐ"+
                ", tiền phạt : "+tienPhat+ " VNĐ"+
                " ,lương thực lĩnh : "+luongThucLinh()+" VNĐ"+
                '}';
    }
}
