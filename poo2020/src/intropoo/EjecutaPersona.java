package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        //creacion de objeto
        Persona persona = new Persona("masculino", "catolica",18,"Anthonny");
        System.out.println(persona.getNombre());
        System.out.println("edad :"+persona.getEdad());
        System.out.println("religion: "+persona.getReligion());
        System.out.println("genero: "+persona.getNombre());

        //creacion ed persona 2 con objeto
        Persona persona2 = new Persona("Masculino", "Catolico", 15);
        Persona persona3 = new Persona("Femenino","Catolico",49);
        System.out.println("Edad persona 2: "+persona2.getEdad());
        System.out.println("Edad persona 3: "+persona3.getEdad());
        System.out.println("Nombre persona 2: "+persona2.getNombre());

    }
}
