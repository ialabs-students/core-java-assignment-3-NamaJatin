package com.Assignment3;

public class Wrapper_Class_Convert {

	public static void convertToWrapper(Object primitive) 
	{
		if (primitive instanceof Integer) 
		{
			Integer in = (Integer) primitive;
			System.out.println(in);
		} 
		else if (primitive instanceof Character) 
		{
			Character ch = (Character) primitive;
			System.out.println(ch);
		} 
		else if (primitive instanceof Short) 
		{
			Short sh = (Short) primitive;
			System.out.println(sh);
		} 
		else if (primitive instanceof Byte) 
		{
			Byte by = (Byte) primitive;
			System.out.println(by);
		} 
		else if (primitive instanceof Float) 
		{
			Float f = (Float) primitive;
			System.out.println(f);
		} 
		else if (primitive instanceof Double) 
		{
			Double d = (Double) primitive;
			System.out.println(d);
		} 
		else if (primitive instanceof Long) 
		{
			Long l = (Long) primitive;
			System.out.println(l);
		} 
		else if (primitive instanceof Boolean) 
		{
			Boolean boo = (Boolean) primitive;
			System.out.println(boo);
		} else 
		{
			System.out.println("Give Proper Primitive as Input");
		}
	}

	public static void main(String[] args) 
	{
		char ch = 'z';
		byte b = 19;
		short sc = 24;
		int n = 75;
		long ln = 245687;
		float fl = 25.387f;
		double du = 59786.11;
		boolean bo = false;
		
		convertToWrapper(ch);
		convertToWrapper(b);
		convertToWrapper(sc);
		convertToWrapper(n);
		convertToWrapper(ln);
		convertToWrapper(fl);
		convertToWrapper(du);
		convertToWrapper(bo);
	}
}
