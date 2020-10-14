package practice09;

public class Klass {
    Integer number;
    Student klassLeader;

    public Klass(Integer number) {
        this.number = number;
    }
    public Klass() {}

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
        if(this.number == studentLeader.getKlass().getNumber()) {
            this.klassLeader = studentLeader;
        }else{ System.out.print("It is not one of us.\n");}
    }

}
