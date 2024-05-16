// 7. Write a Java program to practice using String class and its methods.

public class Exp7 {
    public static void main(String[] args){
        String name = "Kumar";
        System.out.println("Name : " + name); 
        System.out.println("\nUpper Case" + name.toUpperCase()); 
        System.out.println("Lower Case" + name.toLowerCase());

        String msg = "   Hello   ";
        System.out.println("\nTrim whitespace : " + msg.trim());

        System.out.println("\nStart with Sa : " + name.startsWith("Sa")); 
        System.out.println("End with r : " + name.endsWith("r"));

        System.out.println("\nCharactor at index 2 : " + name.charAt(2)); 
        // System.out.println("\nCharactor at index 0 : " + name.charAt(0)); 
        // System.out.println("Charactor at index 3 :" + name.charAt(3));

        
        String firstName = "Hitesh";
        String lastName = "Singh";
        System.out.println("\nFirst Name : " + firstName); 
        System.out.println("Last Name : " + lastName); 
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("FullName : " + fullName); 
    }
}
