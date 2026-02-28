/**
 * OOPSBannerApp UC2 - Banner Display Application
 *
 * This class demonstrates the creation of a visual banner 
 * displaying the word "OOPS" using ASCII art composed of 
 * asterisks (*) and spaces. The banner is printed to the
 * console using individual print statements for each line,
 * creating a decorative text effect.
 *
 * @author Zarif029
 * @version 2
 */

// Extend UC1 to display the message "OOPS" in a banner format
// using characters formed by spaces and asterisks (*) to create a visual
// effect for each letter in the message. Use print statements for each line
// instead of a loop.

public class OOPSBannerApp {

    // Main method to run the banner display
    // Print each line of the OOPS banner to create the visual effect
    // Construct each line using string concatenation.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.
    // Using individual print statements for each line.
    public static void main(String[] args) {
        System.out.println("   ***  " + " " + "   ***  " + " " + "******" + " " + "     *****");
        System.out.println("  ** ** " + " " + "  ** ** " + " " + "**  **" + " " + "    **    ");
        System.out.println(" **  ** " + " " + " **  ** " + " " + "**  **" + " " + "   **  ** ");
        System.out.println(" **  ** " + " " + " **  ** " + " " + "**  **" + " " + "   **  ** ");
        System.out.println(" **  ** " + " " + " **  ** " + " " + "****** " + " " + "     ***  ");
        System.out.println(" **  ** " + " " + " **  ** " + " " + "**    " + " " + "        **");
        System.out.println(" **  ** " + " " + " **  ** " + " " + "**    " + " " + "        **");
        System.out.println("  ** ** " + " " + "  ** ** " + " " + "**    " + " " + "    **  **");
        System.out.println("   ***  " + " " + "   ***  " + " " + "**    " + " " + "     *****");
    }
}