package practice10;

public class Student extends Person {
    Klass klass = new Klass();

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getKlassNum() {
        return klass.getNumber();
    }

    public String introduce() {
        String mainString = super.introduce();
        String ifLeader = " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        String ifNotLeader = " I am a Student. I am at " + klass.getDisplayName() + ".";
        return this.klass.getLeader() != null ? mainString + ifLeader : mainString + ifNotLeader;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
