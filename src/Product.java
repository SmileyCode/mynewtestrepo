public class Product {

    private String name;
    private Integer count;

    public Product() {
    }

    public Product(String name, Integer count) {
        setName(name);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        if (count < 0) {
            count = Math.abs(count);
        }
        this.count = count;
    }

    public String print(){
        return name + " " + count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
