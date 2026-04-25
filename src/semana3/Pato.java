
package semana3;

public abstract class Pato {
    
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    public void setVolable(Volable fb) {
        this.volable = volable;
    }
    
    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = cuaqueable;
    }
    
    public abstract void mostrar();
    public abstract void realizarVuelo();
    public abstract void realizarCuaqueo();
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }
}
