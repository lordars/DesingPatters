package Strategy;

public class ComportamentoDefensivo implements  Comportamento{
    @Override
    public void mover() {
        System.out.println("moviendo-se Defensivamente...");
    }
}