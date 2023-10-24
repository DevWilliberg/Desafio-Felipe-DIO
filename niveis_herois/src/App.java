import java.util.Scanner;


public class App {
  
  
    public static void main(String[] args) {
        

      String nome;
      String nivel="";
      Double xp;

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Qual o nome do Héroi?");
      nome = sc.nextLine();
      
      System.out.println("qual o valor do XP?");
      xp = sc.nextDouble();

      sc.close();
      
      if(xp < 1.100){
          System.out.println( nivel = "FERRO");

        }else   
            if(xp > 1.001 && xp <2.000){

            System.err.println(nivel="BRONZE");  
            } else 
                if(xp >=2.001 && xp < 5.000){
                 System.err.println(   nivel = "PRATA");
                } else
                    if(xp >=6.001 && xp < 7.000){
                      System.err.println( nivel = "OURO");
                    }else
                        if(xp >=7.001 && xp < 8.000){
                          System.err.println(  nivel = "PLATINA");
                        }else
                            if(xp >=8.001 && xp < 9.000){
                             System.err.println( nivel = "ASCENDENTE");
                            }else
                                if(xp >=9.001 && xp < 10.000){
                                   System.err.println(  nivel = "IMORTAL");
                                 }else
                                     if(xp >= 10.001){
                                       System.err.println( nivel= "RADIANTE");
                                     }
     
     System.out.println("O héroi " + nome + " está no nível " + nivel);
  
        
           
                        
    }
}
