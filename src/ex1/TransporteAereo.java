package ex1;

public class TransporteAereo extends Transporte {
    private static final double CUSTO_POR_KG = 15.0;
    private static final double TAXA_BASE_AEROPORTUARIA = 300.0;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete para modalidade Aérea...");
        return (peso * CUSTO_POR_KG) + TAXA_BASE_AEROPORTUARIA;
    }
}