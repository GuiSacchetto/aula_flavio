public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class Main
{
	public static void main(String[] args) {
	   double altura,beeleza, carisma;
	   Scanner ler = new Scanner(System.in);
	
	   System.out.println("Digite sua altura de 0 a 10");
	   altura = ler.nextDouble();
	   
	   System.out.println("Digite sua beleza de 0 a 10");
	   beleza = ler.nextDouble();
	   
	   System.out.println("Digite sua carisma de 0 a 10");
	   carisma = ler.nextDouble();
	   
	   if (altura, beleza, carisma>7) {
	       
	   System.out.println("Boraaaaaa");    
	   }
	   
	   if (altura>7 & beleza>7 & carisma<7) {
	       
	   System.out.println("Boraaaaaa");
	   }
	   
	   if (altura<7 & beleza>7 & carisma>7) {
	       
	   System.out.println("Boraaaaaa");
	   }
	   
	   if (altura>7 & beleza<7 & carisma>7) {
	       
	   System.out.println("Boraaaaaa");
	   }

       ---------------

       import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double nota, frequencia;
	    Scanner ler = new Scanner(System.in);
	
	    System.out.println("Digite a sua nota");
	    nota = ler.nextDouble();
	    
	    System.out.println("Digite a sua frequencia");
	    frequencia = ler.nextDouble();
	    
	    if (nota>=7 & frequencia>0.75) {
	        
	    System.out.println("O aluno está aprovado");
	    } else if (nota>8 || frequencia>=0.9) {
	    
	
	    }else{
	        
	       System.out.println("O aluno está reprovado");
	        
	    }
		
	}


		-------------------------


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int numero;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o numero");
	numero= ler.nextInt();
	for(int i = 0; i < 30; ++i) {
	    numero=numero+1;
	}
	System.out.println("Digite seu numero com adicao de 1 unidade 30 vezes:"+ numero);
	    ----------------------
			
import java.util.Scanner;
public class Main {
                 
	public static void main(String[] args) {
	    String participante;
	    double pontos=0, resultado=0;
	    int luta;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Digite seu participante");
	    participante = ler.next();
	    for (int i=1;i<=30;i++) {
	        
	   System.out.println("Digite o resultado da luta"+i);
	   luta = ler.nextInt();
	   switch(luta) {
	       
	       case 4:
	       System.out.println("Derrota");
	       pontos=-10;
	       break;
	       
	       case 3:
	       System.out.println("Double KO");
	       pontos=20;
	       break;
	       
	       case 2:
	       System.out.println("Vitoria");
	       pontos=50;
	       break;
	       
	       case 1:
	       System.out.println("Perfect");
	       pontos=100;
	       break;
	       
	    }
	    
	    resultado=resultado+pontos;
	    
	   }
	System.out.println("Campeonato: "+resultado);
	
	}
	
}

------------------------------------

	import java.util.Scanner;
public class Main {
                 
	public static void main(String[] args) {
	    String vencedor;
	    double pontos=0,resultado=0;
	    int kills=0,deaths=0,assists=0,killst=0,deathst=0,assistst=0;
	    Scanner ler = new Scanner(System.in);
	    vencedor="n";
	    
	    while (vencedor.equals("n")){
	        System.out.println("Numero de Kills: ");
	        kills = ler.nextInt();
	        killst=killst+kills;
	        
	        System.out.println("Numero de Deaths: ");
	        deaths = ler.nextInt();
	        deathst=deathst+deaths;
	        
	        System.out.println("Numero de assists: ");
	        assists = ler.nextInt();
	        assistst=assistst+assists;
	        
	        if(killst<=5) {System.out.println("Noob") ; }
	        if(killst>=20) {System.out.println("Master") ; }
	        if(deathst>=20) {System.out.println("Houston, we have a problem") ; }
	        if(assistst>=20) {System.out.println("Team work") ; }
	        
	        System.out.println("Ha um vencedor??? ");
	        vencedor = ler.next();

	    }
	    
	        
	        
	}       
	        
}
			
	
