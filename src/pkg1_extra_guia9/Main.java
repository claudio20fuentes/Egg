/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_extra_guia9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.util.concurrent.TimeUnit.DAYS;
import pkg1_extra_guia9.Entities.Alquiler;
import pkg1_extra_guia9.ServicesAlquiler.ServicesAlquiler;
import static pkg1_extra_guia9.ServicesAlquiler.ServicesAlquiler.read;

/**
 *
 * @author KAZAMA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        LocalDate fAnterior = LocalDate.of(yearA, mesA, diaA);
//        LocalDate fdevolucion = LocalDate.of(yearD, mesD, diaD);
//        long diasOcupacion = ChronoUnit.DAYS.between(fAnterior, fdevolucion);
//
//        
//        
        
       Alquiler alquiler = ServicesAlquiler.crearAlquiler();
       System.out.println(alquiler.toString());
       long totalDias = ServicesAlquiler.calculoDias(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion());
        System.out.println(String.format("Dias de arriendo %d ", totalDias));
//        System.out.println("Ingrese fecha de ingreso");
//        String requestDate = read.next();
//        System.out.println("Ingrese fecha de salida");
//        String requestDate2 = read.next();
//
//    LocalDate myDate = LocalDate.parse(requestDate);
//    LocalDate currentDate = LocalDate.parse(requestDate2);
//
//    long numberOFDays = ChronoUnit.DAYS.between(myDate, currentDate);
//
//    System.out.println(String.format("The diff of days is %d",numberOFDays));






  
        
        

    } 
}
