//********************************************************************
//  SecretTest.java       Java Foundations
//
//  Demonstrates the use of a formal interface.
//********************************************************************

public class SecretTest
{
   //-----------------------------------------------------------------
   //  Creates a Secret object and exercises its encryption.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      //Secret hush = new Secret("Wil Wheaton is my hero!");
      //System.out.println(hush);

      //hush.encrypt();
      //System.out.println(hush);

      //hush.decrypt();
      //System.out.println(hush);
      
      EncryptPassword password1 = new EncryptPassword("Password", "KEY");
      System.out.println(password1.getPassword());
      
      password1.encrypt();
      System.out.println(password1.getPassword());
      
      password1.decrypt();
      System.out.println(password1.getPassword());
   }
}
