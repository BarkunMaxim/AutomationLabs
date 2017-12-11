package by.epam.belstu.logic.impl;

import by.epam.belstu.bean.*;
import by.epam.belstu.logic.IUniversityOperation;

import java.util.ArrayList;
import java.util.List;

public class FacultyService implements IUniversityOperation {

    @Override
    public double calculateAvgUniversity(University university, Discipline discipline) {
        double result = 0;
        double sum = 0;
        List<Faculty> facultyList = university.getFaculties();
        for (Faculty iterator : facultyList) {
            sum += calculateAvgFaculty(iterator, discipline);
        }
        result = sum / facultyList.size();
        return Math.rint(ROUND_VALUE * result) / ROUND_VALUE;
    }

    @Override
    public double calculateAvgFaculty(Faculty faculty, Discipline discipline) {
        double result = 0;
        double sum = 0;
        List<Group> groupList = faculty.getGroups();
        for (Group iterator : groupList) {
            sum += calculateAvgGroup(iterator, discipline);
        }
        result = sum / groupList.size();
        return Math.rint(ROUND_VALUE * result) / ROUND_VALUE;
    }

    @Override
    public double calculateAvgGroup(Group group, Discipline discipline) {
        double result = 0;
        double sum = 0;
        List<Student> studentList = group.getStudents();
        for (Student iterator : studentList) {
            sum += calculateAvgStudent(iterator, discipline);
        }
        result = sum / studentList.size();
        return Math.rint(ROUND_VALUE * result) / ROUND_VALUE;
    }

    @Override
    public double calculateAvgStudent(Student student, Discipline discipline) {
        double result = 0;
        double sum = 0;
        List<Discipline> studentDisciplines = student.getDisciplines();
        List<Integer> markList = new ArrayList();
        for (Discipline iterator : studentDisciplines) {
            if (iterator.getTittle() == discipline.getTittle()) {
                markList = iterator.getMarks();
            }
        }
        for (Integer iterator : markList) {
            sum += iterator;
        }
        result = sum / markList.size();
        return Math.rint(ROUND_VALUE * result) / ROUND_VALUE;
    }
}
