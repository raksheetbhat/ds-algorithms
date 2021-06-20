class FlipBinaryStr {
    public static void main(String[] args) {
        System.out.println(minFlips("01001001101"));
    }
    public static String calc(String s, boolean freeze) {
        switch(s) {
            case "111": return "101";
            case "110": return freeze ? "100" : "010";
            case "101": return "101";
            case "100": return "101";
            case "001": return freeze ? "011" : "101";
            case "011": return "010";
            case "010": return "010";
            case "000": return "010";
            default: return s;
        }
    }
    public static String repl(String s, int i, String sub) {
        StringBuilder str = new StringBuilder(s);
        return str.replace(i, i+sub.length(), sub).toString();
    }
    public static int minFlips(String str) {
        if(str.length() < 3){
            switch(str){
                case "0":
                case "1":
                case "10":
                case "01": return 0;
                case "00":
                case "11": return 1; 
            }
        }

        int i=0, c=0;
        StringBuilder sb = new StringBuilder(str);
        while(true) {
            String s = sb.toString();
            if(s.length() - i < 3) break;
            String sub = s.substring(i, i+3);
            String alt = calc(sub, i == 0 ? false : true);
            System.out.println(sub+", "+alt+", "+s);
            if(!alt.equals(sub)){
                c++;
                sb = new StringBuilder(repl(s, i, alt));
            }
            i++;
        }

        return c;
    }
}