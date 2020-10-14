package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass(){return klass;}
    public String introduce(){
        String mainString = super.introduce() +" "+  "I am a Teacher. ";
        String hasClass =  "I teach Class " + getKlass() + ".";
        String noClass = "I teach No Class.";

        return klass !=0 ? mainString + hasClass :mainString + noClass;
    }
}
