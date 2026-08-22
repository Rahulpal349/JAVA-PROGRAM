public class StudentMarks {

    static int calculateTotal(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    static double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);

        return (double) total / marks.length;
    }

    static int findHighest(int[] marks) {
        int highest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    static int findLowest(int[] marks) {
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    public static void main(String[] args) {

        int[] marks = {85, 72, 91, 68, 88};

        System.out.println("===== MARKS ANALYZER =====");

        int subject = 1;

        for (int mark : marks) {
            System.out.println("Subject " + subject + ": " + mark);
            subject++;
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(marks);
        int highest = findHighest(marks);
        int lowest = findLowest(marks);

        System.out.println();
        System.out.println("Total: " + total);
        System.out.printf("Average: %.1f%n", average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}