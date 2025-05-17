package lab_1;



import java.util.Scanner;

public class MovieDriver_Task1{

	public static void main(String[] args) {
		//scanner object to read keyboard input
		Scanner scanner = new Scanner(System.in);
		
		//new movie object
		Movie movie = new Movie();
				
		//prompt user to enter title, read that line , set title in movie object
		System.out.println("Enter the name of a movie");
		String title = scanner.nextLine();
		movie.setTitle(title);
				
		//prompt user to enter rating, read that line , set rating in movie object
		System.out.println("Enter the rating of the movie");
		String rating = scanner.nextLine();
		movie.setRating(rating);
				
		//prompt user to enter sold tickets, read that integer , set number of tickets sold in movie object
		System.out.println("Enter the number of tickets sold for this movie");
		int soldTickets = scanner.nextInt();
		movie.setSoldTickets(soldTickets);
		
		//Print out the information using the movie’s toString method
		System.out.println(movie.toString());
		
		scanner.close();
}

		
}


