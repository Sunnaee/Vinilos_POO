public class coleccionVinilos {
    public static void main(String[] args){
        String[][] vinilos = new String[100][3];

        vinilos = agregarVinilo(vinilos, "Jihyo", "Zone", "2023");

        System.out.println("Espacio máximo colección: "+vinilos.length);

        printRegistrados(vinilos);

        printDisponibles(vinilos);

        //String artista = nombre artista;
        //System.out.println("Buscando artista: "+artista);
        //mostrarBusqArtista(vinilos,artista);
        //buscarArtista(vinilos,artista);
        mostrarColeccion(vinilos);
    }

    //agregar vinilos
    public static String [][] agregarVinilo(String[][] matriz, String artista, String album, String anio){
        int fila = cantRegistrados(matriz);
        matriz[fila][0] = artista;
        matriz[fila][1] = album;
        matriz[fila][2] = anio;
        return matriz;
    }

    //calcular registrados
    public static int cantRegistrados(String[][] matriz){
        int registrados = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<3;j++){
                if (matriz[i][j] == null){
                    return registrados = i;
                }
            }
        }
        return 100;
    }

    //print cantidad de registrados
    public static void printRegistrados(String[][] matriz){
        System.out.println("Se encuentran "+cantRegistrados(matriz)+" vinilos registrados en la colección.");
    }

    //print registrados
    public static void mostrarColeccion(String[][] matriz){
        for(int i=0;i<cantRegistrados(matriz);i++){
            System.out.println(matriz[i][0]+" - "+matriz[i][1]+" - "+matriz[i][2]);
        }
    }

    //calcular vinilos disponibles
    public static int cantDisponibles(String[][] matriz){
        return 100 - cantRegistrados(matriz);
    }

    //print disponibles
    public static void printDisponibles(String[][] matriz){
        System.out.println("Se encuentran "+cantDisponibles(matriz)+" espacios disponibles en la colección.");
    }

    //buscar artista bool
    //mostrar resultados artista
}