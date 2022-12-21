public class EjercicioClases {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Marisco";
        cliente.edad = 15;
        cliente.telefono = 123123;
        cliente.credito = 99999;

        System.out.println("nombre: "+ cliente.nombre);
        System.out.println("edad: "+ cliente.edad);
        System.out.println("tel: "+ cliente.telefono);
        System.out.println("credito: "+ cliente.credito);


        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Christian";
        trabajador.edad = 26;
        trabajador.telefono = 819273;
        trabajador.salario = 1000000;

        System.out.println("nombre: "+ trabajador.nombre);
        System.out.println("edad: "+ trabajador.edad);
        System.out.println("tel: "+ trabajador.telefono);
        System.out.println("salario: "+ trabajador.salario);
    }
}
    class Persona{
        int edad;
        String nombre;
        int telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }

    class Cliente extends Persona{
        int credito;

        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }
    }

    class Trabajador extends Persona{
        int salario;
    }