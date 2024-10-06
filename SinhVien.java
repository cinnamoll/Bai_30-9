public class SinhVien extends NhanSu {
    private double gpa;

    public SinhVien(String name, int year, double gpa) {
        super(name, year);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
