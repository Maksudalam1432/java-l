package stringBuffer;

		public class StringBufferExample {
		    public static void main(String[] args) {
		        // Create a StringBuffer object
		        StringBuffer sb = new StringBuffer("Hello");
		        
		     
		        sb.append(" World"); 
		        
		       
		        sb.insert(5, ",");
		        
		        // Replace text
		        sb.replace(6, 11, "Java");
		        
		        // Delete text
		        sb.delete(0, 6);
		        
		        // Reverse text
		        sb.reverse();
		        
		        // Convert to String and print
		        System.out.println(sb.toString());
		    }
		}
