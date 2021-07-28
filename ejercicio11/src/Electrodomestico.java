public class Electrodomestico {

    protected double precio_base;
    protected char consumo_energy;
    protected String color;
    protected double peso;
    

    //constructor por defecto
    public Electrodomestico() {
        this.precio_base =100;
        this.consumo_energy ='F';
        this.color ="blanco";
        this.peso=5;  
    }
    //contrsucto con parametros
    public Electrodomestico(double precio_base, char consumo_energy, String color, double peso) {
        this.precio_base = precio_base;
        this.consumo_energy = comprobarConsumoEnergetico(consumo_energy);
        this.color = comprobarColor(color);
        this.peso = peso;
    }

    //creo los metodos get y set

    public double getPrecio_base() {
        return this.precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public char getConsumo_energy() {
        return this.consumo_energy;
    }

    public void setConsumo_energy(char consumo_energy) {
        this.consumo_energy = consumo_energy;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //creo los metodos de la clase
    public char comprobarConsumoEnergetico(char letra){
        
        if (letra >= 65 && letra<71){
            return letra;
        }else{
            return 'F';
        }
    }

    public String comprobarColor(String color){
        //Los colores disponibles son blanco, negro, rojo, azul y gris.
        String verificacion ="";
        String colores[]={"blanco","negro","rojo","azul","gris"};

        for (int i = 0; i < colores.length; i++) {
            
            if (color.equals(colores[i])) {
                verificacion=color;
                break;
            }else{
                verificacion="blanco";
            }
        }

        return verificacion;
    }

    public double precioFinal(){

        double aumento=0;
        //analizo el caso por el aumento de energia
        switch (consumo_energy) {
            case 'A':
                aumento+=100;
                break;
            case 'B':
                aumento+=80;
                break;
            case 'C':
                aumento+=60;
                break;
            case 'D':
                aumento+=50;
                break;
            case 'E':
                aumento+=30;
                break;
            case 'F':
                aumento+=10;
                break;
        }
        //analizo el caso por el aumento de peso
        if (peso>=0 && peso<=19) {
            aumento+=10;
            
        } else if(peso>=20 && peso<=49) {
            aumento+=50;
            
        } else if(peso>=50 && peso<=79){
            aumento+=80;
        } else if(peso>=80){
            aumento+=100;
        }
        
        return (precio_base+aumento);
    }

    @Override
    public String toString() {
        return "{" +
            " precio_base='" + getPrecio_base() + "'" +
            ", consumo_energy='" + getConsumo_energy() + "'" +
            ", color='" + getColor() + "'" +
            ", peso='" + getPeso() + "'" +
            "}";
    }


}
