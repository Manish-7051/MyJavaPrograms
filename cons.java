import java.util.Scanner;

public class Cons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        int count = 0;
        s = s.toLowerCase(); // convert to lowercase

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Count letters that are not vowels
            if(ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }

        if(count > 0){
            System.out.println("It contains " + count + " consonants");
        } else {
            System.out.println("It doesn't contain consonants");
        }

        sc.close();
    }
}
