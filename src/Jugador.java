public class Jugador extends Entidad {
    int experiencia;
    int nivel;

    @Override
    public int turno(int accion) {
        if (accion == 0) {
            return this.getAtaque() * this.nivel;
        } else if (accion == 1) {
            return this.getDefensa() * this.nivel;
        } else {
            return this.getAtaque();
        }
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }
}
