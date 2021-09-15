package parte_b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP3Programacion3b {

    public static void main(String[] args) {

        try {
            GestorComputadora gestorComputadora = new GestorComputadora();
            Computadora computadora = new Computadora();
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            List<Componente> componentes = new ArrayList<>();

            System.out.println("===============\nDATOS COMPUTADORA\n===============");
            System.out.println("Código:");
            computadora.setCodigo(sc.next());
            System.out.println("Marca:");
            computadora.setMarca(sc.next());
            System.out.println("Modelo:");
            computadora.setModelo(sc.next());

            while (true) {
                Componente componente = new Componente();
                System.out.println("===============\nDATOS COMPONENTE\n===============");
                System.out.println("Nombre:");
                componente.setNombre(sc.next());
                System.out.println("N° serie:");
                componente.setNroSerie(sc.next());
                componente.setComputadora(computadora);
                componentes.add(componente);

                System.out.println("¿ Desea seguir agregando componentes ? SI/NO");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("SI")) {
                    continue;
                } else {
                    break;
                }

            }
            computadora.setComponentes(componentes);

            gestorComputadora.guardar(computadora);
            computadora.toString();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
