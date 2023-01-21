public interface Transportable{
	String ENGINETYPE="ELECTRICAL";
	int getMaxSpeed();
	static boolean isEarthFriendly(String type){
	if(type.equals()){
	return true;	
	}
	return false;
	}
	default void printDesc(){
	System.out.println("Welcome");
}
}