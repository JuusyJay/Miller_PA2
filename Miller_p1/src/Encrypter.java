
public class Encrypter {
	
	public int[] encrypt(int[] userData)
	{

		for(int i = 0; i < userData.length; i++)
		{
			userData[i] = userData[i] + 7;//replace each digit with result of adding 7
			userData[i] = userData[i] % 10;//get the remainder after dividing by 10
		}
		//then swap the first and third
		final int temp = userData[2];
		userData[2] = userData[0];
		userData[0] = temp;
		//and second and fourth digits
		final int tempTwo = userData[3];
		userData[3] = userData[1];
		userData[1] = tempTwo;
		
		//return encrypted integer
		return userData;
	}
	
}
