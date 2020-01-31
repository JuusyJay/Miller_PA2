import java.util.Scanner;//import scanner 


public class BMICalculator {
	
	Scanner in = new Scanner(System.in);//create scanner
	
	public int userChoice;
	public double userWeight, userHeight, Bmi;//declare instance variables
	public String bmiCat;
	
	private void setWeight()
	{
		System.out.println("Please enter your Weight(Pounds or Kilograms): ");//ask for user input
		this.userWeight = in.nextDouble();//get user input
		if(this.userWeight < 0)
		{
			System.exit(0);//if negative exit
		}
	}
	
	
	private void setHeight()
	{
		System.out.println("Please enter your Height(Inches or Meters): ");//ask for user input
		this.userHeight = in.nextDouble();//get user input
		if(this.userHeight < 0)
		{
			System.exit(0);//if negative exit
;
		}
	}
	
	public double getBmi()
	{
		return this.Bmi;//returns bmi
	}
	public String getBmiCategory()
	{
		return calculateBmiCategory();//returns bmi category
	}
	public double getWeight()
	{
		return userWeight;//returns user weight
	}
	
	
	public double getHeight()
	{
		return userHeight;//returns height
	}
	
	
	public void readUserData()//calls two functions
	{

		readUnitType();//calls to read the unit type input by user
		readMeasurementData();//calls to determine users choice and select the correct formula
		
	}
	
	
	public double calculateBmi()//actual bmi calculator
	{
		if(this.userChoice == 1)
		{
			this.Bmi = (getWeight() / (getHeight() * getHeight()));		
		}
		else if(this.userChoice == 2)
		{
			this.Bmi = (703 * getWeight()) / (getHeight() * getHeight());	
		}

		return this.Bmi;

	}
	
	
	public void displayBmi()
	{
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");//prints out the information
		System.out.println("Obesity = BMI of 30 or greater");
		
		System.out.printf("\nYour BMI is: %.1f", getBmi());//prints up to one decimal point the users BMI
		System.out.printf("\nYour BMI Category is: %s", getBmiCategory());//prints the users BMI category
		
	}
	
	
	private int readUnitType()
	{
		System.out.println("Type 1 for Metric or 2 for Imperial: ");//prompts user
		do
		{
			this.userChoice = in.nextInt();//get user input
			
			if(this.userChoice == 1)
			{
				return this.userChoice;//if 1 then return 1
			}
			else if(this.userChoice == 2)
			{
				return this.userChoice;//if 2 return 2
			}
			
		}while(this.userChoice < 1 || this.userChoice > 2);//don't let them continue until they enter 1 or 2
		
		return this.userChoice;
	}
	
	
	private void readMeasurementData()
	{
		if(this.userChoice == 1)
		{
			readMetricData();//use metric if choice is 1
		
		}
		else if(this.userChoice == 2)
		{
			readImperialData();//use imperial if choice is 2
		}
		
	}
	
	
	private void readMetricData()
	{
		setWeight();//prompt user input
		setHeight();//prompt user input
	}
	
	
	private void readImperialData()
	{
		setWeight();//prompt user input
		setHeight();//prompt user input
	}
	
	
	private String calculateBmiCategory()
	{
		if(this.Bmi < 18.5)
		{
			this.bmiCat = "Underweight";//set underweight if < 18.5
		}
		else if(this.Bmi >= 18.5 && this.Bmi <= 24.9)
		{
			this.bmiCat = "Normal Weight";//set normal weight if >= 18.5 or <= 24.9
		}
		else if(this.Bmi >= 25 && this.Bmi <= 29.9)
		{
			this.bmiCat = "Overweight";//set overweight if >=25 or <= 29.9
		}
		else if(this.Bmi >= 30)
		{
			this.bmiCat = "Obese";//set obese if > 30

		}
		return this.bmiCat;//return the correct Category
	}
	
	
	
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();//create new BMICalculator
	    app.readUserData();//read in all data
	    app.calculateBmi();//calculate the BMI and Cat
	    app.displayBmi();//display all
	}
}
