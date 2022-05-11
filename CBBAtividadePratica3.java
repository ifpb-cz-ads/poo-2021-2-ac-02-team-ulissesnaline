public class CBBAtividadePratica3 {
    public static double areaDoRetangulo(double largura, double comprimento){
        return largura * comprimento;
    }

    public static void main(String[] args) {
        double largura = 2.0;
        double comprimento = 3.5;
        System.out.println("Largura = "+largura);
        System.out.println("Comprimento = "+comprimento);
        double area = areaDoRetangulo(largura, comprimento);
        System.out.println("Área = "+area);
    }
}
