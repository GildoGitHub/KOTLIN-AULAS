import java.util.*

fun main() {

    val leitor = Scanner(System.`in`)

    print("Digita seu nome: ")
    val nome = leitor.next();

    print("Digite seu sexo: ")
    val sexo = leitor.next()[0];

    print("Digita um numero: ")
    val numero1 = leitor.nextFloat()

    print("Digita outro numero: ")
    val numero2 = leitor.nextFloat();

    println("Senhor/a $nome, o seu sexo é $sexo media é: ${(numero1 + numero2)/2}")
}
