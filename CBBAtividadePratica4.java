public class CBBAtividadePratica4 {
    static double PRECO_DO_METRO_CUBICO = 100.0;

    public static double calculaPreco(double largura, double comprimento,double profundidade){
        double cubagem =  largura * comprimento * profundidade;
        return cubagem * PRECO_DO_METRO_CUBICO;
    }

    public static void main(String[] args) {
        double largura = 2.0;
        double comprimento = 3.5;
        double profundidade = 1.8;
        System.out.println("Largura = "+largura);
        System.out.println("Comprimento = "+comprimento);
        System.out.println("Profundidade = "+profundidade);
        double preco = calculaPreco(largura, comprimento, profundidade);
        System.out.println("Preço = "+preco);
    }
}
