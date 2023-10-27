package hw6;

public class Human {

    private String name;
    private boolean sex; //true / false
    private int age;
    private Human dad;
    private Human mom;

    public Human(String name, boolean sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
    }

    public Human(String name, boolean sex, int age, Human dad, Human mom) {
        this(name,sex,age);
        setDad(dad);
        setMom(mom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getDad() {
        return dad;
    }

    public void setDad(Human dad) {
        this.dad = dad;
    }

    public Human getMom() {
        return mom;
    }

    public void setMom(Human mom) {
        this.mom = mom;
    }

    public String toString() {
        String text = "";
        text += "Имя: " + getName();
        text += ", пол: " + (isSex() ? "женский" : "мужской");
        text += ", возраст: " + getAge();
        if (getDad() != null) {
            text += ", отец: " + getDad();
        }
        if (getMom() != null) {
            text += ", мать: " + getMom();
        }
        return text;
    }
}
