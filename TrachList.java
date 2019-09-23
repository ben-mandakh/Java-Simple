import java.util.HashMap;
import java.util.Set;

public class TrachList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("I belive I can fly", "R Kelly");
        trackList.put("Where is the love", "Black Eyed Peas");
        trackList.put("Faded", "Chris Brown");

        // get the keys by using the keySet method
        Set<String> songs = trackList.keySet();
        for(String song : songs) {
            System.out.println(song);
            System.out.println(trackList.get("Faded"));    
        }
    }
}