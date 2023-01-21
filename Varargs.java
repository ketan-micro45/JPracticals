class Varargs{

static int add(int... arr){
	int res=0;
	for(int i : arr){
res+=i;
			
}
return res;
}
public static void main(String [] arg){
	System.out.println("Addition : "+ add(1,4,3,7,5));
}
}