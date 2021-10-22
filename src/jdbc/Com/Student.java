package jdbc.Com;

public class Student {
    private int studentId;
    private String sName;
    private String  sBranch;
    private int sNumber;

//    public Student(int studentId, String sName, String sBranch, int sNumber) {
//        super();
//        this.studentId = studentId;
//        this.sName = sName;
//        this.sBranch = sBranch;
//        this.sNumber = sNumber;
//    }

    public Student(String sName, String sBranch, int sNumber) {
        super();
        this.sName = sName;
        this.sBranch = sBranch;
        this.sNumber = sNumber;
    }

    public Student(int studentId) {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsBranch() {
        return sBranch;
    }

    public void setsBranch(String sBranch) {
        this.sBranch = sBranch;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", sName='" + sName + '\'' +
                ", sBranch='" + sBranch + '\'' +
                ", sNumber=" + sNumber +
                '}';
    }
}
