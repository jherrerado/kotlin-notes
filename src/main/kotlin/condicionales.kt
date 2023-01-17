fun main(args: Array<String>) {
    val nombre: String = "";

    if(nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombres es: ${nombre.length}");
    } else{
        println("La variable no puede estar basia");
    }

    val mensaje : String = if (nombre.length > 5) {
        "Tienes un nombrde corto"
    } else {
        "Tienes el nombre largo";
    }

    val nombreColor: String = "Amarillo";

    when(nombreColor){
        "Amarrillo" -> println("Color: $nombreColor no es el elegido");
        "Rojo", "Verde", "Marron" -> println("Color: $nombreColor es el elegido");
        else -> println("No tenemos el color $nombreColor");

    }
}