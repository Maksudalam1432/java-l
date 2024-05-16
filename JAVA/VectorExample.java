package vectorClass;

		import java.util.Vector;

		public class VectorExample {
		    public static void main(String[] args) {
		        // Create a Vector
		        Vector<String> vector = new Vector<>();
		        
		        // Add elements
		        vector.add("Apple");
		        vector.add("Banana");
		        vector.add("Orange");
		        
		        // Access elements
		        System.out.println("Elements in the vector:");
		        for (String fruit : vector) {
		            System.out.println(fruit);
		        }
		        
		        // Check if an element exists
		        if (vector.contains("Banana")) {
		            System.out.println("Banana exists in the vector.");
		        }
		        
		        // Remove an element
		        vector.remove("Orange");
		        
		        // Size of the vector
		        System.out.println("Size of the vector: " + vector.size());
		    }
		}