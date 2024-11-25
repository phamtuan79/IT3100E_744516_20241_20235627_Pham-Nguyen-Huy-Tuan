package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];

	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_ORDERED) {
			System.out.println("Reached max number ordered");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("Added");
		}

	}
	// Overload addDidigitalVideoDisc allow list DVD as params
	public void addDigitalVideoDisc( DigitalVideoDisc [] dvdList ) {
		if ( qtyOrdered  >= MAX_ORDERED ) {
			System.out.println("The cart is not capable of add these ammount of dvds");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				itemsOrdered[qtyOrdered] =  dvdList[i];
				qtyOrdered += 1;
			}

			System.out.println("Added");
		}
	}

	// Overload addDigitalVideoDisc allow 2 DVD as params -> Ktra them 2 cai co vuot qua so luong cho phep khong. Neu khong thi add vao nneu co thi bao loi
	public void addDigitalVideoDisc( DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		if (qtyOrdered + 2 >= MAX_ORDERED) {
			System.out.println("The cart is not capable of adding two more dvds");
		} else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered += 1;
			System.out.println("Added");
		}
	}

	public void printOrders() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString());
		}
	}

	public void searchById(int id) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No DVD found with ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No DVD found with title: " + title);
		}
	}

	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("Removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}

	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}

	public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];
		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}
		return listOrdered;
	}
}
