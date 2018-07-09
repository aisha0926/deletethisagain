import java.util.ArrayList;
import java.util.Random;


public class PeriodicTable {

    /*
        1. All chemical symbols must be exactly two letters, so O is not a valid symbol for Oxygen
        2. Both letters in the symbol must appear in the element name, but the first letter of the element name does not
            necessarily need to appear in the symbol. So Hg is not valid for Mercury, but Cy is.
        3. The two letters must appear in order in the element name. So Vr is valid for Silver, but Rv is not. To be clear,
            both Ma and Am are valid for Magnesium, because there is both an a that appears after an m, and an m that
            appears after an a.
        4. If the two letters in the symbol are the same, it must appear twice in the element name.
            So that Nn is valid for Xenon, but Xx and Oo are not.

            Your task is to determine whether a proposed chemical symbol fits these rules.
     */


    public static void main(String[] args) {

    }

    public static void chem1(String a, String b){
        Random ran = new Random();
        ArrayList<String> periodic = new ArrayList<String>();
        periodic.add("");

        int rnd = ran.nextInt(periodic.size());
    }
}
