public class StackDinamica {

    private CelulaPilha top;

    public void push(int valor) {
        CelulaPilha novaCelula = new CelulaPilha(valor);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
    }
    public void pop() {
        if (!isEmpty()) {
            System.out.println("Retirando elemento da pilha: " + this.top.getValor());
            this.top = this.top.getAnterior();
        } else {
            System.out.println("Pilha Vazia!!!");
        }
    }
    public boolean isEmpty() {
        return (this.top == null);
    }
    public void imprimir() {
        CelulaPilha p = this.top;
        if (isEmpty()) {
            System.out.println("Pilha Vazia!!!");
        } else {
            while (p != null) {
                System.out.println("Valor na pilha: " + p.getValor());
                p = p.getAnterior();
            }
        }
    }
    public CelulaPilha top() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia!!!");
            return null;
        } else {
            System.out.println("Valor no topo da Pilha: " + top.getValor());
            return this.top;
        }
    }
}
