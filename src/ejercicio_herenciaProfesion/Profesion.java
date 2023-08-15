package ejercicio_herenciaProfesion;

public class Profesion {
    private Long Sueldo;
    private  Long Bono;

    public Profesion(){
        this.Sueldo = 2000000L;
        this.Bono = 0L;
    }
    public Profesion(Long Bono){
        this.Sueldo = 2000000L;
        this.Bono = Bono;
    }


    public Long getBono() {
        return Bono;
    }
    public void setBono(Long bono) {
        this.Bono = bono;
    }
    public long calcularSueldo(){
        return Sueldo + Bono;
    }

}
