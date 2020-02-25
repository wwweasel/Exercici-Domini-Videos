import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("Trailer", "https://www.youtube.com/results?search_query=pildorasinformaticas+poo");
		Video v2 = new Video("Nils Frahm", "https://www.youtube.com/watch?v=7sfe3AubDVg");
		
		try {
			v1.add_tag("Java");
			v1.add_tag("Music");
			v2.add_tag("Music");
		} catch (EmptyFieldException e) {System.out.println( "TagException occured: " + e.getMessage() );}
		
		
		
		User u1 = new User("M", "H", "password123");
		System.out.println( u1.toString() );
		try {
			u1.add_video(v1);
			u1.add_video(v2);
		} catch (EmptyFieldException e) {System.out.println( "EmptyFieldException occured: " + e.getMessage() );}
		
		User u2 = new User("N", "U", "password123");
		
		u1.print_videos();
	}

}
