
public class Lavadora extends Electrodomestico {

    private double carga;

    //constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
    }
    //constructor con parametros
    public Lavadora(double precio_base, char consumo_energy, String color, double peso,double carga) {
        super(precio_base, consumo_energy, color, peso);
        this.carga = carga;
    }

    //metodos get y set

    public double getCarga() {
        return this.carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    //metodo de la calse lavadora
    public double precioFinal(){

        double aumento = super.precioFinal();
        if (carga>30) {
            aumento+=50;
        }
        return aumento;
    }


    @Override
    public String toString() {
        return super.toString()+
            " carga='" + getCarga() + "'" +
            "}";
    }




    
}
