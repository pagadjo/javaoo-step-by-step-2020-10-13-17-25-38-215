package practice08;

public class Student extends Person {
    Klass klass = new Klass();

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Klass getKlass(){
        return klass;
    }

    public int getKlassNum(){return klass.getNumber();}
    public String introduce(){
        return super.introduce() +" "+  "I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
