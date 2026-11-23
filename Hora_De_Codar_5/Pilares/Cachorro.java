public class Cachorro extends Bicho {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void interagir() {
        System.out.println("🐶 " + getNome() + " abana o rabinho e late alegremente: 'Au au!'");
    }

    @Override
    public void habilidadeEspecial() {
        nivelFelicidade = limitar(nivelFelicidade + 15);
        nivelCansaco = limitar(nivelCansaco + 5);
        System.out.println("\n🐾 " + getNome() + " cavou um buraco no quintal e achou um brinquedo antigo! A felicidade aumentou.");
    }
}