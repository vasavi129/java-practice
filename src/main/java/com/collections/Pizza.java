package com.collections;
import java.util.Date;

abstract public class Pizza {
	int itemId;
	int itemIdGenerator = 0;
	static int billId;
	static int billIdGenerator = 0;
	String category;
	String type;
	String size;
	Date date;
	
	public Date getDate() {
		return new Date();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	Pizza() {
		this.itemId = ++itemIdGenerator;
		this.billId = ++billIdGenerator;
	}
	
	Pizza(int itemId,String category,String type,String size) throws Exception {
		this.itemId = ++itemIdGenerator;
		this.category = category;
		this.type = type;
		this.size = size;
	}
	public int getItemId() {
		return itemId;
	}

	public int getBillId() {
		return billId;
	}

	public String getCategory() {
		return category;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}
	public boolean isValidateCategory(String category){

		
		if( category.equalsIgnoreCase("Veg") || category.equalsIgnoreCase("Non-Veg")){
			return true;
		}
		else 
			return false;
		
	}
	public boolean isValidateSize(String size){

		
		if( size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
			return true;
		}
		else 
			return false;
		
	}
	
	abstract boolean isValidateType();
	abstract float identifyCost();
	abstract float calculateBillAmount();
	
	
}
