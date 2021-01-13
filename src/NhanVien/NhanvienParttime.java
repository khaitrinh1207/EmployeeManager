package NhanVien;

public class NhanvienParttime extends Nhanvien{
    private int soGioLamViec;

    public NhanvienParttime() {
    }

    public NhanvienParttime(String id, String hoTen, String phone, String email, int soGioLamViec) {
        super(id, hoTen, phone, email);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public double luongThucLinh(){
        return getSoGioLamViec()*100000;
    }

    @Override
    public String toString() {
        return "Nhân viên Parttime : { " +
                super.toString()+
                " ,số giờ làm việc : "+soGioLamViec+
                " ,lương thực lĩnh : "+luongThucLinh()+" VNĐ"+
                '}';
    }
}

