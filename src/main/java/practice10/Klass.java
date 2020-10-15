package practice10;

public class Klass {
    private Integer number;
    private Student klassLeader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Klass() {
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return klassLeader;
    }

    public void assignLeader(Student studentLeader) {
        if (this.number.equals(studentLeader.getKlass().getNumber())) {
            this.klassLeader = studentLeader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}
