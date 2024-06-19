package CustomLinkedList_2_5;

import java.util.function.Consumer;

public class Main{

    public static void main(String[] args) {

        //Односвязный список
        System.out.println("\n Односвязный список \n");
        LinkedList list = new LinkedList();

        // Добавляем значения в начало списка
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);

        // Выводим все значения списка
        System.out.println("Перебор всех элементов списка:");
        list.forEachNode(System.out::println);

        // Выводим значения от головного узла до узла с заданным значением
        int target = 2;
        System.out.println("\nПеребор от головного узла до узла с значением " + target + ":");
        list.forEachUntil(System.out::println, target);

        // Выводим значения от узла с заданным значением до конца списка
        System.out.println("\nПеребор от узла с значением " + target + " до конца списка:");
        list.forEachFrom(System.out::println, target);

        System.out.println("________________________________________");

        //Двусвязный список
        System.out.println("\n Двусвязный список \n");
        DoublyLinkedList list2 = new DoublyLinkedList();

        // Добавляем значения в начало списка
        list2.addToFront(3);
        list2.addToFront(2);
        list2.addToFront(1);

        // Добавляем значения в конец списка
        list2.addToLast(4);
        list2.addToLast(5);

        // Перебор всех элементов списка
        System.out.println("Перебор всех элементов списка:");
        list2.forEachNode(System.out::println);

        // Перебор всех элементов списка от последнего элемента к первому
        System.out.println("\nПеребор всех элементов списка от последнего элемента к первому:");
        list2.forEachBackward((Consumer<Integer>) System.out::println);

        // Перебор содержимого списка от головного узла до узла с заданным значением
        target = 2;
        System.out.println("\nПеребор содержимого списка от головного узла до узла с значением " + target + ":");
        list2.forEachFromHeadToTarget(System.out::println, target);

        // Перебор содержимого списка от хвостового узла до узла с заданным значением
        System.out.println("\nПеребор содержимого списка от хвостового узла до узла с значением " + target + ":");
        list2.forEachFromTailToTarget(System.out::println, target);

    }
}
