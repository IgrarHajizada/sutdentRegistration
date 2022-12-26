package projects.studentRegistration.util;

public class MenuUtil {
    public static void processMenu(int operationNumber) {

        switch (operationNumber) {
            case '1':
                StudentUtil.registerStudentProcess();
                break;

            case '2':
                StudentUtil.printAllStudent();
                break;

            case '3':
                StudentUtil.findStudentInformation();
                break;

            case '4':
//                    StudentUtil.updateStudentAllInformation();
//                    StudentUtil.updateStudentOneByOneInformation();
                StudentUtil.updateStudentInformationBySplit();
                break;

            case '5':
                System.out.println("Log out...");
                return;
        }
    }


    public static String requireName() {
        return InputUtil.requireText("Enter student name:");
    }

    public static String requireSurname() {
        return InputUtil.requireText("Enter student name:");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("Enter student age:");
    }

    public static String requireClassName() {
        return InputUtil.requireText("Enter student class name:");
    }
}
