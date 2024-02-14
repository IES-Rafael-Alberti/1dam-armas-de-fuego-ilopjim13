fun main() {

    val pistola = Pistola(8, "9mm", 4, TipoRadio.Corto)
    val rifle = Rifle(15, "7.62", 7, TipoRadio.Intermedio)
    val bazooka = Bazooka(3, "RPG", 23, TipoRadio.Enorme)

    val armas = listOf(pistola, rifle, bazooka)

    val disparos = (1..12).map { armas.random() to (1..3).random() }

    println("Munición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")

    var cont = 0
    var nombre:ArmaDeFuego? = null


    disparos.forEach {
        if (nombre != it.first || nombre == null) println("*** Disparo: ${++cont}")
        println(it.first.dispara())
        println(it.first)
        nombre = it.first
    }

    // Parte 2

    val coche = Coche(5, "luz", 7, TipoRadio.Intermedio)
    val casa = Casa(7, "confeti", 3, TipoRadio.Corto)
    val bocadillo = Bocadillo(9, "jamón", 10, TipoRadio.Intermedio)

    val objetos = listOf(pistola, rifle, bazooka, coche, casa, bocadillo)

    val disparosObjetos = (1..9).map { objetos.random() to (1..2).random() }

    println("\nParte 2, disparando con objetos.\n")

    nombre = null
    cont = 0

    disparosObjetos.forEach {
        if (nombre != it.first || nombre == null) println("*** Disparo: ${++cont}")
        println(it.first.dispara())
        println(it.first)
        nombre = it.first
    }

}