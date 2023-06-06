public class Number {

    private int dato;


    public Number(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    // Old implementations with Java
    public int compareNum(int num){
        int result = 0;

        if(this.getDato() > num){
            result = 1;
        } else if(this.getDato() < num) {
            result = -1;
        }

        return result;
    }

    public void compareNumString(int num){
        switch (num) {
            case -1 -> System.out.println("El número es menor.");
            case 0 -> System.out.println("Números iguales.");
            case 1 -> System.out.println("El número es mayor.");
        }
    }
    
    // New implementation with TAD Tristate
    public int PositivoONegativo(){

        Number number0 = new Number(0);

        int resultado = 0;

        if(this.getDato() > number0.getDato()) resultado = 1;
        else if(this.getDato() < number0.getDato()) resultado = -1;

        return resultado;
    }

}
