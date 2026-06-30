package DAY2;

public class demo {
    public static void main(String[] args) {
        String rev = "";
        String log = "hello";
        for(int i = log.length() - 1; i >= 0; i--) {
            rev = rev + log.charAt(i);
            
        }
System.out.println(rev);
    }
}
