import java.util.Scanner;


public class Application {
	
	public static void main(String[] args)
	{
		
		Encrypter Encrypter = new Encrypter();//create new Encrypter
		Decrypter Decrypter = new Decrypter();//create new Decrypter
		
		int[] userInput = new int[4];
		int[] encryptedNum = new int[4];//create int[]'s
		int[] decryptedNum = new int[4];
		
		Scanner in = new Scanner(System.in);//create scanner
		
		for(int i = 0; i < 4; i++)
		{
			userInput[i] = in.nextInt();//get users input
		}
		
		encryptedNum = Encrypter.encrypt(userInput);//encrypt
		for(int i = 0; i < 4; i++)
		{
			System.out.print(encryptedNum[i]);//print encrypted
		}
		System.out.println();
		decryptedNum = Decrypter.decrypt(userInput);//decrypt
		for(int i = 0; i < 4; i++)
		{
			System.out.print(decryptedNum[i]);//print decrypted	
		}
		
	}
}
