package ex1;

public class TransporteMaritimo extends Transporte {
    private static final double CUSTO_BASE_POR_CONTAINER = 2000.0;
    private static final double TAXA_ADICIONAL_PESO = 0.05;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete para modalidade Marítima...");
        return CUSTO_BASE_POR_CONTAINER + (peso * TAXA_ADICIONAL_PESO);
    }
}