public class MyClass {
    public static String stripNonDigits(
    final CharSequence input ){
    final StringBuilder sb = new StringBuilder(
    input.length() );
    for(int i = 0; i < input.length(); i++){
        final char c = input.charAt(i);
        if(c > 47 && c < 58){
            sb.append(c);
        }
    }
    return sb.toString();
}

public static void main(final String[] args){
    final String input = "0-123-abc-456-xyz-789";
    final String result = stripNonDigits(input);
    System.out.println(result);
}
}// result = 0123456789
