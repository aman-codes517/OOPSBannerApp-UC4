public class UC4_BannerArrayLoops {

    public static void main(String[] args) {

        // Banner stored in String array
        String[] banner = {
            "***********************",
            "*                     *",
            "*       OOPS          *",
            "*     BANNER APP      *",
            "*                     *",
            "***********************"
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}