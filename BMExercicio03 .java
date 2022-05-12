class BMExercicio03 {  
  public static void main(String args[]) { 
    float item1 = 2.95f;
    float item2 = 3.50f;
    float soma = item1 + item2;
    float taxaCalculada = soma * 0.00825f;
    float novoCusto = soma + taxaCalculada;
    Boolean muitoCaro = soma > 10;
    System.out.println("O item1 custa R$ " + item1); 
    System.out.println("O item2 custa R$ " + item2);
    System.out.println("A soma dos itens é: R$ " + soma); 
    System.out.println("A taxaCalculada é:  " + taxaCalculada);
    System.out.println("A soma dos itens mais a taxaCalculada é: R$ " + novoCusto); 
    System.out.println("Está fora do orçamento? " + muitoCaro);
  } 
  } 
