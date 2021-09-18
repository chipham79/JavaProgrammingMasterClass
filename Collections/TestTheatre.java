package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTheatre {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Rock", 8, 12);
		
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theatre.reserveSeat("A02")) {
			System.out.println("Please pay for A02");
		}
		else {
			System.out.println("Seat already reserved");
		}
		
		Collections.reverse(seatCopy); 
		System.out.println("Printing seat already reversed");
		printList(seatCopy);
		
		Collections.shuffle(seatCopy); // randomly
		System.out.println("Printing random seatCopy");
		printList(seatCopy);
		
		System.out.println("Printing theatre.seats");
		printList(theatre.seats);
		
		
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		
		System.out.println("Min seat number is " + minSeat.getSeatNumber());
		System.out.println("Max seat number is " + maxSeat.getSeatNumber());

		sortList(seatCopy);
		System.out.println("Printing sorted seatCopy");
		printList(seatCopy);
		
		
		/*		theatre.getSeats();
		
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		}
		else {
			System.out.println("Sorry, seat is taken");
		}
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		}
		else {
			System.out.println("Sorry, seat is taken");
		}
		*/
		List<Theatre.Seat> revereSeats = new ArrayList<>(theatre.getSeats());
		Collections.reverse(revereSeats);
		printList(revereSeats);
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
		priceSeats.add(theatre.new Seat("B00", 13.00));
		priceSeats.add(theatre.new Seat("A00", 13.00));
		Collections.sort(priceSeats, Theatre.PRICE_ORDER);
		printList(priceSeats);
		
		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
		}
		System.out.println();
		System.out.println("======================================================");
	}
	
	public static void sortList( List<? extends Theatre.Seat> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}
			}
		}

	}
}
