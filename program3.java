public class program3 {
    public static boolean compareStrings(String str1,String str2)
    {
        return str1.equals(str2);
    }
    public static String copyString(String original)
    {
        return new String(original);
    }
    public static  String concatenateStrings(String str1,String str2){
        return str1+str2;
    }
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("String comparison:");
        System.out.println("Are the strings equal? "+compareStrings(str1,str2));
        String original = "copy me!!!";
        String copied = copyString(original);
        System.out.println("\nstring copy:");
        System.out.println("original string :"+original);
        System.out.println("copied string:"+copied);
        String part1="Hello";
        String part2 = "world!";
        String concatenated = concatenateStrings(part1,part2);
        System.out.println("\n String concatenation:");
        System.out.println("Concatenate string:"+concatenated);
    }
}
