package by.epam.belstu.logic;

import by.epam.belstu.bean.*;

public interface IUniversityOperation {

    int ROUND_VALUE = 10;

    double calculateAvgUniversity(University university, Discipline discipline);

    double calculateAvgFaculty(Faculty faculty, Discipline discipline);

    double calculateAvgGroup(Group group, Discipline discipline);

    double calculateAvgStudent(Student student, Discipline discipline);
}
