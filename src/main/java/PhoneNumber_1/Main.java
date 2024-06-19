package PhoneNumber_1;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов PhoneNumber
        PhoneNumber number1 = new PhoneNumber("981", "0234567");
        PhoneNumber number2 = new PhoneNumber("7890", "654321");
        PhoneNumber number3 = new PhoneNumber("981", "0234567");  // Дубликат номера number1

        // Используем множество для проверки уникальности номеров
        Set<PhoneNumber> phoneNumbersSet = new HashSet<>();
        phoneNumbersSet.add(number1);
        phoneNumbersSet.add(number2);
        phoneNumbersSet.add(number3);  // Этот объект не должен быть добавлен, так как он дублирует number1

        System.out.println("\nУникальные номера в множестве:");
        for (PhoneNumber number : phoneNumbersSet) {
            System.out.println(number);
        }

        System.out.println("\nХэши номеров в множестве:");
        for (PhoneNumber number : phoneNumbersSet) {
            System.out.println(number.hashCode());
        }

        // Используем ассоциативный массив для хранения значений по номерам
        Map<PhoneNumber, String> phoneBook = new HashMap<>();
        phoneBook.put(number1, "Viktor");  // Этот объект не будет добавлен
        phoneBook.put(number2, "Alex");
        phoneBook.put(number3, "Vlad");

        System.out.println("\nТелефонная книга:");
        for (Map.Entry<PhoneNumber, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

