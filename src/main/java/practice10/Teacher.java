package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList klassLinkedList = new LinkedList();
    private Klass klass = new Klass();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Integer> getClasses() {
        return klassLinkedList;
    }

    public Integer getKlassNum() {
        return klass.getNumber();
    }

    //TODO : print with getClasses()
    public String introduce() {
        String mainString = super.introduce() + " " + "I am a Teacher. ";
        String hasClass = "I teach Class " + getKlassNum() + ".";
//        String hasClasses = "I teach Class " + klassLinkedList.stream(),map(asd).map(String::valueOf).collect(Collectors.joining(","));
        String hasClasses = "I teach Class " + getKlassNum() + ".";
        String noClass = "I teach No Class.";
//        return getKlassNum() != null ? mainString + hasClass: mainString + noClass;
        return getKlassNum() != null ? mainString + hasClass : mainString + noClass;
    }

    public String introduceWith(Student studentName) {
        String mainString = super.introduce() + " " + "I am a Teacher. ";
        String inClass = "I teach " + studentName.getName() + ".";
        String notInClass = "I don't teach " + studentName.getName() + ".";
        return getClasses().indexOf(studentName.getKlass()) == 0 ? mainString + inClass : mainString + notInClass;
    }

    public Boolean isTeaching(Student student) {

        return getClasses().contains(student.getKlass());
    }
}
