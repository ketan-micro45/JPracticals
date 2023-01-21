class First{
public void display(){
	System.out.println("This is method of first class...");
}
}

public class Second{
public void display(){
System.out.println("This is method of Second Class...");
}
public static void main(String [] arg){
Second s=new Second();
s.display();
}
}