package by.epam.belstu.main;

import by.epam.belstu.bean.*;
import by.epam.belstu.logic.impl.FacultyService;
import by.epam.belstu.logic.IUniversityOperation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IUniversityOperation universityOperation = new FacultyService();
        List<Integer> goodMarks = new ArrayList();
        goodMarks.add(9);
        goodMarks.add(8);
        goodMarks.add(9);
        goodMarks.add(10);

        List<Integer> badMarks = new ArrayList();
        badMarks.add(5);
        badMarks.add(4);
        badMarks.add(4);
        badMarks.add(2);

        List<Integer> mediumMarks = new ArrayList();
        mediumMarks.add(6);
        mediumMarks.add(7);
        mediumMarks.add(8);
        mediumMarks.add(7);

        Discipline math1 = new Discipline("Mathematics", "Math", badMarks);
        Discipline math2 = new Discipline("Mathematics", "Math", goodMarks);
        Discipline math3 = new Discipline("Mathematics", "Math", mediumMarks);

        Discipline physic1 = new Discipline("Physics", "Ph", goodMarks);
        Discipline physic2 = new Discipline("Physics", "Ph", badMarks);
        Discipline physic3 = new Discipline("Physics", "Ph", mediumMarks);

        Discipline oop1 = new Discipline("Programming routinely", "PO", goodMarks);
        Discipline oop2 = new Discipline("Programming routinely", "PO", badMarks);
        Discipline oop3 = new Discipline("Programming routinely", "PO", mediumMarks);

        List<Discipline> disciplineList1 = new ArrayList<>();
        disciplineList1.add(math1);
        disciplineList1.add(physic2);
        disciplineList1.add(oop1);

        List<Discipline> disciplineList2 = new ArrayList<>();
        disciplineList2.add(math2);
        disciplineList2.add(physic1);
        disciplineList2.add(oop2);

        List<Discipline> disciplineList3 = new ArrayList<>();
        disciplineList3.add(math3);
        disciplineList3.add(physic3);
        disciplineList3.add(oop3);

        Student st1 = new Student("Maxim", "Barkun", disciplineList1);
        Student st2 = new Student("Makar", "Makarov", disciplineList2);
        Student st3 = new Student("Vitaly", "Dolgovechny", disciplineList3);
        Student st4 = new Student("Julia", "Necrashas", disciplineList1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        Group group1 = new Group();
        group1.setNubmerGroup(1);
        group1.setStudents(studentList);

        Faculty fac1 = new Faculty();
        fac1.setTittle("Faculty of Information Technology");
        fac1.setShortTittle("FIT");
        fac1.addCroup(group1);

        University university1 = new University();
        university1.setTittle("Belorussian State Technology University");
        university1.setShortTittle("BelSTU");
        university1.addFaculty(fac1);

        System.out.println(university1);
        System.out.println("Avarage mark of university for Mathematics = "
                + universityOperation.calculateAvgUniversity(university1, math1));
        System.out.println(fac1);
        System.out.println("Avarage mark of faculty for Physics = "
                + universityOperation.calculateAvgFaculty(fac1, physic1));
        System.out.println(group1);
        System.out.println("Avarage mark of group for Programming routinely = "
                + universityOperation.calculateAvgGroup(group1, oop1));
        System.out.println(st1);
        System.out.println("Avarage mark Student for Physics = "
                + universityOperation.calculateAvgStudent(st1, physic1));
    }
}
