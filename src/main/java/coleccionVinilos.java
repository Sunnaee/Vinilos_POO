public class coleccionVinilos {
    public static void main(String[] args){
        String[][] vinilos = new String[100][3];

        vinilos = agregarVinilo(vinilos, "Jihyo", "Zone", "2023");
        vinilos = agregarVinilo(vinilos, "Whee in", "Redd", "2021");
        vinilos = agregarVinilo(vinilos, "NMIXX", "expérgo", "2023");
        vinilos = agregarVinilo(vinilos, "NMIXX", "Fe3O4: BREAK", "2024");
        vinilos = agregarVinilo(vinilos, "Billlie", "the Billage of perception: chapter three", "2023");
        vinilos = agregarVinilo(vinilos, "NewJeans", "Supernatural", "2024");

        System.out.println("Espacio máximo colección: "+vinilos.length);

        printRegistrados(vinilos);

        printDisponibles(vinilos);

        String artista = "Jihyo";
        System.out.println("Buscando artista: "+artista);
        mostrarBusqArtista(vinilos,artista);
        buscarArtista(vinilos,artista);

        mostrarColeccion(vinilos);
    }

    //agregar vinilos
    public static String [][] agregarVinilo(String[][] matriz, String artista, String album, String anio){
        if(cantRegistrados(matriz) != 100) {
            int fila = cantRegistrados(matriz);
            matriz[fila][0] = artista;
            matriz[fila][1] = album;
            matriz[fila][2] = anio;
            return matriz;
        } else {
            System.out.println("No quedan espacios disponibles para agregar vinilos.");
        }
        return matriz;
    }

    //calcular registrados
    public static int cantRegistrados(String[][] matriz){
        for(int i=0;i<100;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j] == null){
                    return i;
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
    public static boolean buscarArtista(String[][] matriz, String artista){
        for(int i=0;i<100;i++) {
            if (matriz[i][0].equals(artista)) {
                return true;
            }
        }
        return false;
    }
    //mostrar resultados artista
    public static void mostrarBusqArtista(String[][] matriz, String artista){
        if(buscarArtista(matriz, artista)){
            System.out.println("El artista "+artista+" se encuentra en la colección.");
        } else{
            System.out.println("El artista "+artista+" NO se encuentra en la colección.");
        }
    }
}