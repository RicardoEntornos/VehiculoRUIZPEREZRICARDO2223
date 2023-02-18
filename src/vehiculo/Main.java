
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRUIZPEREZRICARDO2223 miVehiculoRUIZPEREZRICARDO2223;
        int stockActual;
        
        miVehiculoRUIZPEREZRICARDO2223 = new VehiculoRUIZPEREZRICARDO2223("Seat",18000,100);
        operativaVehiculosRUIZPEREZRICARDO2223(miVehiculoRUIZPEREZRICARDO2223, 50); 
        stockActual = miVehiculoRUIZPEREZRICARDO2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosRUIZPEREZRICARDO2223(VehiculoRUIZPEREZRICARDO2223 miVehiculoRUIZPEREZRICARDO2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRUIZPEREZRICARDO2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRUIZPEREZRICARDO2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
