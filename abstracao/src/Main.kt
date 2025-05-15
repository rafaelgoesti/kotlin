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

class Quadro(private val lado: Double) : Forma {
    override fun calcularArea(): Double {
        return lado * lado
    }
}

class Retangulo(private val base: Double, private val altura: Double) : Forma {
    override fun calcularArea(): Double {
        return base * altura
    }
}

class Circulo(private val raio: Double) : Forma {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

//class Medicamento(val formula: String, val posologia: String){
//    init {
//        require(formula.length > 0){
//            "Informe uma fórmula"
//        }
//
//        require(posologia.length > 0){
//            "Informe uma posologia"
//        }
//    }
//}

class SMT() : Notificacao{
    override fun enviar(mensagem: String) {
        println(mensagem)
    }
}

class Email() : Notificacao{
    override fun enviar(mensagem: String) {
        println(mensagem)
    }
}

class Push() : Notificacao{
    override fun enviar(mensagem: String) {
        println(mensagem)
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

    // Funcionários
    val gerente = Gerente("Rafael Góes", 2000.0)
    val analista = Analista("Thiago", 3500.0)
    println("Bônus do gerente: R$ ${gerente.calcularBonus()}")
    println("Bônus da analista: R$ ${analista.calcularBonus()}")

    // Formas
    val quadrado = Quadro(5.0)
    val circulo = Circulo(3.0)
    val retangulo = Retangulo(4.0, 6.0)
    println("Área do quadrado: ${quadrado.calcularArea()}")
    println("Área do círculo: ${circulo.calcularArea()}")
    println("Área do retângulo: ${retangulo.calcularArea()}")

    // Veiculos
    val veiculos: List<Veiculo> = listOf(Carro(), Barco(), Aviao())

    for (veiculo in veiculos) {
        veiculo.mover()
    }

    // Notificações
    val not1 = SMT()
    not1.enviar("Mensagem enviada via SMT")
    val not2 = Email()
    not2.enviar("Mensagem enviada via email")
    val not3 = Push()
    not3.enviar("Mensagem enviada via push")
}