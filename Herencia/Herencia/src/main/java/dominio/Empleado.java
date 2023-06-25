package dominio;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //el static es la asignacion de la variable en toda la clase y no solo en cada funcion

    public Empleado() {
        //super() aqui implicitamente va al constructuro de persona para ejecutar lo del nombre -- ESTO SE LLAMA SOBRECARGA DE CONSTRUCTORES
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(double sueldo, String nombre) {
        this();//este manda al constructor vacio ojo con el this y los parentesis
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append("{").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
