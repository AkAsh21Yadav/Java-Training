public class Stringbuilder
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("Capacity before : "+sb.capacity());
        sb.append("India is IMP nation in Asia.");
        System.out.println("No.of characters : "+sb.length());
        System.out.println("Capacity after : "+sb.capacity());
        
        
        StringBuilder sb1 = new StringBuilder(25);
        System.out.println("\nCapacity before : "+sb1.capacity());
        sb1.append("India is a Secular nation.");
        System.out.println("No.of characters : "+sb1.length());
        System.out.println("Capacity after : "+sb1.capacity());
        System.out.println("Reverse : "+sb1.reverse());
        
        StringBuilder sb2 = new StringBuilder("AkAsh Yadav");
        System.out.println("\nCapacity before : "+sb2.capacity());
        sb2.append (" India is Great nation.");
        System.out.println("No.of characters : "+sb2.length());
        System.out.println("Capacity after : "+sb2.capacity());
        System.out.println("\nUpdated string after insert : "+sb2.insert(6,"Bajrang "));
        System.out.println("Updated string after delete : "+sb2.delete(6,14));
        System.out.println("Updated string after replace: "+sb2.replace(0,17,"Akash"));
        
        String s = sb2.toString();
        System.out.println("Convert to string : "+s);
      
        System.out.println("\nAfter splitting : "); 
        String[] words = s.split(" ");
        for(String s1 : words)
        {
            System.out.println(s1);
        }
        
        System.out.println("\nLength of String array : "+words.length);
    }
}