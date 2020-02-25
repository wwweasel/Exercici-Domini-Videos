import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class User {
	private String name;
	private String surname;
	private String password;
	private String register_date;
	
	List<Video> videos;
	
	public User( String name, String surname, String password ) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		
		Date now = new Date();
		DateFormat dtf = new SimpleDateFormat("YYYY/MM/dd");
		this.register_date = dtf.format(now);
		
		this.videos = new ArrayList<Video>();
	}
	
	public void add_video(Video video) throws EmptyFieldException{
		if(video!=null) {
			this.videos.add(video);
		}else {
			throw new EmptyFieldException("Can't add NULL to video list!");
		}
	}
	
	public void print_videos() {
		toString();
		for (Video video : this.videos) {
			System.out.println("\t"+video);
		}
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", register_date=" + register_date;
	}
	
	
	
}
