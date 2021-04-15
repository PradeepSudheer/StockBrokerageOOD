package stockexchange;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import enums.*;

public class Order {
	  private String orderNumber;
	  public boolean isBuyOrder;
	  private OrderStatus status;
	  private TimeEnforcementType timeEnforcement;
	  private Date creationTime;

	  private HashMap<Integer, OrderPart> parts;

	  public void setStatus(OrderStatus status){
	    this.status = status;
	  }

	  public boolean saveInDB() {
	    // save in the database
		  return false;
	  }

	  public void addOrderParts(List<OrderPart> parts) {
	    for (OrderPart part : parts) {
	      //this.parts.put(part.id, part);
	    }
	  }
}
