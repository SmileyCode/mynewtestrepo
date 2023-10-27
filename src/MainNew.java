import java.util.Arrays;

public class MainNew {

    public static void main(String[] args) {
        String list = "Молоко,Яйца,Хлеб";
        Product milk = new Product();
        milk.setName("Молоко");
        milk.setCount(-1);

        Product eggs = new Product("Яйца", -10);

        Product[] arr = new Product[2];
        arr[0] = milk;
        arr[1] = eggs;

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].getName());
    }
}
