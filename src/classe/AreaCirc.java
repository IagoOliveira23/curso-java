package classe;

public class AreaCirc {
    
    double raio;
    final static double PI = 3.14;

    AreaCirc(double radioInicial){
        raio = radioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }
}
