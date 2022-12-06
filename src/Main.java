public class Main {
    public static void main(String[] args) {

        Persona humano1 = new Persona();
        humano1.setNombre("Axel");
        humano1.setApellido("Sanchez");

        Persona humano2 = new Persona();
        humano2.setNombre("Alan");
        humano2.setApellido("Peralta");

        Persona humano3 = new Persona();
        humano3.setNombre("Omar");
        humano3.setApellido("Hernandez");

        Persona humano4 = new Persona();
        humano4.setNombre("Paola");
        humano4.setApellido("Moreno");

        Persona humano5 = new Persona();
        humano5.setNombre("Ivan");
        humano5.setApellido("Martinez");

        Persona[] Personas = {humano1, humano2, humano3, humano4, humano5};

        ordenarPorNombre(Personas);

        ordenarPorApellido(Personas);

        ordenarInversamentePorApellido(Personas);

    }

    static void ordenarPorNombre(Persona[] Personas) {
        for(int i = 0; i < Personas.length; i++) {
            for(int j = i + 1; j < Personas.length; j++){
                if(Personas[i].getNombre().compareTo(Personas[j].getNombre()) > 0) {
                    Persona temp = Personas[i];
                    Personas[i] = Personas[j];
                    Personas[j] = temp;
                }
            }
        }
        System.out.println("Ordenado por nombre:");
        for(int i = 0; i < Personas.length; i++) {
            System.out.println(Personas[i].getNombre() + " " + Personas[i].getApellido());
        }
        System.out.println(" ");
    }

    static void ordenarPorApellido(Persona[] Personas) {
        for(int i = 0; i < Personas.length; i++) {
            for(int j = i + 1; j < Personas.length; j++){
                if(Personas[i].getApellido().compareTo(Personas[j].getApellido()) > 0) {
                    Persona temp = Personas[i];
                    Personas[i] = Personas[j];
                    Personas[j] = temp;
                }
            }
        }
        System.out.println("Ordenado por apellido:");
        for(int i = 0; i < Personas.length; i++) {
            System.out.println(Personas[i].getNombre() + " " + Personas[i].getApellido());
        }
        System.out.println(" ");
    }

    static void ordenarInversamentePorApellido(Persona[] Personas) {
        for(int i = 0; i < Personas.length; i++) {
            for(int j = i + 1; j < Personas.length; j++){
                if(Personas[i].getApellido().compareTo(Personas[j].getApellido()) > 0) {
                    Persona temp = Personas[i];
                    Personas[i] = Personas[j];
                    Personas[j] = temp;
                }
            }
        }
        System.out.println("Ordenado inversamente por apellido:");
        for(int i = (Personas.length - 1); i >= 0; i--) {
            System.out.println(Personas[i].getNombre() + " " + Personas[i].getApellido());
        }
        System.out.println(" ");
    }

}