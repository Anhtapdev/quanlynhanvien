import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
        dsNhanVien.add(new NhanVien("NV01", "Nguyen Van A", true, 15));
        dsNhanVien.add(new NhanVien("NV02", "Tran Thi B", false, 10));
        dsNhanVien.add(new NhanVien("NV03", "Le Van C", true, 20));
        dsNhanVien.add(new NhanVien("NV04", "Pham Thi D", false, 5));
        dsNhanVien.add(new NhanVien("NV05", "Hoang Van E", true, 8));
    }

    public List<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void themNhanVien(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    public void xoaNhanVien(int index) {
        if (index >= 0 && index < dsNhanVien.size()) {
            dsNhanVien.remove(index);
        }
    }

    public void suaNhanVien(int index, NhanVien nv) {
        if (index >= 0 && index < dsNhanVien.size()) {
            dsNhanVien.set(index, nv);
        }
    }

    public void ghiFile() {
        // Code để ghi dữ liệu vào file
    }
}
