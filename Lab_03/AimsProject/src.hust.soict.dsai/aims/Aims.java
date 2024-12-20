package hust.soict.dsai.aims;

import java.util.Arrays;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart minhOrder = new Cart();

		// Create new DVD objects and add them to the cart
		DigitalVideoDisc alt1 = new DigitalVideoDisc("Toy Story",
        "Animation", "John Lasseter", 81, 18.95f);

		DigitalVideoDisc alt2 = new DigitalVideoDisc("Blade Runner",
				"Science Fiction", "Ridley Scott", 117, 23.95f);

		DigitalVideoDisc alt3 = new DigitalVideoDisc("Zootopia",
				"Animation", "Byron Howard", 108, 20.95f);

		DigitalVideoDisc alt4 = new DigitalVideoDisc("The Avengers",
				"Action", 24.99f);

		// minhOrder.addDigitalVideoDisc(alt1);
		// minhOrder.addDigitalVideoDisc(alt2);
		// minhOrder.addDigitalVideoDisc(alt3);

		// Add a list of DVD
		DigitalVideoDisc[] dvdLList = new DigitalVideoDisc[3];
		dvdLList[0] = alt1;
		dvdLList[1] = alt2;
		dvdLList[2] = alt3;
		minhOrder.addDigitalVideoDisc(dvdLList);

		// Add 2 dvd
		minhOrder.addDigitalVideoDisc(alt3, alt4);

		minhOrder.printOrders();

		System.out.println("Total cost is: ");
		System.out.println(minhOrder.totalCost());
		System.out.println(Arrays.toString(minhOrder.getItemsOrdered()));

		minhOrder.removeDigitalVideoDisc(alt2);
		System.out.println("Total cost is: ");
		System.out.println(minhOrder.totalCost());

		System.out.println(Arrays.toString(minhOrder.getItemsOrdered()));
	}
}
