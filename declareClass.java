class a
{
	public static void main (String args[])
	{
		System.out.println("hello world");
		B b = new B();
       		System.out.println(b.i); //prints 40
	}
}

class B
{ 
	int i;  //instance variable 
	B()
	{	
		 System.out.println(i);  //10
		 i=40;			//update of i value  i.e: i=40 
	}
	 
	{ //first this block copied before the contructor is called	
		 System.out.println(i);  //i=0
		 i=10; 			//update in i value i.e.: i=10 
        }
}
