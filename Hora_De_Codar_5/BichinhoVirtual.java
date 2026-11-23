public class BichinhoVirtual {

    public String nome;
    public int nivelDeFome = 50;
    public int nivelFelicidade = 50;
    public int nivelCansaco = 0;
    public int idade = 0;

    // O nome do construtor deve ser exatamente igual ao nome da classe
    public BichinhoVirtual(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome = limitar(nivelDeFome - 10);
        System.out.println("\n🍖 " + this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade = limitar(nivelFelicidade + 10);
        nivelCansaco = limitar(nivelCansaco + 10);
        System.out.println("\n🎾 " + this.nome + " está brincando e se sentindo mais feliz, mas ficou mais cansado.");
    }

    public void descansar() {
        nivelCansaco = limitar(nivelCansaco - 40);
        System.out.println("\n😴 " + this.nome + " descansou. O nível de cansaço diminuiu.");
    }

    public void verificarStatus() {
        System.out.println("\n========= STATUS DE " + this.nome.toUpperCase() + " =========");
        System.out.println("🎂 Idade: " + this.idade + " / 50");
        System.out.println("🍔 Nível de fome: " + this.nivelDeFome + " / 100");
        System.out.println("😊 Nível de felicidade: " + this.nivelFelicidade + " / 100");
        System.out.println("🔋 Nível de cansaço: " + this.nivelCansaco + " / 100");
        System.out.println("==========================================");
    }

    public void passarTempo() {
        nivelDeFome = limitar(nivelDeFome + 3);
        nivelFelicidade = limitar(nivelFelicidade - 3);
        nivelCansaco = limitar(nivelCansaco + 10);
        idade = idade + 1;
    }

    private int limitar(int valor) {
        if (valor < 0) {
            return 0;
        }
        if (valor > 100) {
            return 100;
        }
        return valor;
    }
}