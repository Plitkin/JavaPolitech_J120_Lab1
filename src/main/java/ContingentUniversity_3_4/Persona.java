package ContingentUniversity_3_4;

import java.util.Collection;

public class Persona {
    private String name;
    Gender gender;
    private String faculty;

    Persona(String name, Gender gender, String faculty){
        setName(name);
        setGender(gender);
        setFaculty(faculty);
    }

    //статический метод, печатающий данные обо всех персонах
    public static void printCollection(Collection<? extends Persona> collection) {
        for (Persona person : collection) {
            person.print();
            System.out.println();
        }
    }

    // Сеттеры
    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    private void setGender(Gender gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Пол не может быть null");
        }
        this.gender = gender;
    }

    private void setFaculty(String faculty) {
        if (faculty == null || faculty.trim().isEmpty()) {
            throw new IllegalArgumentException("Название факультета не может быть null или пустым");
        }
        this.faculty = faculty;
    }

    // Геттеры
    private String getName() {
        return name;
    }

    private String getFaculty() {
        return faculty;
    }

    // Возвращает местоимение в зависимости от пола
    public String getPronoun() {
        return (gender == Gender.MALE) ? "He" : "She";
    }

    public String getPossessivePronoun() {
        return (gender == Gender.MALE) ? "His" : "Her";
    }

    // Возвращает глагол в зависимости от типа персоны
    public String getVerb() {
        return (this instanceof Teacher) ? "teaches" : "studies";
    }

    public void print(){
        System.out.println("This is " + getName() + ". " + getPronoun() + " " + getVerb() + " at " + getFaculty() + ".");
    }
}