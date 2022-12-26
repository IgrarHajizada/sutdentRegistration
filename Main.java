package projects.studentRegistration;


import projects.studentRegistration.util.InputUtil;
import projects.studentRegistration.util.MenuUtil;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {
            char operationNumber = InputUtil.requireSymbol("What so you want to do? \n" + "1.Register student\n"
                    + "2.Show all students\n" + "3.Find student\n" + "4.Update Student\n" + "5.Exit\n" + "\nChoose:");
            MenuUtil.processMenu(operationNumber);
        }
    }
}
