package Persistent.session.BankCardConfig;

import org.springframework.context.annotation.*;

@Configuration
public class ShoppingCardConfig {
	@Bean
	public  ShoppingCard  shoppingCard() {
		return new ShoppingCard("SBI", 12345);
	}

	@Bean
	public Item item() {
		return new Item("ICE Cream", 100);
	}
}