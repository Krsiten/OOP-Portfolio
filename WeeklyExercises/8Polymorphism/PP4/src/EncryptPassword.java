import java.util.Random;

public class EncryptPassword implements Encryptable
{
	private String password;
	private String key;
	private Boolean encrypted;
	private int passwordLength;
	private static String buffer;
	
	Random randNum = new Random();
	
	public EncryptPassword(String plaintext, String keyword)
	{
		password = plaintext.toUpperCase();
		encrypted = false;
		passwordLength = plaintext.length();
		key = keyword.toUpperCase();
		buffer = plaintext;
		
	}
	
	public String formatPassword(String msg)
	{
		String formatedPassword = "";
		char[] passwordChars = msg.toCharArray();
		char[] bufferChars = buffer.toCharArray();
				
		for (int m = 0; m < passwordLength; m++)
		{
			if (Character.isUpperCase(bufferChars[m]))
			{
				formatedPassword += Character.toUpperCase(passwordChars[m]);
			} 
			else if (bufferChars[m] == ' ')
			{
				formatedPassword += passwordChars[m] = ' ';
			}
			else
			{
				formatedPassword += Character.toLowerCase(passwordChars[m]);
			};
		}
		
		password = formatedPassword;
		
		return password;
	}
	
	public void encrypt()
    {
		if (!encrypted)
		{
			String masked = "";
			password = password.toUpperCase();
			
			for (int m = 0, n = 0; m < passwordLength; m++)
			{				
				if (password.charAt(m) > 'A' || password.charAt(m) < 'Z')
				{
					masked += (char) ((password.charAt(m) + key.charAt(n) - 2 * 'A') % 26 + 'A');
					n = ++n % key.length();
				}
			}
			
			password = masked;
			encrypted = true;
		}
    }
	
	public String decrypt()
    {
		if (encrypted)
		{
			String unmasked = "";
			password = password.toUpperCase();
        
			for (int m = 0, n = 0; m < password.length(); m++)
			{
				if (password.charAt(m) > 'A' || password.charAt(m) < 'Z')
				{
					unmasked += (char) ((password.charAt(m) - key.charAt(n) + 26) % 26 + 'A');
					n = ++n % key.length();
				}
            
				char[] passwordChars = unmasked.toCharArray();
            
				if (Character.isLowerCase(buffer.charAt(m)))
				{
					Character.toLowerCase(passwordChars[m]);
				} 
			}
        
			password = formatPassword(unmasked);
		}
		return password;
	}
	
	public String getPassword()
	{
		return password;
	}
}
