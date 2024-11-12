package com.aluracursos.screenmatchfrases.principal;

import com.aluracursos.screenmatchfrases.models.DatosFrase;
import com.aluracursos.screenmatchfrases.models.Frase;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import com.aluracursos.screenmatchfrases.services.ConsumoAPI;
import com.aluracursos.screenmatchfrases.services.ConvierteDatos;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    ConvierteDatos convierteDatos = new ConvierteDatos();
    ConsumoAPI consumoAPI = new ConsumoAPI();
    private FraseRepository repository;

    public Principal(FraseRepository repository) {
        this.repository = repository;
    }

    public void nuevaFraseDePelicula() throws IOException, InterruptedException {

        var activo = -1;
        while (activo != 0){
            System.out.println("Por favor, escribe una nueva frase: ");
            String nuevaFrase = teclado.nextLine();



            System.out.println("Por favor, escribe a que pelicula pertenece: ");
            String pelicula = teclado.nextLine();

            System.out.println("Dime el autor de la frase: ");
            String autor = teclado.nextLine();
            var json = consumoAPI.obtenerDatosPelicula(pelicula);

            var datosFinales = convierteDatos.obtenerDatos(json, DatosFrase.class);

            Frase frase = new Frase(nuevaFrase, autor, datosFinales);

            repository.save(frase);

            System.out.println("Estos son los datos finales: \n" + frase);

            System.out.println("""
                    Deseas agregar otra frase?
                    
                    1 - Si
                    2 - No
                    """);

            Integer opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    activo = 0;
                    break;
                default:
                    activo = 0;
                    System.out.println("Lo siento, opcion incorrecta. El programa se cerrara.");
                    break;
            }
        }


    }


}
