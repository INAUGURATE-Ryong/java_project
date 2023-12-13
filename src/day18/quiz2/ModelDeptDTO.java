package day18.quiz2;

public class ModelDeptDTO { // Model - ~~Vo, ~~DTO, ~~TO
    public final String ClassName = "dept";
    private int deptno;
    private String dname,loc;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getClassName(){
        return ClassName;
    }
}
