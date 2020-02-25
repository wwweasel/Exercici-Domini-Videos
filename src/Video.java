import java.util.*;

public class Video {
	private String title;
	private String url;
	private List<String> tags;
	
	public Video( String title, String url ){
		this.title = title;
		this.url = url;
		tags = new ArrayList<String>();
	}
	
	public void add_tag( String tag ) throws EmptyFieldException{
		if( tag != null && !tag.isEmpty() && (tag.length()>0) ) {
			this.tags.add(tag);
		}else {
			throw new EmptyFieldException("Tag is null or empty!");
		}
	}
	
	public void print_tags() {
		for (String tag : this.tags) {
			System.out.println(tag);
		}
	}

	@Override
	public String toString() {
		return "Video: [title=" + title + ", url=" + url + ", tags=" + tags + "]";
	}
	
	
}
