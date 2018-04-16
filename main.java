class Zespolona{

    private int rzeczywista1;
    private int rzeczywista2;
    private String urojona; //????

    Zespolona(int x, int y){
        rzeczywista1 = x;
        rzeczywista2 = y;

    }
    public String  toString(){
        return rzeczywista1  + " + j" +rzeczywista2;
    }
    public void ustawRzeczywista1(int nowaRzeczywista1){
        rzeczywista1 = nowaRzeczywista1;
    }
    public void ustawRzeczywista2(int nowaRzeczywista2){
        rzeczywista2 = nowaRzeczywista2;
    }

}

public class Main {

    public static void main(String[] args) {

        Zespolona zespolona1 = new Zespolona(2,2);
        Zespolona zespolona2 = new Zespolona(1,2);

        System.out.println(zespolona1.toString());
        System.out.println(zespolona2.toString());
    }
}