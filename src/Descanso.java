public class Descanso {
    private int horas;
    private int semanas;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }
    public String getEstado() {
        if (horas / semanas >= 26)
            return "Descansado";
        return "Cansado";
    }
}
