package by.epam.belstu.bean;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private List<Discipline> disciplines;

    public Student() {
        this.name = null;
        this.surname = null;
        this.disciplines = new ArrayList<Discipline>();
    }

    public Student(String name, String surname, List<Discipline> disciplines) {
        this.name = name;
        this.surname = surname;
        this.disciplines = disciplines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
    public void addDisepline (Discipline discipline){
        this.disciplines.add(discipline);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;
        return disciplines.equals(student.disciplines);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + disciplines.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
