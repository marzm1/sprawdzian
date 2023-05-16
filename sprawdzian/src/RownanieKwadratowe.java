/**

 <klasa obliczająca równanie kwadratowe, tworząca kopie samej siebie>

 a, b, c : int, liczby na których obliczamy równania
 parametryczny : void, jest tam bo pan kazał, nie wiem co ma robić w zadaniu, ani czy jest dobrze napisany
 RownanieKwadratowe : konstruktor, konstruktor tworzący kopie klasy
 oblicz_pierwiastki : double, metoda licząca działania na delcie
 @author: Marcel Żmigrodzki

 **/





import static java.lang.Math.sqrt;

public class RownanieKwadratowe {
    private final int a, b, c;

    void parametryczny(int a, int b, int c){

    }
    public RownanieKwadratowe(RownanieKwadratowe rownanieKwadratowe){
        this.a = rownanieKwadratowe.a;
        this.b = rownanieKwadratowe.b;
        this.c = rownanieKwadratowe.c;
    }
    double oblicz_pierwiastki(){
        double delta = (b*b)-4*(a*c);
        if(delta < 0){
            return 0;
        }
        else if (delta==0) {
            return (-b)/(2*a);
        }
        else if (delta>0) {
            return (-b + sqrt(delta)) / (2 * a);
        }
        return delta;
    }

}
