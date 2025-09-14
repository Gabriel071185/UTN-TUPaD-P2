/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class TarjetaDeCredito {
    
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public int getNumero(){
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
                   
    @Override
    public String toString() {
        return "\nTarjeta Numero: " + numero + ", Fecha de Vencimiento: " +
                fechaVencimiento;
    }
    
    
}
