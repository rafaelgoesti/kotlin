class BoletoBancario : Pagamento {
    override fun processarPagamento(valor: Double) {
        println("Pagamento de R$$valor gerado via Boleto")
    }
}