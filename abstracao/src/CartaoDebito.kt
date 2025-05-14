class CartaoDebito : Pagamento{
    override fun processarPagamento(valor: Double) {
        println("Pagamento de R$$valor processado com Cartão de Débito")
    }
}