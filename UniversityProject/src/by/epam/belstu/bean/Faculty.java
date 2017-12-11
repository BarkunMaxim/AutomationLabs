package by.epam.belstu.bean;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String tittle;
    private String shortTittle;
    private List<Group> groups;

    public Faculty() {
        this.tittle = null;
        this.shortTittle = null;
        this.groups = new ArrayList<Group>();
    }

    public Faculty(String tittle, String shortTittle, List<Group> groups) {

        this.tittle = tittle;
        this.shortTittle = shortTittle;
        this.groups = groups;
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

    public List<Group> getGroups() {
        return groups;
    }
    public void addCroup(Group group){
        this.groups.add(group);
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (!tittle.equals(faculty.tittle)) return false;
        if (!shortTittle.equals(faculty.shortTittle)) return false;
        return groups.equals(faculty.groups);
    }

    @Override
    public int hashCode() {
        int result = tittle.hashCode();
        result = 31 * result + shortTittle.hashCode();
        result = 31 * result + groups.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "tittle='" + tittle + '\'' +
                ", shortTittle='" + shortTittle + '\'' +
                ", groups=" + groups +
                '}';
    }
}
