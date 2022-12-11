package Products;

import java.util.*;

public class TestProducts {
    public static void main(String[] args) {
        Products banan = new Products("Бананы", 56, 1);
        Products apple = new Products("Яболоки", 85, 2);
        Products potatos = new Products("Картофель", 24, 5);
        Products milk = new Products("Молоко", 68, 4);
        Products eggs = new Products("Яйца", 65, 1);
        Products sourCream = new Products("Сметана", 75, 1);
        Products tomatoes = new Products("Помидоры", 89, 3);
        Products cucumbers = new Products("Огурцы", 115, 3);
        Products carrot = new Products("Морковь", 25, 3);

        ProductList productList = new ProductList();
        productList.add(eggs);

        productList.add(apple);

        Random random = new Random();

        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
       Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
        }

        }

