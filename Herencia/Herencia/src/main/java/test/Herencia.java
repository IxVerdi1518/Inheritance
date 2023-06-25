package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

public class Herencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(500.0, "Esteban");
        System.out.println("empleado1 = " + empleado1);
        Empleado empleado2 = new Empleado(450.5, "Samantha");
        System.out.println("empleado2 = " + empleado2);
        Cliente cliente1 = new Cliente(new Date(), true, "Esteban", 'M', 22, "Calle x");
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2 = new Cliente(new Date(), true, "Samantha", 'F', 21, "Calle ñan");
        System.out.println("cliente2 = " + cliente2);
    }
}
