class CartaoCredito : Pagamento{
    override fun processarPagamento(valor: Double){
        println("Pagamento de R$$valor processado com cartão de Crédito")
    }
}