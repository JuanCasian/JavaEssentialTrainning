import java.util.Random;

public class MonteCarloSimulation {

    public static void main(String[] args) {
        double res;

        res = monteCarloSim(10000000);
        System.out.println("The success rate is: " + res + " %.");
    }

    public static double monteCarloSim(int nTries) {
        MarbleColor bag[];
        MarbleColor results[];
        double      success;
        double      attemps;
        int         i;
        Random      r = new Random();
        int         marble;

        bag = new MarbleColor[6];
        results = new MarbleColor[3];
        success = 0.0;
        attemps = 0.0;

        while (attemps < nTries){
            i = 0;
            for (int j = 0; j < 3; j++) {
                bag[j] = MarbleColor.BLUE;
                results[j] = MarbleColor.UNDEF;
            }
            for (int j = 3; j < 6; j++) {
                bag[j] = MarbleColor.WHITE;
            }
            while (i < 3){
                marble = r.nextInt(5);
                if (bag[marble] != MarbleColor.USED){
                    results[i] = bag[marble];
                    bag[marble] = MarbleColor.USED;
                    i++;
                }
            }
            if (results[0] == results[1] && results[1] == results[2]){
                success++;
            }
            attemps++;
        }
        return (success/attemps * 100);

    }
}
