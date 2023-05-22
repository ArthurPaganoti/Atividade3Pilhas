public class CelulaPilha {
    private int valor;
    private CelulaPilha anterior;

    public CelulaPilha(int valor) {
        this.valor = valor;
        this.anterior = null;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public CelulaPilha getAnterior() {
        return this.anterior;
    }

    public void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }
}