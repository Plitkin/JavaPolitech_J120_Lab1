package ContingentUniversity_3_4;

import java.util.Collection;

class Student extends Persona{

    private StudyStage studyStage;
    private int course;
    Student(String name, Gender gender, String faculty, StudyStage studyStage, int course) {
        super(name, gender, faculty);
        setStudyStage(studyStage);
        setCourse(course);
    }

    public static void fillCollection(Collection<? super Student> collection) {
        collection.add(new Student("Leo Wilkinson", Gender.MALE, "Computer science", StudyStage.Bachelor, 3));
        collection.add(new Student("Anna Cunningham", Gender.FEMALE, "World economy", StudyStage.Bachelor, 1));
        collection.add(new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", StudyStage.Master, 1));
    }

    // Сеттеры
    private void setStudyStage(StudyStage studyStage) {
        if (studyStage == null) {
            throw new IllegalArgumentException("Ступень обучения не может быть null");
        }
        this.studyStage = studyStage;
    }

    private void setCourse(int course) {
        if (course < 1 || course > 5) {
            throw new IllegalArgumentException("Номер курса должен быть в диапазоне от 1 до 5");
        }
        this.course = course;
    }

    // Геттеры
    public StudyStage getStudyStage() {
        return studyStage;
    }

    public int getCourse() {
        return course;
    }

    // Метод для преобразования арабских цифр в римские
    private String toRoman(int num) {
        String[] romanNumerals = {"I", "II", "III", "IV", "V"};
        return romanNumerals[num - 1];
    }

    @Override
    // Выводит информацию о студенте
    public void print(){
        super.print();
        System.out.println(getPronoun() + " is " + toRoman(getCourse()) + "‘th year " + getStudyStage() + " student.");
    }
}

class GraduateStudent extends Persona{

    private String thesisTitle;
    GraduateStudent(String name, Gender gender, String faculty, String thesisTitle) {
        super(name, gender, faculty);
        setThesisTitle(thesisTitle);
    }

    // Сеттер
    public void setThesisTitle(String thesisTitle) {
        if (thesisTitle == null || thesisTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Тема диссертации не может быть пустой или состоять только из пробелов");
        }
        this.thesisTitle = thesisTitle;
    }

    // Геттер
    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    // Выводит информацию о аспиранте
    public void print() {
        super.print();
        System.out.println(getPossessivePronoun() + " thesis title is \"" + getThesisTitle() + "\"");
    }
}