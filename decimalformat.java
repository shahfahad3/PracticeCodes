class decimalformat{
	
	
	
	public static void main(String args[])
	{
		
	System.out.printf("Value with 3 digits after decimal point %.3f %n", PI);
	
// OUTPUTS: Value with 3 digits after decimal point 3.142

//Alternatively, we can format the value with the DecimalFormat class:

DecimalFormat df = new DecimalFormat("###.###");

System.out.println(df.format(PI));
}
}
