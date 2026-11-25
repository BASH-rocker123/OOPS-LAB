import java.util.Scanner;

public class EmailOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String VALID_DOMAIN = "bmsce.ac.in";

        System.out.print("Enter student email address: ");
        String email = sc.nextLine();

        
        String trimmed = email.trim();
        System.out.println("\n9. Trimmed email: \"" + trimmed + "\"");

        
        System.out.println("1. Length of email: " + trimmed.length());

        
        int atIndex = trimmed.indexOf('@');
        if (atIndex == -1) {
            System.out.println("Invalid email: '@' symbol not found.");
            sc.close();
            return;
        }
        String username = trimmed.substring(0, atIndex);
        String domain = trimmed.substring(atIndex + 1);
        System.out.println("2. Username: " + username);
        System.out.println("3. Domain: " + domain);
        if (domain.equals(VALID_DOMAIN)) {
            System.out.println(" Domain matches. Email belongs to the institution.");
        } else {
            System.out.println(" Domain does not match. Not an institutional email.");
        }

        
        System.out.println("4. Lowercase email: " + trimmed.toLowerCase());

        
        System.out.print("5. Enter prefix to check (e.g., registration number): ");
        String prefix = sc.nextLine().trim();
        if (trimmed.startsWith(prefix)) {
            System.out.println(" Email starts with the prefix \"" + prefix + "\".");
        } else {
            System.out.println(" Email does NOT start with the prefix \"" + prefix + "\".");
        }

        
        if (trimmed.endsWith(VALID_DOMAIN)) {
            System.out.println("6. Email ends with \"" + VALID_DOMAIN + "\": true");
        } else {
            System.out.println("6. Email ends with \"" + VALID_DOMAIN + "\": false");
        }

       
        String updated = trimmed.replace(VALID_DOMAIN, "cse.bmsce.ac.in");
        System.out.println("7. Updated email: " + updated);

        
        System.out.print("8. Enter character/sequence to search (e.g., cse or 2025): ");
        String seq = sc.nextLine().trim();
        if (trimmed.contains(seq)) {
            System.out.println(" Email contains \"" + seq + "\".");
        } else {
            System.out.println(" Email does NOT contain \"" + seq + "\".");
        }

        
        System.out.print("10. Enter first email to compare: ");
        String e1 = sc.nextLine().trim();
        System.out.print(" Enter second email to compare: ");
        String e2 = sc.nextLine().trim();
        if (e1.equalsIgnoreCase(e2)) {
            System.out.println(" The two emails are identical (ignoring case).");
        } else {
            System.out.println(" The two emails are different.");
        }

        sc.close();
    }
}
