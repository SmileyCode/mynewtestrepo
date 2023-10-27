package hw6;

//- Имя,
//- Имя, вес, возраст
//- Имя, возраст (вес стандартный)
//- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
//- вес, цвет, адрес (чужой домашний кот)
public class Cat {
    private String name;
    private Integer weight;
    private Integer age;
    private String color;
    private String address;

    public Cat(String name) {
        setName(name);
        setAddress("Бездомный");
    }

    public Cat(String name, Integer weight, Integer age) {
        this(name);
        setWeight(weight);
        setAge(age);
    }

    public Cat(String name, Integer age) {
        this(name,null,age);
    }

    public Cat(Integer weight, String color) {
        this(null,weight,null);
        setColor(color);
    }

    public Cat(Integer weight, String color, String address) {
        this(weight, color);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight == null || weight < 5) {
            weight = 5;
        }
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            color = "Черный";
        }
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
