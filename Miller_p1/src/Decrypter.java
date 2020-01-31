
public class Decrypter {
	
	public int[] decrypt(int[] userData)
	{
				
		for(int i = 0; i < 4; i++)
		{
			userData[i] = userData[i] - 7;//subtract 7 
			userData[i] = userData[i] + 10;//add ten back
			if(userData[i] >= 10)
			{
				userData[i] = userData[i] % 10;//if num is greater than 10 just -
												//divide by ten for remainder again
			}
		}
		
		//then swap the first and third
		final int temp = userData[2];
		userData[2] = userData[0];
		userData[0] = temp;
		//and second and fourth digits
		final int tempTwo = userData[3];
		userData[3] = userData[1];
		userData[1] = tempTwo;
		
		return userData;//return decrypted
	}
}
