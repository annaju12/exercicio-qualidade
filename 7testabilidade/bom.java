public class Servico {
    private Banco banco;

    public Servico(Banco banco) {
        this.banco = banco;
    }

    public void executar() {
        banco.salvar();
    }
}