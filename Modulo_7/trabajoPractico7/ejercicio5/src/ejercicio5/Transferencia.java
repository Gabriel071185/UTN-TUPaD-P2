/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

public class Transferencia implements Pagable {
    private String cuentaDestino;
    
    public Transferencia(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    
    @Override
    public void pagar() {
        System.out.println("Realizando transferencia a cuenta: " + cuentaDestino);
        System.out.println("Transferencia procesada exitosamente");
    }
}
