package by.epam.belstu.bean;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String tittle;
    private String shortTittle;
    private List<Faculty> faculties;

    public University(){
        this.tittle = null;
        this.shortTittle = null;
        this.faculties = new ArrayList<Faculty>();
    }
    public University(String tittle, String shortTittle, List<Faculty> faculties){
        this.tittle = tittle;
        this.shortTittle = shortTittle;
        this.faculties = faculties;
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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
    public void addFaculty(Faculty faculty){
        this.faculties.add(faculty);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        if (!tittle.equals(that.tittle)) return false;
        if (!shortTittle.equals(that.shortTittle)) return false;
        return faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        int result = tittle.hashCode();
        result = 31 * result + shortTittle.hashCode();
        result = 31 * result + faculties.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "University{" +
                "tittle='" + tittle + '\'' +
                ", shortTittle='" + shortTittle + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
