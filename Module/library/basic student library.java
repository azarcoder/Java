import java.util.*;

class student
{
	boolean std_flag;
	String std_name,std_pass;
	int std_id;

	student(int id,String name,String pass,boolean flag)
	{
		this.std_id   = id;
		this.std_name = name;
		this.std_pass = pass ;
		this.std_flag = flag;
	}
}

class books
{
	boolean book_flag;
	int book_id;
	String book_name,author_name;

	books(int bkid,String bkname,String bkaname,boolean f)
	{
		this.book_id = bkid;
		this.book_name = bkname;
		this.author_name = bkname;
		this.book_flag = f;
	}
}



class Main{
	static Scanner sc = new Scanner(System.in); 
	static int boook_id=1000,student_id=101,ab,addb;
	static Main m = new Main();
	static ArrayList<student> std = new ArrayList<student>();
	static ArrayList<books> book = new ArrayList<books>();

	//-----------------main-------------------------------
	public static void main(String[] args) {
		System.out.println("***** Welcome to Library *****");
		while(true)
		{
			System.out.println("1.Admin\n2.Student\n3.Exit");
			try{
				int n = sc.nextInt();
				if(n==1) 
					m.admin();
				else if(n==2)
						m.student();
				else if(n==3)
						break;
				else 
					System.out.println("invalid input");
			}
			catch(Exception err)
			{
				System.out.println("Error:"+err);
				sc.next();
			}
		}
	}




	//--------------------admin----------------------------
	static void admin()
	{
		System.out.println("---Welcome Admin---");
		String id,pass;
		System.out.print("Enter Admin Id:");
		id=sc.next();
		System.out.print("Enter Admin Password:");
		pass=sc.next();
		if(id.equals("admin") && pass.equals("111"))
		{
			while(true)
			{
				System.out.println("1.Add book\n2.Issue book\n3.Report\n4.Logout");
				try
				{
					int n = sc.nextInt();
					if(n==1)
						m.add();
					else if(n==2)
						m.issue();
					else if(n==3)
						m.report();
					else if(n==4)
						break;
					else System.out.println("invalid input !!!");
				}
				catch(Exception err)
				{
					System.out.println("Error:"+err);
					sc.next();
				}
			}
		}
		else
		{
			System.out.println("Id / Password mismatched!");
		}
	}


	//-----------add books-------------------
	static void add()
	{
		System.out.println("---Add books---");
		System.out.print("Enter how many books do you want to add?");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++ )
		{
			System.out.printf("Enter book details of %d\n",i);
			System.out.print("Enter book name:");
			String bname = sc.next();
			System.out.print("Enter author name:");
		    String aname = sc.next();
		    book.add(new books(boook_id,bname,aname,true));
		    boook_id++;
		}
		System.out.println("Books added successfully!");
	}

	//-----------issue books-------------------
	static void issue()
	{
		if(book.size()>0)
		{
			System.out.println("---Issue books---");
			for(books b:book)
			{
				if(b.book_flag==false)
					System.out.printf("Book name:%s\n",b.book_name);
			}
		}
		else
			System.out.println("No books added!");
	}

	//-----------report file-------------------
	static void report()
	{
		System.out.println("---Report books---");
	}




	//--------------------student----------------------------
	static void student()
	{
		System.out.println("---Welcome Students---");
		while(true)
		{
			System.out.println("1.Sign Up\n2.Log In\n3.Back");
			try
			{
				int n = sc.nextInt();
				//------------Sign up----------------------
				if(n==1)
				{
					String name,pass;
					System.out.print("Enter your name:");
					name = sc.next();
					System.out.print("Enter New Password:");
					pass = sc.next();
					System.out.println("Your login ID:"+student_id);
					std.add(new student(student_id,name,pass,true));
					student_id++;
					System.out.println("Successfully Signed Up...");

				}
				//-----------------login--------------------
				else if(n==2)
				{
					System.out.print("Enter id:");
					int id = sc.nextInt();
					System.out.print("Enter Password:");
					String pass = sc.next();
					for(student s:std)
					{
						if(s.std_pass.equals(pass) && id==s.std_id)
						{
							System.out.println("Welcome,"+s.std_name);
							while(true){
							System.out.println("1.View Books\n2.Lend Book\n3.Return Book\n4.Exit");
							try
							{
								int c = sc.nextInt();
								if(c==1)
								{
									m.view_books();
								}
								else if(c==2)
								{
									m.lend(id);
								}
								else if(c==3)
								{
									m.rtn(id);
								}
								else if(c==4)
								{
									break;
								}
								else
									System.out.println("Invalid input!");
							}
							catch(Exception e)
							{
								System.out.println("Error:"+e);
								sc.next();
							}
						}
						}
					}
				}
				//----------------------exit----------------
				else if(n==3)
				{
					break;
				}
				else
					System.out.println("Enter Valid Input!");
			}
			catch(Exception e)
			{
				System.out.println(e);
				sc.next();
			}

		}
	}



//----------------------view books-----------------------------

static void view_books()
{
	for(books b : book)
	{
		if(b.book_flag==true)
			System.out.printf("Book id : %d\tBook Name : %s\tBook Author:%s\tAvaliability:%s\n",b.book_id,b.book_name,b.author_name,b.book_flag);
	}
}

//-------------------lend book----------------------------
static void lend(int id)
{
	System.out.println("---Lend---");
	System.out.println("Your id:"+id);
	boolean a=false;
	for(student s : std)
	{
		if(s.std_id==id)
		{
			System.out.print("Enter book id to lend:");
			int lid = sc.nextInt();
			
			for(books b:book)
			{
				if(b.book_id==lid)
				{
					b.book_flag=false;
					a=true;
				}
			}
		}
	}
	if(a==true)
		System.out.println("book lended successfully!");
	else
		System.out.println("book not Available!");
}


//--------------------return book---------------------
static void rtn(int id)
{
	System.out.println("---Return Book---");
	System.out.println("Your id:"+id);
	boolean a=false;
	for(student s : std)
	{
		if(s.std_id==id)
		{
			System.out.print("Enter book id to return:");
			int lid = sc.nextInt();
			
			for(books b:book)
			{
				if(b.book_id==lid && b.book_flag==false)
				{
					b.book_flag=true;
					a=true;
				}
			}
		}
	}
	if(a==true)
		System.out.println("book returned successfully!");
	else
		System.out.println("book not lended by you!!!");

}



}
