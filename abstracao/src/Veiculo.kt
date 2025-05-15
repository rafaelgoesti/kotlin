abstract class Veiculo {
    abstract fun mover()
}

class Aviao : Veiculo() {
    override fun mover(){
        println("Aviao mostrar")
    }
}

class Barco : Veiculo() {
    override fun mover(){
        println("Barco mostrar")
    }
}

class Carro : Veiculo() {
    override fun mover(){
        println("Carro mostrar")
    }
}
