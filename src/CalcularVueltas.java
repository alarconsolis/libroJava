/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. =2000€
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {


    public static void main ( String[]args){ 
    	// TODO Auto-generated method stub
    float cant=1326.24f; 
    float pago =4*500;
    int contador=0;
    float resto=pago-cant;
    final float dinero[]= {50,20,10,5,2,1,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
    int [] billetes= new int [dinero.length];
    
 
	   for (int j = 0; j < dinero.length; j++) {
		billetes[j] =(int)(resto/dinero[j]);
    	resto=resto - dinero[j]*billetes[j];
    	
    		
    	}
    	System.out.println("---------------");
    	System.out.println("----ticket-----");
    	System.out.println("---------------");
    	System.out.println("entregado: " + pago);
    	System.out.println("cantidad: " + cant);
    	System.out.println("retorno: " + (pago - cant) + "€");
    	System.out.println("---------------");
    	System.out.println(dinero[i]+ " monedas de 1"); 
    	System.out.println("---------------");
			
    		
		
			
		}
    		
			
			
    }
	
    /*while(cant>0){ 
        while(cant-500>=0){ 
            cant=cant-500; 
            dinero[0]++; 
        } 
        while(cant-200>=0){ 
            cant=cant-200; 
            dinero[1]++; 
        } 
        while(cant-100>=0){ 
            cant=cant-100; 
            dinero[2]++; 
        } 
        while(cant-50>=0){ 
            cant=cant-50; 
            dinero[3]++; 
        } 
        while(cant-20>=0){ 
            cant=cant-20; 
            dinero[4]++; 
        } 
        while(cant-10>=0){ 
            cant=cant-10; 
            dinero[5]++; 
        } 
        while(cant-5>=0){ 
            cant=cant-5; 
            dinero[6]++; 
        } 
        while(cant-2>=0){ 
            cant=cant-2; 
            dinero[7]++; 
        } 
        while(cant-1>=0){ 
            cant=cant-1; 
            dinero[8]++; 
        } 
    } 
    for(i=0;i<9;i++){ 
        if(i==0) 
            System.out.println(dinero[i]+ " billetes de 500"); 
            if(i==1) 
                System.out.println(dinero[i]+ " billetes de 200"); 
            if(i==2) 
                System.out.println(dinero[i]+ " billetes de 100"); 
            if(i==3) 
                System.out.println(dinero[i]+ " billetes de 50"); 
            if(i==4) 
                System.out.println(dinero[i]+ " billetes de 20"); 
            if(i==5) 
                System.out.println(dinero[i]+ " billetes de 10"); 
            if(i==6) 
                System.out.println(dinero[i]+ " billetes de 5"); 
            if(i==7) 
                System.out.println(dinero[i]+ " monedas de 2"); 
            if(i==8) 
                System.out.println(dinero[i]+ " monedas de 1"); 
    } 
    } 


/*public static void main(String[] args) {
	
	float coste =1326.24f;
	float [] billetes= {0.1f,0.2f,0.5f,1,2,5,10,20,50};
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


