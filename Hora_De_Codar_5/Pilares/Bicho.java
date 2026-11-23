public abstract class Bicho {
    private String nome;
    protected int nivelDeFome = 50;
    protected int nivelFelicidade = 50;
    protected int nivelCansaco = 0;
    protected int idade = 0;

    public Bicho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void alimentar() {
        nivelDeFome = limitar(nivelDeFome - 10);
        System.out.println("\n🍖 " + nome + " foi alimentado. A fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade = limitar(nivelFelicidade + 10);
        nivelCansaco = limitar(nivelCansaco + 10);
        System.out.println("\n🎾 Você brincou com " + nome + ". Ele ficou mais feliz, mas cansado.");
    }

    public void verificarStatus() {
        System.out.println("\n========= STATUS DE " + nome.toUpperCase() + " =========");
        System.out.println("🎂 Idade: " + idade + " / 50");
        System.out.println("🍔 Nível de fome: " + nivelDeFome + " / 100");
        System.out.println("😊 Nível de felicidade: " + nivelFelicidade + " / 100");
        System.out.println("🔋 Nível de cansaço: " + nivelCansaco + " / 100");
        System.out.println("==========================================");
    }

    public void passarTempo() {
        nivelDeFome = limitar(nivelDeFome + 3);
        nivelFelicidade = limitar(nivelFelicidade - 3);
        nivelCansaco = limitar(nivelCansaco + 10);
        idade = idade + 1;
    }

    protected int limitar(int valor) {
        if (valor < 0) return 0;
        if (valor > 100) return 100;
        return valor;
    }

    // Métodos abstratos que as classes filhas são obrigadas a implementar (Polimorfismo)
    public abstract void interagir();
    public abstract void habilidadeEspecial();
}