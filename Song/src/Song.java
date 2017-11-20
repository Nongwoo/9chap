
public class Song {

 String t; 
 String a; 
 int y; 
 String con;
 public Song ( String t , String a , int y, String con) {
	 this.a = a; 
	 this.t=t ; 
	 this.y = y; 
	 this.con = con; 
 }
 public void show() { 
	 System.out.println(this.y+ this.con + "국적의 " + this.a+ "의"+ this.t );
 }
 
	public static void main(String[] args) {
		Song song = new Song (" Dancing Queen" , "ABBA", 1978, "스웨덴"); 
		song.show(); 

	}

}
