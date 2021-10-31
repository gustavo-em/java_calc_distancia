package ponto;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        double x = 0;
        double y = 0;
        this.x = x;
        this.y = y;
    }

    public Boolean verificarIgualdade(double x, double y) {
        if (this.x == x && this.y == y) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularDistanciaEntreDoisPontos(double x, double y) {
        double distancia;
        distancia = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distancia;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
