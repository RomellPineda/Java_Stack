public class StringManipulation {
    
    // Trim both input strings and then concatenate them.
    public String trimAndConcat(String a, String b) {
        String atrim = a.trim();
        String btrim = b.trim();
        String processed = atrim.concat(btrim);
        return processed;
    }

    // Get the index of the character.
    public Integer getIndexOrNull(String a, char b) {
        Integer yield = a.indexOf(b);
        if(yield == -1){
            return null;
        }
        return yield;
    }

    // Get the index of the start of the substring.
    public Integer getIndexOrNull(String a, String b) {
        Integer yield = a.indexOf(b);
        if(yield == -1){
            return null;
        }
        return yield;
    }

    // Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    public String concatSubstring(String a, int b, int c, String d){
        String spliced = a.substring(b,c);
        String mod = spliced.concat(d);
        return mod;
    }
}