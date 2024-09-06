// Interface que agrupa todas as funcionalidades
interface IPhone {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que representa o Reprodutor Musical
class ReprodutorMusical implements IPhone {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos não utilizados para Reprodutor Musical
    @Override
    public void ligar(String numero) {}
    @Override
    public void atender() {}
    @Override
    public void iniciarCorreioVoz() {}
    @Override
    public void exibirPagina(String url) {}
    @Override
    public void adicionarNovaAba() {}
    @Override
    public void atualizarPagina() {}
}

// Classe que representa o Aparelho Telefônico
class AparelhoTelefonico implements IPhone {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Métodos não utilizados para Aparelho Telefônico
    @Override
    public void tocar() {}
    @Override
    public void pausar() {}
    @Override
    public void selecionarMusica(String musica) {}
    @Override
    public void exibirPagina(String url) {}
    @Override
    public void adicionarNovaAba() {}
    @Override
    public void atualizarPagina() {}
}

// Classe que representa o Navegador na Internet
class NavegadorInternet implements IPhone {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos não utilizados para Navegador na Internet
    @Override
    public void tocar() {}
    @Override
    public void pausar() {}
    @Override
    public void selecionarMusica(String musica) {}
    @Override
    public void ligar(String numero) {}
    @Override
    public void atender() {}
    @Override
    public void iniciarCorreioVoz() {}
}

// Classe principal com o método main
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        
        // Testando Reprodutor Musical
        reprodutor.tocar();
        reprodutor.selecionarMusica("Minha Música Favorita");
        reprodutor.pausar();

        // Testando Aparelho Telefônico
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        navegador.exibirPagina("https://www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
