public class Student {

    public String jmenoZaka;
    public int rokZaka;
    public int studentskeCislo;
    public String iD;

    public Student(String jmenoZaka, int rokZaka, int studentskeCislo, String iD) {
        this.jmenoZaka = jmenoZaka;
        this.rokZaka = rokZaka;
        this.studentskeCislo = studentskeCislo;
        this.iD = iD;
    }

    public String getJmenoZaka() {
        return jmenoZaka;
    }

    public void setJmenoZaka(String jmenoZaka) {
        this.jmenoZaka = jmenoZaka;
    }

    public int getRokZaka() {
        return rokZaka;
    }

    public void setRokZaka(int rokZaka) {
        this.rokZaka = rokZaka;
    }

    public int getStudentskeCislo() {
        return studentskeCislo;
    }

    public void setStudentskeCislo(int studentskeCislo) {
        this.studentskeCislo = studentskeCislo;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
    // public Student(String jmenoTridy, int rocnik, int listStudentu, String iD) {
     //   super(jmenoTridy, rocnik, listStudentu);
     //   this.iD = iD;
    //}



    public String studentskyVypis(){
        String getStudent = ("#"+studentskeCislo+"#"+iD+"-"+jmenoZaka+"("+rokZaka+")");
        return getStudent;
    }
    @Override
    public String toString() {
        return studentskyVypis();
    }



}
