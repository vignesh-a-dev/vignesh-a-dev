public class string {
    public static void split() {
        String str = "vignesh, karthik, sanjay, Ananya";
        String[] arr = str.split(", ");
        for (String s : arr) { 
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        String str1 = "   vignesh  "; // uppercase
        String str2 = "VignesH"; // lowercase

        System.out.println(str1.trim());
        System.out.println(str2.charAt(str2.length() - 1));

        char[] ch = str2.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

       
    }
}
