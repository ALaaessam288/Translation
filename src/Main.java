import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
            String s1 =scanner.nextLine().toLowerCase() ;
            String s2 =scanner.nextLine().toLowerCase() ;

            if (isValid(s1,s2))
            {
                System.out.println("YES");
            }
            else
                 System.out.println("NO");



    }
    public static String reverse (String s) {
        char [] chars = s.toCharArray() ;
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[s.length() - 1 - i];
            chars[s.length() - 1 - i] = temp;

        }
        return new String(chars); // Return the reversed string
    }
    public static boolean isValid (String s1 ,String s2)
    {
        String reversedS2 = reverse(s2) ;
        return s1.equals(reversedS2) ;

    }
}