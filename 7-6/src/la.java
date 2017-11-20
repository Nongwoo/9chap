import java.util.HashMap;
import java.util.Scanner;

class Location {  //location 클래스 만들기 
   String country; 
   int lat, lon; 
   public Location(String country, int lat, int lon) { 
      this.country = country; 
      this.lat = lat; 
      this.lon = lon; } } 
public class la { 
   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in); 
      HashMap<String, Location> map = new HashMap<String, Location>(); 
      System.out.println("도시,경도,위도를 입력하세요."); 
      for(int i=0 ; i<4 ; i++) { //4개의 도시 
         System.out.print(">> "); 
         String[] str = sc.nextLine().split(", "); 
         int d1 = Integer.parseInt( str[1] ); 
         int d2 = Integer.parseInt( str[2] ); 
         map.put(str[0], new Location(str[0], d1, d2));  //해시맵(str, location)  
      } 
      System.out.println("----------------"); 
      for(String key : map.keySet()) { 
         Location loc = map.get(key); //key값은 나라 이름 
         System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
      } 
      System.out.println("----------------"); 
      while( true ) { // 도시 검색 
         System.out.print("도시이름 >> "); 
         String str = sc.nextLine(); 
         if( str.equals("그만") ) { 
            break;  } 
         
         if( map.containsKey(str) ) { 
            Location loc = map.get(str);  //key값 입력 - 도시,경도,위도 출력 
            System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
            } else { 
            System.out.println(str + "은(는) 없습니다."); } } } } 