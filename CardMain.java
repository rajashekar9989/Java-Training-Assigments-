
package Persistent.session.BankCardConfig;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CardMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ShoppingCardConfig.class);
		context.refresh();
		ShoppingCard shoppingCard = (ShoppingCard) context.getBean(ShoppingCard.class);
		System.out.println(shoppingCard);
		Item item = (Item) context.getBean(Item.class);
	System.out.println(item);
		((ConfigurableApplicationContext) context).close();

	}
}
