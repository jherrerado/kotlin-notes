fun main(args: Array<String>){
    val myLambdas : (String) -> Int = { valor -> valor.length};

    val largoDelValorInicial = superfuncion(valorInicial = "Hola", block = {
        valor -> valor.length;
    });

    println(largoDelValorInicial);
}

fun superfuncion(valorInicial: String, block : (String) -> Int): Int{
    return block(valorInicial);
}