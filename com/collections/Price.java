package com.collections;

public class Price {

	
	     
	    private String item;
	    private int price;
	    private static String organiz = "VSoltions";
	    private Pizza pizza;
	     
	    
	    public Pizza getPizza() {
			return pizza;
		}

		public void setPizza(Pizza pizza) {
			this.pizza = pizza;
		}

		public Price() {
		}

		public Price(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		 public int hashCode(){
		        System.out.println("In hashcode");
		        int hashcode = 0;
		     /* // hashcode = price*20;
		     //  System.out.println(hashcode);
		      hashcode += item.hashCode();
		      
		      System.out.println(hashcode);*/
		        System.out.println(hashcode);
		        return hashcode;
		    }
		     
		    public boolean equals(Object obj){
		        System.out.println("In equals");
		        if (obj instanceof Price) {
		            Price pp = (Price) obj;
		            return (pp.item.equals(this.item) || pp.price == this.price);
		        } else {
		            return false;
		        }
		    }
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Price [item=").append(item).append(", price=").append(price).append("]");
			return builder.toString();
		}
	    
}
