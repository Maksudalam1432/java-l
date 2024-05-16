package wrapperClasses;

		public class WrapperClassExample {
		    public static void main(String[] args) {
		        // Integer Wrapper Class Example
		        Integer num1 = Integer.valueOf(10); 
		        int num2 = num1.intValue(); 
		        System.out.println("Integer Wrapper Class Example:");
		        System.out.println("num1: " + num1);
		        System.out.println("num2: " + num2);
		        
		        // Double Wrapper Class Example
		        Double num3 = Double.valueOf(3.14);
		        double num4 = num3.doubleValue(); 
		        System.out.println("\nDouble Wrapper Class Example:");
		        System.out.println("num3: " + num3);
		        System.out.println("num4: " + num4);
		        
		        // Boolean Wrapper Class Example
		        Boolean bool1 = Boolean.valueOf(true);
		        boolean bool2 = bool1.booleanValue(); 
		        System.out.println("\nBoolean Wrapper Class Example:");
		        System.out.println("bool1: " + bool1);
		        System.out.println("bool2: " + bool2);
		    }
		}