enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL, AVANÇADO }

data class Usuario(val nome:String, var idade:Int?){
    
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel:Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario:Usuario) {
       
            inscritos.add(usuario)
            println("$usuario matriculado com sucesso")

    }
}

fun main() {
   
    val conteudos = listOf(
        ConteudoEducacional("Iniciando com Python", 3, Nivel.BASICO),
        ConteudoEducacional("Variaveis com Python", 4, Nivel.BASICO),
        ConteudoEducacional("Tipos primitivos com Python", 2, Nivel.BASICO)
    )
    val cursoPython = Formacao("Pro Python", conteudos)
    cursoPython.matricular(Usuario("Bruno", 18))
    for (i in cursoPython.conteudosAbstractList
    println("$i")
    
}