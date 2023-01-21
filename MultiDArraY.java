class MultiDArraY{
public static void multiArray(int arr[][]){
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i].length;j++){
	System.out.println("arr[" + i + "]" + "[" + j + "] = " + arr[i][j]);
	}
}

}
public static void main(String args []){
	int arr[][] ={{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};
	multiArray(arr);
	}

}