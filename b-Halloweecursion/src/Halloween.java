import java.util.Scanner;

public class Halloween {
    int days;
    // TASK 3: change this to a map, if you want, so you can do "first day", "second day", etc. 
    String[] gifts; 
    Scanner sc = new Scanner(System.in);

    Halloween(String[] gifts) {
        days = gifts.length;
        this.gifts = gifts;
    }

    public void singSong() {
        System.out.println("OK! I've made you a song to celebrate halloween!");

        System.out.println("On day 1 of halloween my true love gave to me: ");
        System.out.println("a " + gifts[0] + "!");
        for (int d = 1; d < days; d++) {
            System.out.println("On day " + (d+1) + " of halloween my true love gave to me:");
            // iterative solution
            // for(int countdown = d; countdown > 0; countdown--) {
            //     System.out.println((countdown + 1) + " " + gifts[countdown] + ",");
            // }
            // System.out.println("and a " + gifts[0] + "!");

            // recursive solution
            printDay(gifts, d);
        }
    }

    public void printDay(String[] gifts, int day) {
        if (day == 0) {
            System.out.println("and a " + gifts[0] + "!");
        } else {
            System.out.println((day + 1) + " " + gifts[day] + ",");
            printDay(gifts, day - 1);
        }
    }

    /*
     * TASK 2: How do would you call this recursively and loop until the user
     * finally puts an integer in?
     * Hint: use the Scanner class's hasNextInt() to consume the next int. 
     */
    public int getUserInt() {
        Integer.parseInt(sc.nextLine());
        if (sc.hasNextInt()) {
            int c = sc.nextInt();

        };

        return sc.nextInt();
    }

    public int getDays() {
        return days;
    }

    public String[] getGifts() {
        return gifts;
    }

    Halloween() {
        System.out.println("How many days of halloween are you celebrating?");
        days = getUserInt();
        sc.nextLine(); // skip enter
        gifts = new String[days];
        for (int d = 0; d < days; d++) {
            System.out.println(
                    "You get a gift on day " + (d + 1) + " of Halloween. You get " + (d + 1)
                            + " of this gift. What shall it be?");
            String s = sc.nextLine();
            gifts[d] = s;
            System.out.println("Thank you!");
        }
        sc.close();
    }

    
}
