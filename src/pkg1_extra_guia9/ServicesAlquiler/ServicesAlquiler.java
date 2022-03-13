/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_extra_guia9.ServicesAlquiler;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import pkg1_extra_guia9.Entities.Alquiler;

/**
 *
 * @author KAZAMA
 */
public class ServicesAlquiler {

    public void calcularPrecioBaseAlquiler() {

//           Un alquiler se calcula multiplicando el número de días de ocupación (calculado
//          con la fecha de alquiler y devolución), por un valor módulo de cada barco
//          (obtenido simplemente multiplicando por 10 los metros de eslora).
    }

    public static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public static Alquiler crearAlquiler() {                                     //Seteo el objeto alquiler y lo devuelve para ser creado en el main
        
        System.out.println("Ingrese el nombre del cliente");
        String nombre = read.next();
        System.out.println("Ingrese el rut del cliente");
        String rut = read.next();
        System.out.println("Ingrese fecha de ingreso");
        String fechaAlquiler = read.next();
        System.out.println("Ingrese fecha de salida");
        String fechaDevolucion = read.next();
        System.out.println("Ingrese posicion de amarre");
        Integer posicion = read.nextInt();
        
        return new Alquiler(nombre,rut,fechaAlquiler,fechaDevolucion,posicion,null);
    }

    public static long calculoDias(String fechaAlquiler, String fechaDevolucion) { //metodo que calcula la cantidad de dias del alquiler.

        
        
        
        LocalDate myDate = LocalDate.parse(fechaAlquiler);
        LocalDate myDate2 = LocalDate.parse(fechaDevolucion);

        long totalDias = ChronoUnit.DAYS.between(myDate, myDate2);

        

        return totalDias;

    }

}
