public class Runcode{
public static void main(String [] args){
Transportable t= new Tesla();
Transportable h= new Honda();
System.out.println(t.getMaxSpeed());
System.out.println(h.getMaxSpeed());
System.out.println(Transportable.isEarthFriendly("ELECTRICAL"));
System.out.println(Transportable.isEarthFriendly("CONBUSTION"));
t.printDesc();
h.printDesc();
}
}