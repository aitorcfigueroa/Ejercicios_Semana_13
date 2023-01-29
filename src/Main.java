public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Enemigo enemigo = new Enemigo();
        Entidad [] entidad = new Entidad[2];

        entidad[0] = jugador;
        entidad[1] = enemigo;

        for (int i = 0; i < 10; i++) {
            System.out.println(entidad[0].turno(i));
            System.out.println(entidad[1].turno(i));
        }

        /*
        * En este caso, el uso de la herencia y el polimorfismo nos permitiría
        * la creación de diferentes tipos de jugadores o enemigos, gracias a la herencia,
        * y dotarlos de características propias a cada uno, gracias al polimorfismo,
        * sin la necesidad de reescribir código.
        */
    }
}
