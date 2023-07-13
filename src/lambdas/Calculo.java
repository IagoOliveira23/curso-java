package lambdas;
@FunctionalInterface
public interface Calculo {

    public abstract double executar(double a, double b); //único método abstrato

    //é possível ter método default em interface funcional
    default String metodoDefault(){
        return "Método default na interface funcional";
    }

    //é possível ter método static em interface funcional
    static String metodoStatic(){
        return "Método static na interface funcional";
    }
}
