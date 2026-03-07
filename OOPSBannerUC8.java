import java.util.HashMap;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // HashMap to store character patterns
        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        // Print banner
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}