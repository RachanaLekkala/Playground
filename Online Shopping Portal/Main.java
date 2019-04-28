public class Main {
	public static void main(String[] args) {
	 Customers customerObj1=new Customers();
     customerObj1.cid=1001;
      customerObj1.name="Saakshi";
      customerObj1.mobileNumber=9000000000L;
      customerObj1.sAddress="Bangalore";
      customerObj1.dateOfBirth="16-Jul-1990";
      customerObj1.gender='F';
      customerObj1.orderHistory="Lakme Kajal,Salwar";
      Customers customerObj2=new Customers();
     customerObj2.cid=1008;
      customerObj2.name="Rahul";
      customerObj2.mobileNumber=9000000001L;
      customerObj2.sAddress="Chennai";
      customerObj2.dateOfBirth="27-Jan-1992";
      customerObj2.gender='M';
      customerObj2.orderHistory="T-Shirt,Jeans";
      Suppliers supplierObj1=new Suppliers();
     supplierObj1.sid=7901;
      supplierObj1.name="ABC Traders";
      supplierObj1.mobileNumber=8000000000L;
      supplierObj1.bAddress="Mumbai";
      supplierObj1.itemsStock=10;
      supplierObj1.paymentStatus="Paid";
      supplierObj1.feedbackRating=4.75f;
      Suppliers supplierObj2=new Suppliers();
     supplierObj2.sid=7972;
      supplierObj2.name="XYZ Enterprises";
      supplierObj2.mobileNumber=8000000900L;
      supplierObj2.bAddress="Kolkata";
      supplierObj2.itemsStock=7;
      supplierObj2.paymentStatus="unpaid";
      supplierObj2.feedbackRating=4.35f;
      customerObj1.profileDetails(customerObj1);
      customerObj2.profileDetails(customerObj2);
      supplierObj1.profileDetails(supplierObj1);
      supplierObj2.profileDetails(supplierObj2);
      customerObj1.editAddress();
      supplierObj1.editAddress();
      customerObj1.placeOrder();
      supplierObj1.increaseStockLevel(supplierObj1.itemsStock);
      supplierObj2.increaseStockLevel(supplierObj2.itemsStock);
    }	
}

class Users {
		String name;
  		long mobileNumber;
 		 String Address;
  		
  		public void profileDetails(Users object)
        {
          System.out.println(object.name+", "+object.mobileNumber);
        }
}

class Customers extends Users{
		int cid;
        String sAddress;
  		String dateOfBirth;
  		char gender;
  		String orderHistory;
  		public void placeOrder()
        {
          System.out.println("Order placed successfully!");
        }
  		public void editAddress()
        {
          System.out.println(name+", "+sAddress);
          String Address="Coimbatore";
          System.out.println(name+", "+Address);
        }
}

class Suppliers extends Users {
		int sid;
  String bAddress;
  		int itemsStock;
  		String paymentStatus;
  		float feedbackRating;
  		public void increaseStockLevel(int stock)
        {
           if(stock==10)
             System.out.println(name+", "+(stock+5));
          else
            System.out.println(name+", "+(stock+10));
        }
  public void editAddress()
        {
          System.out.println(name+", "+bAddress);
          String Address="Delhi";
          System.out.println(name+", "+Address);
        }
}