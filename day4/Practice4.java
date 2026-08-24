public class Practice4{
    public static void main (String [] args){
        int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

for (int[] row : numbers) {

    for (int value : row) {
        System.out.print(value + " ");
    }

    System.out.println();
}
/* for (int i = 0; i < numbers.length; i++) {

    for (int j = 0; j < numbers[i].length; j++) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
}  */

    }

}