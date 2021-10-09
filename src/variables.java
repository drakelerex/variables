public class variables {
    public static void main(String[] args) throws Exception 
    {
		//byte
		byte byteSize = Byte.SIZE; // This is used to find the bit size 8 bit, 16 bit, etc
		byte byteMin = Byte.MIN_VALUE;
		byte byteMax = Byte.MAX_VALUE;
		// short
		byte shortSize = Short.SIZE;
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		// integer
		byte intSize = Integer.SIZE;
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		// long
		byte longSize = Long.SIZE;
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		// float
		byte floatSize = Float.SIZE;
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		// Double
		byte doubleSize = Double.SIZE;
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		// character
		byte charSize = Character.SIZE;
		byte charMin = Character.MIN_VALUE;
		int charMax = Character.MAX_VALUE;
		// boolean
		byte boolSize = 1;
		boolean boolMin = false;
		boolean boolMax = true;
		// String
		
		
		
		System.out.println("          -----------------------------------------------------------------------------------------------");
		System.out.println("          | Andrew Emerick                                                                      10/8/21 |");
		System.out.println("          |---------------------------------------------------------------------------------------------|");
		System.out.println("          | Variable type | bit size |           Minimum Value          |          Maximum Value        |");
		System.out.println("          |---------------------------------------------------------------------------------------------|");
		System.out.println("          |    Byte       | "+byteSize+" bits   |               "+byteMin+"               |             "+byteMax+"               |");
		System.out.println("          |    Short      | "+shortSize+" bits  |               "+shortMin+"             |             "+shortMax+"             |");
		System.out.println("          |    Integer    | "+intSize+" bits  |               "+intMin+"        |             "+intMax+"        |");
		System.out.println("          |    Long       | "+longSize+" bits  |           "+longMin+"   |       "+longMax+"     |");
		System.out.println("          |    Float      | "+floatSize+" bits  |               "+floatMin+"            |          "+floatMax+"         |");
		System.out.println("          |    Double     | "+doubleSize+" bits  |              "+doubleMin+"            |    "+doubleMax+"     |");
		System.out.println("          |    Boolean    | "+boolSize+" bits   |               "+boolMin+"              |             "+boolMax+"              |");
		System.out.println("          |    Character  | "+charSize+" bits  |              "+charMin+"                   |           "+charMax+"               |");
    }
}
