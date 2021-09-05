package array_list_autoboxing_unboxing.array.linkedlist.playlist;

public class Song {
	private String title;
	private double duration;
	
	public Song(String title, double duration) {		
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s", this.title, this.duration);
	}
	
	
	
	
}
