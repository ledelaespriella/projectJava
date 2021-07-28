import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Cuantos electrodomesticos quiere crear: ");
        int n = Integer.parseInt(input.nextLine());
        
        Electrodomestico listaElectro[]= new Electrodomestico[n];
        //double - char - String - double

        listaElectro[0]= new Electrodomestico(200.0, 'C',"gris",60);
        listaElectro[1]= new Lavadora();
        listaElectro[2]= new Electrodomestico();
        listaElectro[3]= new Electrodomestico(600.0, 'D', "rojo", 20);
        listaElectro[4]= new Lavadora(400.0, 'A', "azul", 100, 15);
        
        double suma_lavadora=0;
        double suma_electro=0;
        for (int i = 0; i < listaElectro.length; i++) {
            System.out.println(listaElectro[i].toString());
            System.out.println("");

            if (listaElectro[i] instanceof Lavadora) {
                suma_lavadora+=listaElectro[i].precioFinal();
            }else{
                suma_electro+=listaElectro[i].precioFinal();
            }
        }

        System.out.printf("La sumatoria de lavadoras es %.2f\nLa sumatoria de electrodomesticos es %.2f",suma_lavadora,suma_electro);




        input.close();

        
        

    }
}
