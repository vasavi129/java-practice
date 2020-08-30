
public abstract class BillGeneration {
	public abstract double generateBill(FoodItem item) throws FoodOrderException;

	public boolean verifyorderType(String type) throws FoodOrderException {
		if (type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("nonveg")) {
			return true;

		} else {
			throw new FoodOrderException("Invalid orderType ", 400);
		}
	}

	public boolean itemType(String type) throws FoodOrderException {

		if (type.equalsIgnoreCase("pizza") || type.equalsIgnoreCase("biryani")) {
			return true;

		} else {
			throw new FoodOrderException("Invalid itemType ", 1400);
		}
	}

	public boolean itemSize(String type) throws FoodOrderException {

		if (type.equalsIgnoreCase("small") || type.equalsIgnoreCase("MEDIUM") || type.equalsIgnoreCase("BiG")) {
			return true;

		} else {
			throw new FoodOrderException("Invalid itemSize ", 1500);

		}

	}

	public boolean verifyofferApplicable(String offer) throws FoodOrderException {

		if (offer.equalsIgnoreCase("true") ) {
			return true;

		} else {
			throw new FoodOrderException("sorry!No Offer Available!!", 453);
		}

	}
	public  boolean verifyPercentage(String discount){
		/*if (discount.valueOf(10) 
				
				) {
			
		} else {

		}*/
		return false;
		
	}
}
