package ContingentUniversity_3_4;

class Teacher extends Persona{

    private AcademicDegree academicDegree;
    private String specialization;

    Teacher(String name, Gender gender, String faculty, AcademicDegree academicDegree, String specialization) {
        super(name, gender, faculty);
        setAcademicDegree(academicDegree);
        setSpecialization(specialization);
    }

    // Сеттеры
    public void setAcademicDegree(AcademicDegree academicDegree) {
        if (academicDegree == null) {
            throw new IllegalArgumentException("Учёная степень не может быть null");
        }
        this.academicDegree = academicDegree;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Специализация не может быть пустой или состоять только из пробелов");
        }
        this.specialization = specialization;
    }

    // Геттеры
    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    // Выводит информацию о преподавателе
    public void print(){
        super.print();
        System.out.println(getPronoun() + " has " + getAcademicDegree() + " degree in " + getSpecialization() + ".");
    }
}
