package writingReading;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WritingReadingUpdate {

    public void inset(int id, String name, int roll, char sec, String course) {

        File file = new File("D:\\ClgWork\\student.txt");

        FileWriter writer = null;
        try {
            if (file.createNewFile() == true) {
                writer = new FileWriter("D:\\ClgWork\\student.txt");
                writer.write(id + "|" + name + "|" + roll + "|" + sec + "|" + course);
            } else {
                writer = new FileWriter("D:\\ClgWork\\student.txt", true);
                if (file.length() == 0) {
                    writer.write(id + "|" + name + "|" + roll + "|" + sec + "|" + course);
                } else {
                    writer.write("\n" + id + "|" + name + "|" + roll + "|" + sec + "|" + course);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

    public void modify(String id, String change, String n) {

        BufferedReader br1 = null;
        BufferedWriter br2 = null;

        List<String> l2 = new ArrayList<String>();
        try {
            Reader read = new FileReader("D:\\ClgWork\\student.txt");

            br1 = new BufferedReader(read);

            String str;
            boolean count = false;

            while ((str = br1.readLine()) != null) {
                String[] word = str.split("\\|");
                if (word[0].equals(id)) {
                    if (change.equals("name")) {
                        str = word[0] + "|" + n + "|" + word[2] + "|" + word[3] + "|" + word[4];
                    } else if (change.equals("roll")) {
                        str = word[0] + "|" + word[1] + "|" + n + "|" + word[3] + "|" + word[4];
                    } else if (change.equals("sec")) {
                        str = word[0] + "|" + word[1] + "|" + word[2] + "|" + n + "|" + word[4];
                    } else if (change.equals("course")) {
                        str = word[0] + "|" + word[1] + "|" + word[2] + "|" + word[3] + "|" + n;
                    }
                    count = true;
                }
                l2.add(str);

                Writer write = new FileWriter("D:\\ClgWork\\student.txt");
                br2 = new BufferedWriter(write);
            }
            for (String copy : l2) {
                br2.write(copy);
            }
            if(count == true)
            {
                System.out.println("Data modified");
            }
            else
            {
                System.out.println("Data not found");
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br1.close();
                br2.close();

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public void show() {
        BufferedReader br1 = null;
        try {
            Reader read = new FileReader("D:\\ClgWork\\student.txt");
            br1 = new BufferedReader(read);
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("Student ID\t\tNAME\t\tROLL NO\t\tSECTION\t\t  COURSE");
            System.out.println("--------------------------------------------------------------");

            String str;
            while ((str = br1.readLine()) != null) {

                String[] word = str.split("\\|");

                for (String a : word)
                    System.out.print(a + "\t\t\t");

                System.out.println();

            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br1.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public void search(String id) {
        BufferedReader br = null;
        try {
            Reader read = new FileReader("D:\\ClgWork\\student.txt");
            br = new BufferedReader(read);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Student ID\t\t\tNAME\t\t\tROLL NO\t\t\tSECTION\t\t\t  COURSE");
            System.out.println("-----------------------------------------------------------------------------");


            String str;
            while ((str = br.readLine()) != null) {

                String[] word = str.split("\\|");

                for (String a : word) {
                    if (id.equals(a)) {
                        for (String b : word)
                            System.out.print(b + "\t\t\t\t  ");
                        break;
                    }

                }
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(String id) {
        BufferedReader br1 = null;
        BufferedWriter br2 = null;

        boolean count = false;

        List<String> l2 = new ArrayList<String>();

        try {
            Reader read = new FileReader("D:\\ClgWork\\student.txt");

            br1 = new BufferedReader(read);
            String str;
            while ((str = br1.readLine()) != null) {
                String[] word = str.split("\\|");

                if (word[0].equals(id)) {
                    count = true;
                    continue;
                }
                l2.add(str);
            }
            Writer write = new FileWriter("D:\\ClgWork\\student.txt");
            br2 = new BufferedWriter(write);

            for (String copy : l2) {
                br2.write(copy);
            }
            if(count == true) {
                System.out.println("Your data is deleted");
            }
            else
            {
                System.out.println("Data no found");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
