import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class TestQueue {
    private static final List<String> NAMES = List.of(
            "Иван Иванов",
            "Петр Петров",
            "Сидор Сидоров",
            "Михаил Иванов",
            "Сергей Петров",
            "Евгений Жуков",
            "Петр Васильев",
            "Василий Михайлов",
            "Мария Иванова",
            "Александра Сергеева",
            "Евгения Жукова",
            "Алексей Сергеев",
            "Артур Мишин"
    );
private  static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь :" + queue1 );
        System.out.println("Вторая очередь :" + queue2 );

        add("Владимир Петро", queue1, queue2);

        System.out.println();
        System.out.println("Первая очередь :" + queue1 );
        System.out.println("Вторая очередь :" + queue2 );

        remove(queue1,queue2);
        System.out.println();
        System.out.println("Первая очередь :" + queue1 );
        System.out.println("Вторая очередь :" + queue2 );
    }
private static void add(String name, Queue<String> queue1,
                        Queue<String> queue2) {
    if (queue1.size() == 6 && queue2.size() == 6) {
        System.out.println("Нужно позвать Галю!");
        return;
    }
    if (queue1.size() < queue2.size()) {
        queue1.offer(name);

    } else  {
        queue2.offer(name);
    }
    }

    private static void remove(Queue<String> queue1,
                               Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
            
        }
    }
}
