//Metodo de Pagamento
fun realizarPagamento (pagamento: Pagamento, valor: Double) {
    pagamento.processarPagamento(valor)
}

//Interface Animal
class Cachorro : Animal{
    override fun fazerSom() {
        println("Estou latindo...")
    }
}

class Gato : Animal{
    override fun fazerSom() {
        println("Estou miando...")
    }
}

class Leao : Animal{
    override fun fazerSom() {
        println("Estou rangendo...")
    }
}

fun main(){
    // Pagamentos
    val pagamento1: Pagamento = CartaoCredito()
    val pagamento2: Pagamento = BoletoBancario()
    val pagamento3: Pagamento = CartaoDebito()
    realizarPagamento(pagamento1, 275.0)
    realizarPagamento(pagamento2, valor = 500.0)
    realizarPagamento(pagamento3, 1352.0)

    //Animais
    val animal01 = Cachorro()
    animal01.fazerSom()
    val animal02 = Gato()
    animal02.fazerSom()
    val animal03 = Leao()
    animal03.fazerSom()

    // Funcionario
    val gerente = Gerente("Rafael Góes", 2000.0)
    val analista = Analista("Thiago", 3500.0)

    println("Bônus do gerente: R$ ${gerente.calcularBonus()}")
    println("Bônus da analista: R$ ${analista.calcularBonus()}")
}