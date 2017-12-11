package by.epam.belstu.bean;

import java.util.ArrayList;
import java.util.List;

public class Discipline {
    private String tittle;
    private String shortTittle;
    private List<Integer> marks;

    public Discipline() {
        this.tittle = null;
        this.shortTittle = null;
        this.marks = new ArrayList();
    }

    public Discipline(String tittle, String shortTittle, List marks) {
        this.tittle = tittle;
        this.shortTittle = shortTittle;
        this.marks = marks;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getShortTittle() {
        return shortTittle;
    }

    public void setShortTittle(String shortTittle) {
        this.shortTittle = shortTittle;
    }

    public List getMarks() {
        return marks;
    }

    public void setMarks(List marks) {
        this.marks = marks;
    }

    public void addMark(Integer mark) {
        if (mark != null) {
            this.marks.add(mark);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discipline that = (Discipline) o;

        if (!tittle.equals(that.tittle)) return false;
        if (!shortTittle.equals(that.shortTittle)) return false;
        return marks.equals(that.marks);
    }

    @Override
    public int hashCode() {
        int result = tittle.hashCode();
        result = 31 * result + shortTittle.hashCode();
        result = 31 * result + marks.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "tittle='" + tittle + '\'' +
                ", shortTittle='" + shortTittle + '\'' +
                ", marks=" + marks +
                '}';
    }
}
