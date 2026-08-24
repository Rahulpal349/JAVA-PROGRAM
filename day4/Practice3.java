public class Practice3 {
    public static void main(String [] args){
        int[] marks = {80, 75, 90, 65, 88,99,105,99, 785, 457, 1401};

int highest = marks[0];

for (int mark : marks) {

    if (mark > highest) {
        highest = mark;
    }
}

System.out.println("Highest = " + highest);
    }
}