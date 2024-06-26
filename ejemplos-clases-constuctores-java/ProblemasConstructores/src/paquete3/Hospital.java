package paquete3;

public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital() {
        nombre = "na";
        ciudad = "ciu";
        numeroDoctores = 100;
        numeroEnfermeros = 400;
    }

    public Hospital(String n, String ciu, int doctores, int enfermeros) {

        nombre = n;
        ciudad = ciu;
        numeroDoctores = doctores;
        numeroEnfermeros = enfermeros;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
        /*
        Dentro del String.format, es posible utilizar los metodos y atributos
        independientemente de que sean privados o protegidos, ya que estan 
        dentro de la misma clase; y se imprimira lo mismo
        */

        String cadena = String.format("Nombre: %s\nCiudad: %s\n"
                + "Numero de Doctores: %d\nNumero de Enfermeros:%d\n",
                obtenerNombre(),
                ciudad, obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadena;
    }

}
