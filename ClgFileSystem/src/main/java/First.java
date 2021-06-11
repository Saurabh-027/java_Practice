import java.util.Scanner;

import static javafx.application.Platform.exit;

public class First {
    public static void main(String [] args) {
        boolean count  = true;
        Management mg = new Management();
        Scanner sc = new Scanner(System.in);
            while (count) {
                System.out.println("|--------------------------------------------------------------------|");
                System.out.println("|                     Student Management System                      |");
                System.out.println("|                    ---------------------------                     |");
                System.out.println("|                                                                    |");
                System.out.println("|  1 for Add Student records                                         |");
                System.out.println("|  2 for modify the student record                                   |");
                System.out.println("|  3 for delete the student record                                   |");
                System.out.println("|  4 for see the record of student                                   |");
                System.out.println("|  5 for search the student record                                   |");
                System.out.println("|  6 for quit the management system                                  |");
                System.out.println("|                                                                    |");
                System.out.println("|     Enter your choice:                                             |");
                System.out.println("|--------------------------------------------------------------------|");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        mg.insert();
                        break;
                    case 2:
                        mg.modify();
                        break;
                    case 3:
                        mg.delete();
                        break;
                    case 4:
                        mg.show();
                        break;
                    case 5:
                        mg.search();
                        break;
                    case 6:
                        System.out.println("Thank you for using this application");
                        count = false;
                        System.exit(0);
                        break;
                }
            }
        }
    }
