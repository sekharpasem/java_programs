public class TwoDimeArray {

    public static void main(String[] args) {
        int[][] numbers; // declaration
        numbers = new int[2][2]; // initialization

        //assigning/ storing
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        //System.out.println(numbers);

        //retrieving
        //System.out.println(numbers[0][0] + " "+numbers[0][1]);
        //System.out.println(numbers[1][0]+ " "+numbers[1][1]);

        //iterate over all 2*2 matrix
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if((i==0 && j==0) || (i==1 && j==1)){
                      System.out.println(numbers[i][j]);
                }

                
            }
        }
        //iterate over all rows and first column
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i][0]);
        }

        //copy array
        int[] ages = {24, 25, 26, 27};
        int[] ages_new = new int[4];
        System.arraycopy(ages, 0, ages_new, 0, 2);

        for(int i = 0; i<ages_new.length;i++){
            System.out.println("ages new : "+ages_new[i]);
        }
        
    }
}