package encapsulation;

public class Main {
    public static void main(String[] args)
    {
        Encap encap = new Encap();

        encap.setCourse("mca");
        encap.setName("saurabh");
        encap.setRoll(12);
        encap.setSection('c');

        System.out.println("Name: "+encap.getName());
        System.out.println("Course: "+encap.getCourse());
        System.out.println("Roll No: "+encap.getRoll());
        System.out.println("Section: "+ encap.getSection());

    }
}
