//wap for inheritance for person ,teacher, hod
// multilevel inheritance

class Person
{
	private int id;
	private String name, address;
	
	public Person(int id, String name, String address)
	{
		this.id= id;
		this.name=name;
		this.address= address;
	}
	public void show()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("address = "+address);
	}
		
} 


class Teacher extends Person
{
	private double salary;

	public Teacher(int id, String name, String address, double salary)
	{
		super(id,name,address);
		this.salary=salary;
	}
	public void show()
	{
		super.show();
		System.out.println("salary = "+salary);
	}
}

class Hod extends Teacher
{
	private String dept;

	public Hod(int id, String name, String address, double salary, String dept)
	{
	super(id,name,address,salary);
	this.dept= dept;
	}
	public void show()
	{
		super.show();
		System.out.println("Dept = "+dept);
	}
	
}

class multilevel_inheritance_per_teach_hod
{
	public static void main(String args[])
	{
		Person p= new Person(1,"John Doe","Nowhere");
		p.show();

		Teacher t= new Teacher(10,"Saurabh","Panvel",5000);
		t.show();

		Hod h= new Hod(20,"Ashok","Nerul",11000,"Computer Engg");
		h.show();
	}

}