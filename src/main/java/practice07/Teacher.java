package practice07;

public class Teacher extends Person{
    Klass klass = new Klass();
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }
    public Integer getKlassNum(){
        return klass.getNumber();
    }

    public String introduce(){
      String mainString = super.introduce() +" "+  "I am a Teacher. ";
      String hasClass =  "I teach Class " + getKlass().getNumber() + ".";
      String noClass = "I teach No Class.";
        return  getKlass().getNumber() != null ? mainString + hasClass : mainString + noClass;
    }

    public String introduceWith(Student studentName){
        String mainString = super.introduce() +" "+  "I am a Teacher. ";
        String inClass =  "I teach " + studentName.getName() + ".";
        String notInClass = "I don't teach " + studentName.getName()  + ".";
        return klass.getNumber() == studentName.getKlassNum() ? mainString + inClass : mainString + notInClass;
    }
}
