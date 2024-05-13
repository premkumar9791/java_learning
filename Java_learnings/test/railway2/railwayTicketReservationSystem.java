package railway2;

import java.util.ArrayList;
import java.util.Scanner;

import railway.Passenger2;

public class railwayTicketReservationSystem {
	private int totalBerths=3;
	private int lowerBerths = 1;
    private int middleBerths =1;
    private int upperBerths = 1;
    private int totalRACBerths = 1;
    private int totalWaitingListTickets = 1;
    private ArrayList<passenger3> bookedTickets = new ArrayList<>();
    private ArrayList<passenger3> racTickets = new ArrayList<>();
    private ArrayList<passenger3> waitingListTickets = new ArrayList<>();
    
	private void BookTicket() {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter your name:");
		String name=s.nextLine();
		System.out.println("Eneter your age:");
		int age=s.nextInt();
		System.out.println("Enter your gender(M/F):");
		String gender=s.nextLine().toUpperCase();
		System.out.println("Eneter your Berth(Upper/Lower/middle):");
		String berth=s.nextLine().toLowerCase();
		
		if(age < 5) {
			System.out.println("below 5 years are not allow to booking tickets");
			return;
		}
		
		if(berth.equals("lower")) {
			if(lowerBerths>0) {
				lowerBerths--;
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("Sorry! lower berth is not available suggesing available berth");
				suggestAvailableBerths(name, age, gender);
				return;
			}
		}
		else if(berth.equals("upper")){
			if(upperBerths>0) {
				upperBerths--;
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("Sorry! upper berth is not available suggesing available berth");
				suggestAvailableBerths(name, age, gender);
				return;
			}
		}
		else if(berth.equals("middle")){
			if(middleBerths>0) {
				middleBerths--;
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("Sorry! middle berth is not available suggesing available berth");
				suggestAvailableBerths(name, age, gender);
				return;
			}
		}
		else {
			System.out.println("invalid Input");
			return;
		}
		
		if(age > 5) {
			passenger3 passenger=new passenger3( name,age,gender, berth);
			
			if(totalBerths>0) {
				bookedTickets.add(passenger);
				totalBerths--;
                System.out.println("Ticket booked successfully!");
                System.out.println("----------------------------");
			}
			else if(totalRACBerths>0) {
				racTickets.add(passenger);
				totalRACBerths--;
                System.out.println("Ticket booked successfully! (RAC)");
                System.out.println("----------------------------");
			}
			else {
				waitingListTickets.add(passenger);
				totalWaitingListTickets--;
                System.out.println("Ticket booked successfully! (RAC)");
                System.out.println("----------------------------");
			}
			
		}
		
		
	}

	private void suggestAvailableBerths(String name, int age, String gender) {
	
	
		System.out.println("-------------------------------------------");
		if(lowerBerths>0) {
			System.out.println("1.lower");
		}
		 if (middleBerths > 0) {
	            System.out.println("2. Middle");
	        }
	        if (upperBerths > 0) {
	            System.out.println("3. Upper");
	        }
	        if(lowerBerths==0 && middleBerths==0 && upperBerths==0)
	        {
	        	System.out.println("4.Book on RAC");
	        }
	        
	        System.out.print("Enter your choice (1-4): ");
	        Scanner scanner = new Scanner(System.in);
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline left by nextInt()

	        switch (choice) {
	            case 1:
	                lowerBerths--;
	                bookedTickets.add(new passenger3(name, age, gender, "lower"));
	                totalBerths--;
	                System.out.println("Ticket booked successfully!");
	                System.out.println("---------------------------------");
	                break;
	            case 2:
	                middleBerths--;
	                bookedTickets.add(new passenger3(name, age, gender, "middle"));
	                totalBerths--;
	                System.out.println("Ticket booked successfully!");
	                System.out.println("---------------------------------");
	                break;
	            case 3:
	                upperBerths--;
	                bookedTickets.add(new passenger3(name, age, gender, "upper"));
	                totalBerths--;
	                System.out.println("Ticket booked successfully!");
	                System.out.println("---------------------------------");
	                break;
	            
	            case 4:
	            	if (totalRACBerths > 0) {
	                     racTickets.add(new passenger3(name, age, gender, "side lower"));
	                     totalRACBerths--;
	                     System.out.println("Ticket booked successfully! (RAC)");
	                     System.out.println("---------------------------------");
	                     break;
	            	}else
	            	{
	            		System.out.println("----------------------------");
	            		System.out.println("RAC NOT Available,you can book on Waiting List");
	            		System.out.println("Say Yes to book on Waiting_List");
	            		String reply=scanner.next().toLowerCase();
	            		if(reply.equals("yes"))
	            		{
	            			 waitingListTickets.add(new passenger3(name, age, gender, "NA"));
	                         totalWaitingListTickets--;
	                         System.out.println("Ticket booked successfully! (Waiting List)");
	                         System.out.println("------------------------------------------");
	            		}
	            		break;
	            	}
	            	
	                   	
	            		
	            	
	            	
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }
	}

