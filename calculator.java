class calculator{
	public static void main(String args[]){
		int a,c,res;
 		String b;
		a=Integer.parseInt(args[0]);
		b=args[1];
		c=Integer.parseInt(args[2]);
		if (b.equals("+")){
		res=a+c;
			System.out.println(res);}
		else if (b.equals("*")){
		res=a*c;
			System.out.println(res);}
		else if (b.equals("-")){
		res=a-c;
			System.out.println(res);}
		else{
			res=a/c;
			System.out.println(res);}
}
}		
		