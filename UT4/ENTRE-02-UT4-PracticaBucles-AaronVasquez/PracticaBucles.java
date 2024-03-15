import java.util.Random;
/**
 *    Aaron Vasquez 1ºB DAM PROGRAMACION
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles(){
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 espacios en la pantalla  
     *  y al lado de cada nº se muestra otro nº despues de una " , " con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 espacios)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n){
       //TODO
        Random generador = new Random();
        
        int contador = 0;
        int sumaImpares = 0;
        int maxPares = 0;
        int sumaTotal = 0;
        
        while (contador < n) {
            int numero = generador.nextInt(6001) - 1000;
            int numeroSinCeros = Integer.parseInt(Integer.toString(numero).replaceAll("0", ""));  //Esta forma la saque de internet, la vi muy util.
            System.out.print(String.format("%12d, ", numero));
            System.out.print(String.format("%5d", numeroSinCeros));
            sumaTotal += numero;
            
            if (numero % 2 != 0) {
                sumaImpares += numero;
            }
            
            if (numero % 2 == 0 && numero > maxPares) {
                maxPares = numero;
            }
            
            if ((contador + 1) % 5 == 0) {
                System.out.println();
            }
            
            if (numero == 0) {
                break;
            }
            
            contador++;
        }
        
        int promedio = sumaTotal / contador;
        System.out.println("\nMedia de todos los números: " + promedio);
        System.out.println("Suma de los impares: " + sumaImpares);
        System.out.println("Máximo de los pares: " + maxPares);
        
    }
    
    /**
     *  Devuelve el número de letras que aparecen en palabra (la cantidad de veces que aparece la misma letra en la palabra)
    */
    public int numLetras(char letra, String palabra)   {
        // Usando lenght para ver la longitud de la palabra, y luego charAT con la variable i para que vaya pasando por todas las letras de la palabra
        // Cuando halle la letra que le hemos dado pues aumentara la variable contador +1
        
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
    }
    return contador;
}

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        // Lo tenia hecho de el metodo de arriba
        
        int numeroSinCeros = Integer.parseInt(Integer.toString(numero).replaceAll("0", ""));
        return numeroSinCeros;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');  // Gracias
    }

    
    // El método estaDentrodePalabra indica si una letra se encuentra
    // en palabra.
    
    public boolean estaDentrodePalabra(char letra, String palabra){
        // Muy parecido al metodo numLetras
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }
    
    
    // El método fibonacci devuelve el indice n de la serie de Fibonacci.
    // Información sobre la serie de Fibonacci:
    // https://www.educ.ar/recursos/132013/la-matematica-incrustada-en-la-inmensa-variedad-de-formas-de-vida    
    
    public int fibonacci(int n){
    // Es bastante liante pero pude comprobar que va bien, si le metes un nº demasiado grande te dara numeros negativos
    // Diria que es por que el lugar donde te lo muestra no puede abarcar tantos numeros
    
    if (n <= 1) {
        return n;
    } else {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int sumaab = a + b;
            a = b;
            b = sumaab;
        }
        return b;
    }
}
    
    //El método numerosDivisibles indica el número de cifras entre 1 y limite que son divisibles entre divisor
    public int numerosDivisibles(int divisor, int limite){
        // Hacemos un contador que ponga un ++ cada vez que entre en bucle del if, el contador ira cambiando la condicion y cada vez que sea divisor aumentara +1 count
        
        int count = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }
    
    // El método numerosDivisibles2 es igual que el anterior pero, si en numerosDivisibles se ha utilizado un for, en este
    // método se utilizará un while o viceversa.
    public int numerosDivisibles2(int divisor, int limite){
        // Lo mismo que la anterior pero con while
        
        int count = 0;
        int i = 1;
        while (i <= limite) {
            if (i % divisor == 0) {
                count++;
            }
            i++;
        }
        return count;
    }    
    
    // El método numeroDivisoresMayorTres devuelve true si numero tiene más de 3 divisores.
    // En caso contrario devolverá false.
    
    public boolean numeroDivisoresMayorTres(int numero){
        // Creamos for y metemos la variable del contador y el ++ luego le decimos que vaya cambiando el divisor y cada vez que entre en el if aumentara 1 contadorDivisores
        // Al return le digo que sea mayor, es decir tendra que haber almenos 4 divisores para que de true
        
        int contadorDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }
        return contadorDivisores > 3;
    }
    
    // El método numeroDivisoresMayorTres2 es igual que el anterior, pero si en numeroDivisoresMayorTres
    // se ha utilizado un while, en este caso se utilizará un for o viceversa.
    public boolean numeroDivisoresMayorTres2(int numero){
        // Sensillo y para toda la familia, simplemente sacamos el contador y el ++ fuera del bucle y hacemos lo mismo que el anterior
        
        int contadorDivisores = 0;
        int i = 1;
        while (i <= numero) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
            i++;
        }
        return contadorDivisores > 3;
    }
    
}
