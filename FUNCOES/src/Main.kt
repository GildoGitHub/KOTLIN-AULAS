fun main() {
    val number1 = 20;
    val number2 = 30;

    println(somaInferida(number2,number1))
    println(somaNormal(number1,number2))
    mensagem(number1,number2)
    mensagem2(number2,number1)
}

//Função com retorno Int com retorno inferido
fun somaInferida(a: Int, b: Int) = a+b

//Função do tipo Int
fun somaNormal(a: Int, b: Int):Int{
    return a+b
}

//Função sem retorno implícito
fun mensagem(a: Int, b: Int){
    println(somaInferida(a,b))
}
//Função sem retorno explícito
fun mensagem2(a: Int, b: Int):Unit{
    println("A soma de $a + $b = ${somaInferida(a,b)}")
}