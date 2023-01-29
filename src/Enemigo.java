public class Enemigo extends Entidad {
    int dificultad;

    @Override
    public int turno(int accion) {
        if (accion == 0) {
            return this.getAtaque() * this.dificultad;
        } else if (accion == 1) {
            return this.getDefensa() * this.dificultad;
        } else {
            return this.getDefensa();
        }
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getDificultad() {
        return dificultad;
    }
}
