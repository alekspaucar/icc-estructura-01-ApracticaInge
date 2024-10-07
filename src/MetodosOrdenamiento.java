import java.util.Arrays;
public class MetodosOrdenamiento {
    // Método de burbuja tradicional (1) con errores
    // Error encontrado fue : return new int[] {} , porque retorna un valor entero sin nada...
    // la solucion es: retornar un valor y ese valor es el arreglo inicialmente... 

    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional (2)con errores
    // Error encontrado:  if (arreglo[i] < arreglo[j]) { ,el signo mayor y menor que estaba mal ya que no era hacia esa direccion
    // la solucion es: invertir el signo menor que a mayor que  
    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional (3) con errores
    // Error encontrado:  for (int j = 0; j < n; j++) { , el valor hasta de for debe restarse uno 
    // la solucion seria: corregir (j < n) y aumentar el -1 asi (j < n-1)
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo; 

    }

    // Método de selección con errores (4)
    // Error encontrado: no retorna nada y deberia retornar si no compila 
    // la solucion seria: agregar un return arreglo;

    public int[] seleccionPrimero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores (5)
    // Error encontrado: for (int j = i + 1; j < arreglo.length; j--) { , fue el j-- eso estaba mal porque no es restando si no sumando
    // la solucion seria: cambiar j-- a j++
    public int[] seleccionSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores (6)
    // Error encontrado: fue que estaban intercambiadas las variables de arreglo[i] y el arreglo[indiceMinimo]
    // la solucion seria: reescribir al reves arreglo[indiceMinimo] y arreglo[i]
    public int[] seleccionTercero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores (7)
    // Error encontrado: while (i > 0 && arreglo[i] < key) {, error menorque mal posisionado y el i debe ser i  mayor o igual 
    // la solucion seria: corrigiendo el error quedaria while (i >= 0 && arreglo[i] > key) {
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;

            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores (8)
    // Error encontrado: la linea int i = j - 1; no es necesaria , y creamos otra linea con int k = j;
    // la solucion seria: aumentar int k = j; y cambiar la variable j por la k  y en los arreglos restarle 1 a k
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            //int i = j - 1;

            int k = j;
            for (; k > 0 && arreglo[k-1] > actual; k--) {
                arreglo[k] = arreglo[k-1];
            }
            arreglo[k] = actual;
        }
        return arreglo;
    }
    // Método de inserción con errores (9)
    // Error encontrado: falta -1 en int i-j, falta cambiar el menor que a mayor que en el key del while , error en i++, y al final los dos primeros numeros se pasan al final 
    // la solucion seria: en return cambiar los dos numeros primeros al final, en while al final poner i--, al in i=j aumentar el -1 
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i > 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return new int[] { 1, 2, 5, 6, 7, 10, 15, 34 };
    }

}
