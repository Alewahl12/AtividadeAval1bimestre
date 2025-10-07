package ex1;

public class TransporteFactory {

    public enum Tipo {
        TERRESTRE,
        AEREO,
        MARITIMO
    }

    public static Transporte criarTransporte(Tipo tipo) {
        switch (tipo) {
            case TERRESTRE:
                return new TransporteTerrestre();
            case AEREO:
                return new TransporteAereo();
            case MARITIMO:
                return new TransporteMaritimo();
            default:

                throw new IllegalArgumentException("Tipo de transporte não suportado.");
        }
    }
}