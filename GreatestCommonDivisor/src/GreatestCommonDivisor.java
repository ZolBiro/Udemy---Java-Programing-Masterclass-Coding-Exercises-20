public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int number1, int number2){

        if ((number1 <10) || (number2 <10)){
            return -1;
        }

        int divisor1 = 0;
        int divisor2 = 0;

        while ((number1 >= 0) && (number2 >=0)){

            for (int i =number1; i>0; i--) {

                if (number1 % i == 0) {
                    divisor1 = i;
                }


                for (int y = number2; y>0;y--) {
                    if (number2 % y == 0) {
                         divisor2 = y;
                    }


                if (divisor1 == divisor2){
                    return divisor1;
                }
            }


            }

        }

    return -1;
    }
}
