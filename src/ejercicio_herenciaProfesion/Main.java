package ejercicio_herenciaProfesion;

public class Main {
    public static void main(String[] args){
        //crear profesion
        Profesion Pedro = new Ingeniero();
        Pedro.calcularSueldo();
        Profesion Sandra = new Arquitecto();
        Sandra.calcularSueldo();
        Profesion Sebastian = new Medico();
        Sebastian.calcularSueldo();

        System.out.println("el sueldo del ingeniero: $" + Pedro.calcularSueldo());
        System.out.println("el sueldo del arquitecto: $" + Sandra.calcularSueldo());
        System.out.println("el sueldo del medico: $" + Sebastian.calcularSueldo());
    }
}
