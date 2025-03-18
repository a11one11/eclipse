package cn.bhu.example;

public class Student {
    private String Sname;
    private String Sno;
    private String Sgender;


    public String getSname() { return Sname; }
    public void setSname(String sname) { Sname = sname; }
    public String getSno() { return Sno; }
    public void setSno(String sno) { Sno = sno; }
    public String getSgender() { return Sgender; }
    public void setSgender(String sgender) { Sgender = sgender; }

    @Override
    public String toString() {
        return "Student{" +
                "Sname='" + Sname + '\'' +
                ", Sno='" + Sno + '\'' +
                ", Sgender='" + Sgender + '\'' +
                '}';
    }
}