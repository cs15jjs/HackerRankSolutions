
public class Solutions {

	public static void totalCost()
	{
		int meal_cost = 12;
		int tip_percent = 20;
		int tax_percent = 8;
		double tip = tip_percent / 100.0f;
		double tax = tax_percent / 100.0f;
		tip = meal_cost * tip;
		tax = meal_cost * tax;
		double total_cost = tip + tax + meal_cost;
		int final_cost = (int) Math.round(total_cost);
		System.out.println("The total meal cost is " + final_cost + " dollars.");
	}

	public static void WeirdNotWeird(int n)
	{
		String ans = "";

		if(n % 2 == 1)
		{
			ans = "Weird";
		}
		else if(n % 2 == 0 && 2 <= n && n <= 5)
		{
			ans = "Not Weird";
		}
		else if(n % 2 == 0 && 6 <= n && n <= 20)
		{
			ans = "Weird";
		}
		else if(n % 2 == 0 && n < 20)
		{
			ans = "Not Weird";
		}
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalCost();
		for (int i = 0; i < 5; i++)
			{
			WeirdNotWeird(i);
			}
	}

}
