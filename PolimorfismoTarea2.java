/*
 * Diseñe e implemente un algoritmo que le permita representar el polimorfismo 
con sobrecarga de métodos, con la clase llamada CalculoEmision e imprima el 
calculo de emisión los gases Monóxido de Oxigeno y Monóxido de Nitrógeno
 */
package polimorfismotarea2;

/**
 *
 * @author Anita Pico Solis
 */

class CalculoEmision{
  int CalcularEmisionGasMonoxidoOxigeno(int CargaMotor, int MezclaBiodieselHiguerilla){
  return CargaMotor*MezclaBiodieselHiguerilla;
  }
 double CalcularEmisionGasMonoxidoOxigeno(double CargaMotor, double MezclaBiodieselHiguerilla){
  return CargaMotor*MezclaBiodieselHiguerilla;
 }
  int CalcularEmisionGasMonoxidoNitrogeno(int CargaMotor, int MezclaBiodieselHiguerilla){
  return CargaMotor/MezclaBiodieselHiguerilla;
  }
  double CalcularEmisionGasMonoxidoNitrogeno(double CargaMotor, double MezclaBiodieselHiguerilla){
  return CargaMotor/MezclaBiodieselHiguerilla;
  }
}


public class PolimorfismoTarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculoEmision MonoxidoOxigeno1=new CalculoEmision();
        CalculoEmision MonoxidoOxigeno2=new CalculoEmision();
        
        CalculoEmision MonoxidoNitrogeno1=new CalculoEmision();
        CalculoEmision MonoxidoNitrogeno2=new CalculoEmision();
        
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");    
        System.out.println("***********************************************************"); 
        System.out.println("      Polimorfismo - Sobrecarga de Métodos ");   
        System.out.println("************************************************************");
        
  
        int resultado1;
        MonoxidoOxigeno1.CalcularEmisionGasMonoxidoOxigeno(28,19);
        resultado1=MonoxidoOxigeno1.CalcularEmisionGasMonoxidoOxigeno(28,19);
        System.out.println("La emision del Monóxido de Oxigeno 1 es: " +resultado1);
        
        double resultado2;
        MonoxidoNitrogeno2.CalcularEmisionGasMonoxidoOxigeno(14.48, 27.6);
        resultado2=MonoxidoOxigeno2.CalcularEmisionGasMonoxidoOxigeno(14.48, 27.6);
        System.out.println("La emisión del Monóxido de Oxigeno 2 es: " +resultado2);
        
        int resultado3;
        MonoxidoNitrogeno1.CalcularEmisionGasMonoxidoNitrogeno(114,15);
        resultado3=MonoxidoNitrogeno1.CalcularEmisionGasMonoxidoNitrogeno(114,15);
        System.out.println("La emisión del Monóxido de Nitógeno 1 es: "+resultado3);
        
        double resultado4;
        MonoxidoNitrogeno2.CalcularEmisionGasMonoxidoNitrogeno(67.8, 53.84);
        resultado4= MonoxidoNitrogeno2.CalcularEmisionGasMonoxidoNitrogeno(67.8,53.84);
        System.out.println("La emsión del Monóxido de Nitógeno 2 es: "+resultado4);
    }
    
}
