package ProjetoCarro;

public class Carro {
    String modelo, cor, marca, chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    double velocidadeMaxima, velocidadeAtual, volumeCombustivel;
    boolean tetosolar, cambioAtomatico;
    Proprietario proprietario;

    void acelera (){
        velocidadeAtual += 1;
    }
    void freia(){
        velocidadeAtual = 0;
    }
    void trocaMacha(int marchaDesejada){
        marchaAtual = marchaDesejada;
    }
    void reduzMarcha(){
        marchaAtual = marchaAtual - 1;
    }
}
