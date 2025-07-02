import java.util.*;

public class activities {

    // Activity class to store start and end times
    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        int count = 1;
        int lastEnd = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        System.out.println(count);
    }
}
