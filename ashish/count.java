class count{

	String name="ashish";
	
	 static int count=0;
	
	count()
	{
		count++;
	}
    static void display()
	{
		System.out.println("Counts are "+count);
	}
	
	public static void main(String args[])
	{
		count s1=new count();
		count s2=new count();
		count s3=new count();
		count s4=new count();
		count s5=new count();
		
		display();
		
	}
	
}
