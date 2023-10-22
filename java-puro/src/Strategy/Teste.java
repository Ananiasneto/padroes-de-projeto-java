package Strategy;

public class Teste {
  public static void main(String[] args) {
    // Strategy

    Comportamento Defensivo = new ComportamentoDefensivo();
    Comportamento Normal = new ComportamentoNormal();
    Comportamento Agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(Normal);
    robo.mover();
    robo.mover();

    robo.setComportamento(Defensivo);
    robo.mover();
    robo.mover();

    robo.setComportamento(Agressivo);
    robo.mover();
    robo.mover();
  }
}
