class Constructor{
  	 Constructor(){
}
 
	Constructor(String s,int number){
	System.out.println("Name : "+s+ " Age: "+number);
}

public static void main(String [] args){
	Constructor c= new Constructor();
	System.out.println("This Default Constructor");
	
	Constructor c2= new Constructor("Ketan",19);
				
}





















}