package practice09;

public class Teacher extends Person {
    private Klass klass = new Klass();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    private Integer getKlassNum() {
        return klass.getNumber();
    }

    public String introduce() {
        String mainString = super.introduce() + " " + "I am a Teacher. ";
        String hasClass = "I teach Class " + getKlassNum() + ".";
        String noClass = "I teach No Class.";
        return getKlassNum() != null ? mainString + hasClass : mainString + noClass;
    }

    public String introduceWith(Student studentName) {
        String mainString = super.introduce() + " " + "I am a Teacher. ";
        String inClass = "I teach " + studentName.getName() + ".";
        String notInClass = "I don't teach " + studentName.getName() + ".";
        return getKlassNum() == studentName.getKlassNum() ? mainString + inClass : mainString + notInClass;
    }
}
