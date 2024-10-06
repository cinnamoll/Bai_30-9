public class NhanSu {
    private String name;
    private String year;

    public NhanSu(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public NhanSu() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public class Student extends NhanSu {
        private String mssv;

        public Student(String name, String year, String mssv) {
            super(name, year);
            this.mssv = mssv;
        }

        public void setMssv(String mssv) {
            this.mssv = mssv;
        }

        public String getMssv() {
            return mssv;
        }
    }
}
