public class ABBA {
    public String canObtain(String initial, String target) {
    	String intermediate = target;

        while( intermediate.length() != initial.length() ) {
            if( intermediate.charAt(intermediate.length() - 1) == 'A') {
            	intermediate = intermediate.substring(0, intermediate.length() - 1);
            } else {
            	intermediate = intermediate.substring(0, intermediate.length() - 1);
              intermediate = new StringBuilder(intermediate).reverse().toString();
            }
        }

        if(intermediate.equals(initial)) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }
}
