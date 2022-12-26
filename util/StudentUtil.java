package projects.studentRegistration.util;

import projects.studentRegistration.Config;
import projects.studentRegistration.beans.Student;

public class StudentUtil {

    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        int age = MenuUtil.requireAge();
        String className = MenuUtil.requireClassName();
        System.out.println();

        Student student = new Student(name, surname, age, className);
        return student;
    }


    public static void registerStudentProcess() {
        int count = InputUtil.requireNumber("How many student will you register:");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ") Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
    }


    public static void printAllStudent() {
        if (Config.students == null) {
            System.err.print("List is empty!");
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((i + 1) + ")" + student);
            System.out.println();
        }
    }


    public static void findStudentInformation() {
        if (Config.students == null) {
            System.err.print("List is empty!\n");
            return;
        }
        String search = InputUtil.requireText("Input search keyword:");
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(search) || student.getSurname().contains(search) ||
                    student.getClassName().contains(search)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }


    public static void updateStudentAllInformation() {
        if (Config.students == null) {
            System.err.print("List is empty!\n");
            return;
        }
        StudentUtil.printAllStudent();
        int index = InputUtil.requireNumber("Which person do you want to change?");
        System.out.println("Input person new information");
        Student student = StudentUtil.fillStudent();
        Config.students[index - 1] = student;
        System.out.println("Update successfully");
    }

    public static void updateStudentOneByOneInformation() {
        if (Config.students == null) {
            System.err.print("List is empty!\n");
            return;
        }
        StudentUtil.printAllStudent();
        int index = InputUtil.requireNumber("Which person do you want to change?");
        System.out.println("Input new information");
        Student selectStudent = Config.students[index - 1];
        String changeInfo = InputUtil.requireText("Which you want change parameters\n" +
                "'name','surname','age','clas name'\n Choose:");
        if (changeInfo.contains("'name'")) {
            selectStudent.setName(MenuUtil.requireName());
        }
        if (changeInfo.contains("'surname'")) {
            selectStudent.setSurname(MenuUtil.requireSurname());
        }
        if (changeInfo.contains("'age'")) {
            selectStudent.setAge(MenuUtil.requireAge());
        }
        if (changeInfo.contains("'class name'")) {
            selectStudent.setClassName(MenuUtil.requireClassName());
        }
    }


    public static void updateStudentInformationBySplit() {
        if (Config.students == null) {
            System.err.print("List is empty!\n");
            return;
        }
        StudentUtil.printAllStudent();

        int index = InputUtil.requireNumber("Which person do you want to change?");

        System.out.println("Input new information");

        Student selectStudent = Config.students[index - 1];
        String changeInfo = InputUtil.requireText("Which you want change parameters\n" +
                "Name, Surname, Age, Clas name \n Choose:");

        String[] part = changeInfo.split(",");
        for (int i = 0; i < part.length; i++) {
            String param = part[i];
            if (param.equalsIgnoreCase("name")) {
                selectStudent.setName(MenuUtil.requireName());
            }
            if (param.equalsIgnoreCase("surname")) {
                selectStudent.setSurname(MenuUtil.requireSurname());
            }
            if (param.equalsIgnoreCase("age")) {
                selectStudent.setAge(MenuUtil.requireAge());
            }
            if (param.equalsIgnoreCase("class name")) {
                selectStudent.setClassName(MenuUtil.requireClassName());
            }
        }
    }

}

