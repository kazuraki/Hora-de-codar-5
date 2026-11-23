public class Gato extends Bicho {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void interagir() {
        System.out.println("🐱 " + getNome() + " se esfrega na sua perna e ronrona: 'Miau...'");
    }

    @Override
    public void habilidadeEspecial() {
        nivelCansaco = limitar(nivelCansaco - 20);
        System.out.println("\n💤 " + getNome() + " tirou uma soneca revigorante num raio de sol. O cansaço diminuiu bastante!");
    }
}