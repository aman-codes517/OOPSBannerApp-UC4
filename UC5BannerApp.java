public class UC5BannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement using String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "WELCOME TO OOPS", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}