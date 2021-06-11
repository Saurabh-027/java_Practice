package polymorphism;
class A
{
	void try1()
	{
		System.out.println("saurabh");
	}
	
}
class B extends A
{
	void try1()
	{
		System.out.println("vicky");
	}
}
public class polymorphism 
{
	public static void main(String[] args)
	{
		A c=new B();
		c.try1();
	}
}