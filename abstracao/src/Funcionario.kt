abstract class Funcionario (var nome: String, var salario: Double){
    abstract fun calcularBonus(): Double
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double {
        return salario * 0.20
    }
}

class Analista(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double {
        return salario * 0.10
    }
}
