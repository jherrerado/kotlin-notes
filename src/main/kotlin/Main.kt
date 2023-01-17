fun main(args: Array<String>) {

    val one: Int = 1; // int
    val threeBellon : Long = 3000000000L; // long
    val Onebyte : Byte = 1; // byte

    val Maytrue: Boolean = true;

    val primerValor: Int = 20;
    val segundoValor: Int = 10
    val tecerValor:Int = primerValor.minus(segundoValor);

    val nombre: String = "joshua";
    val Apellido: String = "Herrera German";
    val Dato: String = "$nombre $Apellido";

    val frutas: List<String> = listOf("Manzana", "Pera", "guineo");
    val numbers: IntArray = intArrayOf(2, 3, 5);
    val estado: BooleanArray = booleanArrayOf(true, false);

    val vaciaNombre = mutableListOf<String>();
    vaciaNombre.add("Joshua");
    vaciaNombre.add("Maria");
    vaciaNombre.add("Juan");
    vaciaNombre.removeAt(1);
    val obtenerNombre: String = vaciaNombre.get(1);


    val mapa = mapOf("iromand" to 35, "capitan America" to 99);
    
    println(obtenerNombre);
}