
/** Ejer 4.14
 * Write a description of class Bucles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucles
{
    public static void main (String [] args){
        escribirNumero(10,18);
        mostrarPares (2,50);
        generarAleatorios ();
    }
    
    public static void escribirNumero (int desde, int hasta){   //Ejer 4.14 Interaccion de objetos
        int contador = desde;
        
        while(contador <= hasta){
            System.out.println (contador);
            contador++;
        }
        
}
    
    public static void mostrarPares (int desde, int hasta){
        int contador1 = desde;
        while(contador1<=hasta){
        System.out.println(contador1);
        contador1+=2;
    }
}
    
    public static void generarAleatorios(){
        int contaDoce = 0;
        int contador=1;
        int numero = 0;
        
        while (contador <=30 && numero !=99){
            numero = (int) (Math.random () * 100)+1;
            if (numero ==12){
                contaDoce++;
            }
        }
        System.out.println ("El numero 12 ha salido " + contaDoce + " veces.");
        

}

public double sumarSerie (int n){
    double suma = 0.0;
    for (int contador = 1; contador <= n; contador++){
        if (contador % 2 !=0){
        suma = suma + 1 / contador;
    }
    else{
        suma = suma - 1 /contador;
    }
}
    System.out.println (suma);
    return suma;
}

public int sumaDivisores (int numero){
    int sumaDivisores = 0;
    int valor = 1;
        while (valor <= numero)
        {
    if (numero % valor == 0){
        sumaDivisores +=valor;
        }
        valor++;
    }
    return sumaDivisores;
}

public void escribirFigura (int n){ // Ejer 4.15 Interaccion de objetos 
    int row = 1;
    while (row <= n){
        int col = 1;
        while (col <=n){
        System.out.print(row);
        col++;
    }
    System.out.println();
    row++;
    }
}

public void escribirFigura1 (int n){
    
    int row = 1;
    while (row <= n){
        int col = 1;
        while (col <=row){
        System.out.print(row);
        col++;
    }
    System.out.println();
    row++;
    }
}

public void escribirFigura2 (int n){
    
    int row = 1;
        while (row <= n){
            int col = 1;
            while (col <=row){
                System.out.print(col);
                col++;
            }
    System.out.println();
    row++;
    }
}

public void escribirTablasMultiplicar(int numero) {
    int i = 1;
    while (i <= numero) {
        System.out.println("Tabla de multiplicar del: " + i );
        int j = 1;
        while (j <= 12) {
            int resultado = i * j;
            System.out.println(i + " x " + j + " = " + resultado);
            j++;
        }
        System.out.println();
        i++;
    }
}

public void calcularSumatorios(int cuantos, int limite){
     for (int i = 0; i < cuantos; i++) {
            int numeroAleatorio = (int)(Math.random() * limite ) + 1;
            int sumatorio = 0;
            for (int j = 1; j <= numeroAleatorio; j++) {
                sumatorio += j;
            }

            // Mostrar resultados
            System.out.println("Número aleatorio: " + numeroAleatorio);
            System.out.println("Sumatorio: " + sumatorio);
            System.out.println();
        }
    }
}
        

    
   
        
    

