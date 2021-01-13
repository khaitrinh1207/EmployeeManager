package NhanVien;

public abstract class Nhanvien {
    private String hoTen;
    private String id;
    private String phone;
    private String email;

    public Nhanvien() {
    }

    public Nhanvien(String id, String hoTen, String phone, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double luongThucLinh();

    @Override
    public String toString() {
        return "Họ tên : "+hoTen+
                ", mã nhân viên : " +id+
                ", SĐT : "+phone+
                ", email : "+ email;
    }
}
