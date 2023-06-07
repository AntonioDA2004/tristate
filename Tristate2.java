/**
 * Tristate2 is a class that manages all the functions related to the Tristate.
 *
 * @author Antonio De Angelis
 * @version 1.1
 */
public class Tristate2 {

    public static void main(String[] args) {

        Number number4 = new Number(4);

        PositivoONegativo(PositivoONegativo(number4));

        Number number0 = new Number(0);

        PositivoONegativo(PositivoONegativo(number0));

        Number numberN99 = new Number(-99);

        PositivoONegativo(PositivoONegativo(numberN99));
    }
    private static final Tristate FALSE = Tristate.FALSE;
    private static final Tristate TRUE = Tristate.TRUE;
    private static final Tristate ZERO = Tristate.ZERO;

    // New implementation with Tristate ATD
    
    public static Tristate PositivoONegativo(Number number){

        Tristate tristate = Tristate.ZERO;

        if(number.getDato() == 0) tristate = Tristate.ZERO;
        else if(number.getDato() > 0) tristate = Tristate.TRUE;
        else if(number.getDato() < 0) tristate = Tristate.FALSE;

        return tristate;
    }

    public static void PositivoONegativo(Tristate tristate) {
        if (tristate.equals(Tristate.ZERO)) System.out.println("Es igual a 0!");
        else if (tristate.equals(Tristate.TRUE)) System.out.println("Es mayor que 0!");
        else if (tristate.equals(Tristate.FALSE)) System.out.println("Es menor que 0!");

    }
}
