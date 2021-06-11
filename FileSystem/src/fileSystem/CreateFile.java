package fileSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CreateFile {
    public static void main(String[] args) {
        CreateFile cf = new CreateFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of record: ");
        int rec = sc.nextInt();

        File file = new File("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");
        try {
            if (file.createNewFile() == true) {
                for (int i = 0; i < rec; i++) {
                    System.out.println("enter name: ");
                    String name = sc.next();
                    System.out.println("enter section: ");
                    char sec = sc.next().charAt(0);
                    System.out.println("enter the roll no: ");
                    int roll = sc.nextInt();

                    cf.insert(name, sec, roll);

                }
            } else {
                cf.update();
                //System.out.println("file existed");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void insert(String name, char sec, int roll) {
        FileWriter writer = null;


        try {

            File file = new File("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");

            writer = new FileWriter("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt", true);

            writer.write(name);
            writer.write("  ");
            writer.write(sec);
            writer.write("  ");
            writer.write(roll);
            writer.write("  ");

            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String c;

            int i;
            while ((i = reader.read()) != -1)
                System.out.print((char) i);

               /* while ((c = br.readLine()) != null)
                {
                    System.out.println("\n" +c);
                }*/

               /* int c1;
                while ((c1 = br.read()) != -1)
                {
                    char ch = (char) c1;
                    System.out.println(ch);
                }*/
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void update() {
        try {

           /* Writer fileWriter = new FileWriter("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt", true);
           Reader read = new FileReader("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");
            BufferedReader br1 = new BufferedReader(read);

            BufferedWriter br = new BufferedWriter(fileWriter);*/

            FileWriter writer = new FileWriter("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt", true);

            /*DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt",true)));
            DataInputStream in = new DataInputStream(new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt")));*/

            Scanner sc = new Scanner(System.in);

            System.out.println("enter name: ");
            String name = sc.next();
            System.out.println("enter section: ");
            char sec = sc.next().charAt(0);
            System.out.println("enter the roll no: ");
            int roll = sc.nextInt();
            System.out.println("enter string");
            String stri = sc.next();

            writer.write(name + "|" + sec + "|" + roll + "|" + stri + "\n");

           /* br.write(name);
            br.write(sec);
            br.write(roll);
            br.write(stri);
            br.write(".");*/

            writer.close();

         /*   FileReader reder = new FileReader("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");

            int i;
            while((i=reder.read())!=-1)
                System.out.print((char)i);*/

           /* Reader read = new FileReader("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");
            BufferedReader br1 = new BufferedReader(read);

            String str ;
            while ((str = br1.readLine()) != null)
            {

                String[] word = str.split("\\|");

                for (String a : word)
                    System.out.print(a+ "  ");

                System.out.println();

            }*/
            modify();
            // System.out.println(""+ word +"");

         /*   char ch ;
            while ((ch = (char) reder.read()) != -1)
            {
                String str = name;

                //String name1 = br1.readLine();
                *//*int sec1 = in.read();
                char ce =(char)sec1;
                int roll1 = in.readInt();
                String str = in.readUTF();*//**//*
                System.out.println(ch);
                *//**//*System.out.println(ce);
                System.out.println(roll1);
                System.out.println(str);*//*


            }*/
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public void modify() {
        List<String> l2 = new ArrayList<String>();
        BufferedReader br1 = null;
        try {
            Reader read = new FileReader("C:\\Users\\Devil\\Desktop\\New folder (2)\\second.txt");
            br1 = new BufferedReader(read);
            String str;
            String s = "234";
            while ((str = br1.readLine()) != null) {
                String[] word = str.split("\\|");
                if (word[2].equals(s)) {

                    str = word[0] + "|" + word[1] +"|"+ "345"+"|" + word[3];
                }
                l2.add(str);
                //System.out.print(str + "\t\t\t");
            }
            System.out.println();

            //System.out.println(l2);


            System.out.println("------------------------------------");
            for (String str1 : l2) {
                String[] word = str1.split("\\|");

                   /* for (String a : word)
                    {
                        if(a.equals(s))
                        {
                            for(int i =0;i<str1.length();i++)
                            {
                                System.out.println(str1);
                            }
                        }*/
                System.out.println(word[0]+ "  "+word[1]+" " +word[2]+" "+word[3]);
            }
            System.out.println();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}