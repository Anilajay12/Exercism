import java.util.*;
public class PangramChecker {
    public boolean isPangram(String x) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        x=x.toLowerCase();
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<x.length();i++){
            if(!(hmap.containsKey(x.charAt(i))) && x.charAt(i)>='a' && x.charAt(i)<='z')
                hmap.put(x.charAt(i),1);
        }
        return (hmap.size()==26)?true:false;
    }

}
