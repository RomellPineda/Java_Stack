public class StringManipulation {
    public String trimAndConcat(String a, String b) {
        String atrim = a.trim();
        String btrim = b.trim();
        String processed = atrim.concat(btrim);
        return processed;
    }

    public Integer getIndexOrNull(String a, char b) {
        Integer yield = a.indexOf(b);
        if(yield == -1){
            return 0;
        }
        return yield;
    }

    public Integer getIndexOrNull(String a, String b) {
        Integer yield = a.indexOf(b);
        if(yield == -1){
            return 0;
        }
        return yield;
    }

    public String concatSubstring(String a, int b, int c, String d){
        String spliced = a.substring(b,c);
        String mod = spliced.concat(d);
        return mod;
    }
}