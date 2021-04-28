fun main() {
    val lista = listOf<String>("a", "b", "c", "d")
    val procuroPor = "c"
    
    val result = pesquisaBinaria(lista, procuroPor)
    
    println(result)
}

// log2 (n) = tempo logaritmico O(logn)
fun pesquisaBinaria(listaEntrada: List<String>, itemProcurado: String) : Int? {
    var baixo = 0
    var alto = listaEntrada.count() - 1
    
    while(baixo <= alto) {
        var meio = (baixo + alto) / 2
        var chute = listaEntrada[meio]
        
        if (chute == itemProcurado) {
            return meio
        } else if (chute > itemProcurado) {
            alto = meio - 1
        } else {
            baixo = meio + 1
        }
    }
    return null
}
