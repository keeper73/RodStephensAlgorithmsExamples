package StephensAlgorithms.NumericalAlgorithms;
import java.lang.Math;

public class NumericalAlgorithms {

    public boolean numberIsPrime(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            int i = 3;
            double maxFactor = Math.sqrt(number);
            while (i<=maxFactor){
                if(number % i == 0){
                    return false;
                }else{
                    i = i+2;
                }
            }
        }
        return true;
    }
}

