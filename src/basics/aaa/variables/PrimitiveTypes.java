package basics.aaa.variables;

public class PrimitiveTypes {

	//static means that this method is associated with Class and not with Object.
	public static void main(String[] args) {
		
		//Primitive Type Variables: byte, short, int, long, char, float, double, boolean, char
		
		byte b; //Java assigns 8 bit for this type regardless of 32/64 bit system.
		b = -128; // min = -2^7 (inclusive)
		b = 127; // max = 2^7-1 (inclusive)
		
		short s; //Java assigns 16 bit for this type regardless of 32/64 bit system.
		s = -256; // min = -2^15 (inclusive)
		s = 255; //max = 2^15-1 (inclusive)
		
		int i; //java assigns 32 bit for this type regardless of 32/64 bit system.
		i = -2147483648;//min =  -2^31 (inclusive)
		i = 2147483647; //max  = 2^31-1 (inclusive)
		
		long l; //java assigns 64 bit for this type regardless of 32/64 bit system.
		//min = -2^63 (inclusive)
		// max = 2^63-1 (inclusive)
		
		float f; //32-bit IEEE 754 floating point

		double d; // 64-bit IEEE 754 floating point
		
		boolean bo; // size is not defined but it holds true/false flag

		char c; //16-bit unicode characters;
		c = '\u0000'; //min 0
		c = '\uffff'; //max 65,535 inclusive


		// final means the value is not going to change once initialized
		// if you try to change, the compiler will give error
		final double pi = 3.14159;

		//Memory Allocation:
		//All primitive types data are created in stack and not in heap. 
		//All java objects are created inside Java Heap.

		System.out.println("done");

	}

}
