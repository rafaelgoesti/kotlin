fun realizarPagamento (pagamento: Pagamento, valor: Double) {
    pagamento.processarPagamento(valor)
}

fun main(){
    val pagamento1: Pagamento = CartaoCredito()
    val pagamento2: Pagamento = BoletoBancario()
    val pagamento3: Pagamento = CartaoDebito()

    realizarPagamento(pagamento1, 275.0)
    realizarPagamento(pagamento2, valor = 500.0)
    realizarPagamento(pagamento3, 1352.0)
}