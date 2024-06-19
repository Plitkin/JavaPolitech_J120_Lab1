package ContingentUniversity_3_4;

import java.util.ArrayList;
import java.util.List;

enum Gender {
    MALE, FEMALE
}

// Перечисление для представления учёных степеней
enum AcademicDegree {
    MSc, PhD
}

// Перечисление для представления ступеней обучения
enum StudyStage {
    Bachelor, Master
}

public class Main {
    public static void main(String[] args) {

        // Задание 3: Извлечение данных из параметризованной коллекции
        System.out.println("\nЗадание 3\n");

        // Создаем список персон и добавляем в него учителя и студента
        List<Persona> personas = new ArrayList<>();
        personas.add(new Teacher("Ronald Turner", Gender.MALE, "Computer science", AcademicDegree.PhD, "Programming paradigms"));
        personas.add(new Student("Leo Wilkinson", Gender.MALE, "Computer science", StudyStage.Bachelor, 3));

        // Выводим информацию о персонах из списка
        Persona.printCollection(personas);

        // Создаем список студентов и добавляем в него двух студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Cunningham", Gender.FEMALE, "World economy", StudyStage.Bachelor, 1));
        students.add(new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", StudyStage.Master, 1));

        // Выводим информацию о студентах из списка
        Persona.printCollection(students);

        // Метод printCollection может быть использован с коллекциями,
        // параметризованными как Collection<Persona> и Collection<Student>,
        // так как Student является дочерним классом Persona.

        System.out.println("_____________________________________\n");

        // Задание 4: Заполнение параметризованной коллекции
        System.out.println("\nЗадание 4\n");

        // Создаем список студентов и заполняем его данными
        List<Student> student = new ArrayList<>();
        Student.fillCollection(student);

        // Выводим информацию о студентах из заполненного списка
        for (Student studen : student) {
            studen.print();
            System.out.println();
        }

        // Создаем список персон и заполняем его данными
        List<Persona> persona = new ArrayList<>();
        Student.fillCollection(persona);

        // Выводим информацию о персонах из заполненного списка
        for (Persona person : persona) {
            person.print();
            System.out.println();
        }





//        // Массив персон
//        Persona[] people = {
//                new Teacher("Ronald Turner", Gender.MALE, "Computer science", AcademicDegree.PhD, "Programming paradigms"),
//                new Teacher("Ruth Hollings", Gender.FEMALE, "Jurisprudence", AcademicDegree.MSc, "Domestic arbitration"),
//                new Student("Leo Wilkinson", Gender.MALE, "Computer science", StudyStage.Bachelor, 3),
//                new Student("Anna Cunningham", Gender.FEMALE, "World economy", StudyStage.Bachelor, 1),
//                new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", StudyStage.Master, 1),
//                new GraduateStudent("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language.")
//        };
//
//        // Вывод информации о персонах
//        for (Persona person : people) {
//            person.print();
//            System.out.println();
//        }
    }
}