	public static void main(String[] args) {
	
		railwayTicketReservationSystem reservetion=new railwayTicketReservationSystem();
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nRailway Ticket Reservation System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Print Booked Tickets");
            System.out.println("4. Print Available Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.println("-----------------------");
            
            switch(choice) {
            case 1:{
            	reservetion.BookTicket();
            }
            case 2:{
            	reservetion.CancelTicket();
            }
            case 3:{
            	reservetion.PrintBookedTickets();
            }
            case 4:{
            	reservetion.PrintAvailableTickets();
            }
            case 5:{
            	System.out.println("Exiting the application.  Thank you!");
            	System.exit(0);
            }
            default:{
            	System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            }
		}

	}

	private void PrintAvailableTickets() {
        System.out.println("Available Tickets:");
        System.out.println("----------------------");
        System.out.println("Available Tickets: " + (totalBerths));
        System.out.println("RAC Available Tickets: " + (totalRACBerths));
        System.out.println("Waiting List Available Tickets: " + (totalWaitingListTickets));
        System.out.println("Total Available Tickets: " + (totalBerths + totalRACBerths + totalWaitingListTickets));
		
	}

	private void PrintBookedTickets() {
		if (bookedTickets.isEmpty()) {
            System.out.println("No booked tickets available.");
            System.out.println("----------------------------");
        } else {
            System.out.println("Booked Tickets:");
            System.out.println("---------------");
            for (int i = 0; i < bookedTickets.size(); i++) {
                passenger3 ticket = bookedTickets.get(i);
                System.out.println((i + 1) + ". Name: " + ticket.name + "\n   Age: " + ticket.age +
                        "\n   Gender: " + ticket.gender + "\n   Berth Preference: " + ticket.berthpreference);
            }
            System.out.println("----------------------");
            System.out.println("RAC Tickets:");
            System.out.println("----------------------");
            for (int i = 0; i < racTickets.size(); i++) {
                passenger3 ticket = racTickets.get(i);
                System.out.println((i + 1) + ". Name: " + ticket.name + "\n   Age: " + ticket.age +
                        "\n   Gender: " + ticket.gender + "\n   Berth Preference: " + ticket.berthpreference);
            }
            System.out.println("----------------------");
            System.out.println("Waiting List Tickets:");
            System.out.println("----------------------");
            for (int i = 0; i < waitingListTickets.size(); i++) {
                passenger3 ticket = waitingListTickets.get(i);
                System.out.println((i + 1) + ". Name: " + ticket.name + "\n   Age: " + ticket.age +
                        "\n   Gender: " + ticket.gender + "\n   Berth Preference: " + ticket.berthpreference);
            }
            System.out.println("----------------------");
            System.out.println("Total Booked Tickets: " + bookedTickets.size());
            System.out.println("Total RAC_Booked Tickets: " + racTickets.size());
            System.out.println("Total Waiting_List Tickets: " + waitingListTickets.size());
            System.out.println("----------------------------");
        }
		
	}

	private void CancelTicket() {
		

        Scanner scanner = new Scanner(System.in);

        if (bookedTickets.isEmpty()) {
            System.out.println("No booked tickets to cancel.");
            return;
        }

        System.out.print("Enter passenger name to cancel the ticket: ");
        String canceledPassengerName = scanner.nextLine();

        passenger3 canceledTicket = null;
        for (passenger3 ticket : bookedTickets) {
            if (ticket.name.equalsIgnoreCase(canceledPassengerName)) {
                canceledTicket = ticket;
                break;
            }
            
        }
        if (canceledTicket == null) {
            System.out.println("Ticket with the provided name not found.");
            return;
        }

        
        bookedTickets.remove(canceledTicket);
        totalBerths++;

        if (!racTickets.isEmpty()) {
            passenger3 confirmedTicket = racTickets.remove(0);
            totalRACBerths++;
            bookedTickets.add(new passenger3(confirmedTicket.name, confirmedTicket.age, confirmedTicket.gender, canceledTicket.berthpreference));
            System.out.println("Ticket canceled successfully for " + canceledTicket.name );
            totalBerths--;
        } else {
            System.out.println("Ticket canceled successfully for " + canceledTicket.name + ". No RAC passenger available to move.");
        }
	}



}
