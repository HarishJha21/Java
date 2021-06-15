public class string methods {
    public static void main(String[] args) {
        String name = "Harish";
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //tring nonTrimmedString = "     Harish     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(nonTrimmedString.trim());

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));
        
        //System.out.println(name.replace(oldchar:'r', newchar:'p'));
        //System.out.println(name.replace(target:"rish", replacement:"haha"));

        //System.out.println(name.startsWith("Har"));
        //System.out.println(name.endsWith("Har"));

        //System.out.println(name.charAt(2));

        //String modifiedName = "Harishish";
        //System.out.println(modifiedName.indexOf("ris"));
        //System.out.println(modifiedName.indexOf(str:"ris", 4));
        //System.out.println(modifiedName.LastIndexOf(str:"ris", fromIndex:7));

        //System.out.println(name.equals("harish"));
        System.out.println(name.equalsIgnoreCase("HArIsh"));

        System.out.println("I am escape sequence \" double quote");
        
    }
}
