public class Persona {

        private int edad; 
        private String nombre;
        private String telefono;
        
        public Persona(int edad, String nombre, String telefono) 
        {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }



        public void setEdad(int edad)
        {
            this.edad = edad;
        }
        
        public int getEdad()
        {
            return edad;
        }



        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        
        public String getNombre()
        {
            return nombre;
        }

        public void setTelefono(String telefono)
        {
            this.telefono = telefono;
        }
        
        public String getTelefono()
        {
            return telefono;
        }


        public static void main(String[] args) {
        
            Persona adulto = new Persona(40,"Sebastian Giacobone","2994234341"); // Construido el elemento, vamos a modificarlo con sets, y presentarlo con gets
                  
            
            // Imprimo los originales
            System.out.println("Edad: " + adulto.getEdad());
            System.out.println("Nombre: " + adulto.getNombre());
            System.out.println("Teléfono: " + adulto.getTelefono());

            //Los modifico
            adulto.setEdad(41);
            adulto.setNombre("Eduardo Sebastian Giacobone");
            adulto.setTelefono("+542994234341");

            //imprimo las correcciones

            System.out.println("Edad: " + adulto.getEdad());
            System.out.println("Nombre: " + adulto.getNombre());
            System.out.println("Teléfono: " + adulto.getTelefono());




           
           
            
        }
    }

    
   


