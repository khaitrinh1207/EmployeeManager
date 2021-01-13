import NhanVien.Nhanvien;
import NhanVien.NhanvienParttime;
import NhanVien.Nhanvienfulltime;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private ArrayList<Nhanvien> dsnv;

    public Manager() {
        this.dsnv = new ArrayList<>();
    }

    public void themNhanVien(Nhanvien nv){
        dsnv.add(nv);
    }

    public void hienThiListNhanVien(){
        for (Nhanvien i: dsnv) {
            System.out.println(i);
        }
    }

    public double luongTrungBinh(){
        int sum = 0;
        for (Nhanvien i : dsnv) {
            sum += i.luongThucLinh();
        }
        int avg = sum/dsnv.size();
        return avg;
    }

    public void listLowSalory(){
        for (Nhanvien i: dsnv) {
            if( (i instanceof Nhanvienfulltime) && i.luongThucLinh() < luongTrungBinh()){
                System.out.println(i);
            }

        }
    }

    public double allSalaryOfParttime(){
        double sum = 0;
        for (Nhanvien i: dsnv) {
            if( i instanceof NhanvienParttime){
                sum += i.luongThucLinh();
            }
        }
        return sum;
    }

    public List<Nhanvien> sortSalaryFullTime(){
        List<Nhanvien> nhanviens = new ArrayList<>();
        for (Nhanvien i: dsnv) {
            if(i instanceof Nhanvienfulltime){
                nhanviens.add(i);
            }
        }
        for (int i = 1; i < nhanviens.size(); i++) {
            for (int j = 0; j < nhanviens.size()-i; j++) {
                if(nhanviens.get(j).luongThucLinh() > nhanviens.get(j+1).luongThucLinh()){
                    Nhanvien e = nhanviens.get(j);
                    nhanviens.set(j, nhanviens.get(j+1));
                    nhanviens.set(j+1, e);
                }
            }
        }
        return nhanviens;
    }
}
