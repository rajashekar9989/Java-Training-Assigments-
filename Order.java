package elleven_December;

import java.io.Serializable;

public class Order implements Serializable  {
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", amount=" + amount + "]";
	}

	/* At runtime serialization  associate with unique number with each serialized class.
	 * this unique id is used while diserialization so that  sender and receiver of this serialized.
objects can make sure they are using/loaded  same class	
if at the time of diserialization serial version uid does not match ,it will throw invalidclass exception .
jdk comes with tool  serialvar, it is used to get serialVersionUid number for tghe class and perform the comparsam 
	 */
	public int orderId;
	public String itemName;
	public double amount;
	
	//private static final long SerialVersionUid =123456787654;

	public Order(int orderId, String itemName, double amount) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.amount = amount;
	}

	



	

}
