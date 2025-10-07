package ex1;

public class DemoLogistica {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Cálculo de Fretes ---");

        // Cenário 1: Transporte rodoviário.
        Transporte freteTerrestre = TransporteFactory.criarTransporte(TransporteFactory.Tipo.TERRESTRE);
        double custo1 = freteTerrestre.calcularFrete(500, 20); // 500 km, 20 kg
        System.out.printf("Custo final: R$ %.2f\n\n", custo1);

        // Cenário 2: Transporte aéreo.
        Transporte freteAereo = TransporteFactory.criarTransporte(TransporteFactory.Tipo.AEREO);
        double custo2 = freteAereo.calcularFrete(3000, 150); // 3000 km, 150 kg
        System.out.printf("Custo final: R$ %.2f\n\n", custo2);

        // Cenário 3: Transporte marítimo.
        Transporte freteMaritimo = TransporteFactory.criarTransporte(TransporteFactory.Tipo.MARITIMO);
        double custo3 = freteMaritimo.calcularFrete(10000, 5000); // 10000 km, 5000 kg
        System.out.printf("Custo final: R$ %.2f\n\n", custo3);
    }
}
