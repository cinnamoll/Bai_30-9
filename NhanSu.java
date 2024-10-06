public class NhanSu {
    private String name;
    private int year;

    public NhanSu(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public NhanSu() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
