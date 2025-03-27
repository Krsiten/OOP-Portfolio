
public class StringObjects {
   public static void main (String[] args) {
      String college = new String ("Leeds Beckett University"); //Similar for part (a)


      String town = new String ("AnyTown, UK"); // part (a)


      int stringLength;
      String change1, change2, change3; 


     stringLength = college.length(); // part (b)


      System.out.println (college + " contains " + stringLength + " characters.");


      change1 = college.toUpperCase(); // part (c)


      change2 = college.replace("E","*"); // part (d)


      change3 = college.concat(town); // part (e)


      System.out.println ("The final string is " + change3);
    }
}
