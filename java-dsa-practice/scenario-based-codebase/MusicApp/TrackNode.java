package MusicApp;

public class TrackNode {
 int id;
 String name;
 String artist ;
 TrackNode left =null;
 TrackNode right = null;
  public TrackNode(int id,String name,String artist) {
	  this.id=id;
	  this.name =name;
	  this.artist=artist;
	  
  }
}
