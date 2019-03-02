import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        // setting
        trackList.put("uprising", "we will be victorious");
        trackList.put("supermassive blackhole", "you caught me under false pretenses");
        trackList.put("starlight", "let's conspire to ignite");
        trackList.put("pressure", "I'm hitting the ground and I'm sprinting");

        // getting
        String name = trackList.get("starlight");
        System.out.println(name);

        // iterating
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " +trackList.get(key));
        }
    }
}