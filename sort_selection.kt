fun main() {
    
    val arr = intArrayOf(23, 1, 67, 47, 90, 88)
    val arrOrdenado = ordenacaoPorSelecao(arr)
    
    println(arrOrdenado.joinToString(" "))
}

fun ordenacaoPorSelecao(arr: IntArray) : IntArray {
    var arrCopy = arr // arr é de acesso a leitura apenas
    var novoArr = IntArray(arrCopy.size) { 0 }
    for(i in 0 .. arr.size-1) {
        val indiceMenor = buscaMenor(arrCopy)
        novoArr[i] = arrCopy[indiceMenor]
        arrCopy = remove(arrCopy, indiceMenor)
    }
    return novoArr
}

fun buscaMenor(arr: IntArray): Int {
    var menor = arr[0]
    var menorIndice = 0
    
    arr.forEachIndexed() { index, item ->
        if (item < menor) {
            menor = item
            menorIndice = index
        }
    }
    
    return menorIndice
}

// Array in Kotlin não tem remove :O
fun remove(arr: IntArray, index: Int): IntArray {
    if (index < 0 || index >= arr.size) {
        return arr
    }
 
    val result = arr.toMutableList()
    result.removeAt(index)
    return result.toIntArray()
}
