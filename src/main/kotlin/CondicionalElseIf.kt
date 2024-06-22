class CondicionalElseIf {
    fun main() {
        var idade = 99

        if (idade <= 10) {
            println("Criança")
        } else if (idade <= 17) {
            println("Adolescente")
        } else {
            println("Adulto")
        }
    }
}