
public class Week2HW {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 1.99;
		double moneyInWallet = 20.50;
		int thirstLevel = 3;
		
		//shouldBuyIcecream – this should be true if it is hot outside and there is money in your pocket
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		
		//willGoSwimming – this should be true if it is hot outside and it is not a weekday
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		//isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		//willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
		System.out.println(willBuyMilk);
	}

}
