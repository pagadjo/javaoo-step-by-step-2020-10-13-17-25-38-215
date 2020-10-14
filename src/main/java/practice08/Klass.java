package practice08;

public class Klass {
    Integer number;

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
    }

