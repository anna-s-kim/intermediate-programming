public class candy {
    public static void main(String[] args) throws Exception {
        double c1_look = 3.0, c1_taste = 4.2, c2_look = 3.6, c2_taste = 4.0;
        double c1_overall = .3 * c1_look + .7 * c1_taste;
        double c2_overall = .3 * c2_look + .7 * c2_taste;
        String c1_name = "JR";
        isBetter(c1_name, "HC", c1_overall, c2_overall);
        double c3_look = 4.3;
        double c3_taste = 3.5;
        double c3_overall = .3 * c3_look + .7 * c3_taste;
        isBetter(c1_name, "KitKat", c1_overall, c3_overall);
        System.out.println(isBetter("HC", "KitKat", c2_overall, c3_overall));
    }

    static String isBetter(String c1name, String c2name, double c1_overall,
            double c2_overall) {
        if (c1_overall > c2_overall) {
            return c1name + " is better than" + c2name;
        } else {
            return c2name + " is better than" + c1name;
        }
    }
}