package by.epam.belstu.bean;


import java.util.ArrayList;
import java.util.List;

public class Group {
    private int nubmerGroup;
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<>();
    }

    public int getNubmerGroup() {
        return nubmerGroup;
    }

    public void setNubmerGroup(int nubmerGroup) {
        this.nubmerGroup = nubmerGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (nubmerGroup != group.nubmerGroup) return false;
        return students.equals(group.students);
    }

    @Override
    public int hashCode() {
        int result = nubmerGroup;
        result = 31 * result + students.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nubmerGroup=" + nubmerGroup +
                ", students=" + students +
                '}';
    }
}
