class AEHandlingDemo{
public static void main(String [] args){
int a=0,b=5,c=0;
	try{
	c=b/a;
	System.out.println(c);
	}
	catch(ArithmeticException ae)
	{
	ae.printStackTrace();
	System.out.println("Dont divide by zero ");
	}
System.out.println("Code Resumes");
}
}