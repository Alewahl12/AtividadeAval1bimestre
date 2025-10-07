package ex1;

public class TransporteTerrestre extends Transporte {
    private static final double CUSTO_POR_KM = 2.5;
    private static final double TAXA_POR_PESO = 0.2;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete para modalidade Terrestre...");
        return (distancia * CUSTO_POR_KM) + (peso * TAXA_POR_PESO);
    }
}