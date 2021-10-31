import ponto.Ponto;

public class App {
    public static void main(String[] args) throws Exception {

        Ponto p1 = new Ponto();

        Ponto p2 = new Ponto(200, 52);

        if (p1.verificarIgualdade(p2.getX(), p2.getY())) {
            System.out.println("Os dos pontos são iguais");
        } else {
            System.out.println("Os dos pontos são diferentes");
        }

        double distancia = p1.calcularDistanciaEntreDoisPontos(p2.getX(), p2.getY());
        String distancia_pontos = String.format("%.2f", distancia);
        System.out.println("A distancia entre os pontos é: " + distancia_pontos);
    }
}
