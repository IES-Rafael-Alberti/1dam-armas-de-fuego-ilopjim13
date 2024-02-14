fun main() {

    val pistola = Pistola(8, "9mm", 4, TipoRadio.CORTO)
    val rifle = Rifle(15, "7.62", 7, TipoRadio.INTERMEDIO)
    val bazooka = Bazooka(3, "RPG", 23, TipoRadio.ENORME)

    val armas = listOf(pistola, rifle, bazooka)

    val disparos = (1..12).map { armas.random() to (1..3).random() }

    println("Munición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")

    var cont = 0


    disparos.forEach { (arma, veces) ->
        //if (nombre != it.first || nombre == null) println("*** Disparo: ${++cont}")
        //println(it.first.dispara())
        //println(it.first)
        //nombre = it.first
        println("*** Disparo: ${++cont}")
        repeat(veces) {
            println(arma.dispara())
            println(arma)
        }

    }

    // Parte 2

    val coche = Coche(5, "luz", 7, TipoRadio.INTERMEDIO)
    val casa = Casa(7, "confeti", 3, TipoRadio.CORTO)
    val bocadillo = Bocadillo(9, "jamón", 10, TipoRadio.INTERMEDIO)

    val objetos = listOf(pistola, rifle, bazooka, coche, casa, bocadillo)

    val disparosObjetos = (1..9).map { objetos.random() to (1..2).random() }

    println("\nParte 2, disparando con objetos.\n")

    cont = 0

    disparosObjetos.forEach {(objeto, veces) ->
        //if (nombre != it.first || nombre == null) println("*** Disparo: ${++cont}")
        //println(it.first.dispara())
        //println(it.first)
        //nombre = it.first

        println("*** Disparo: ${++cont}")
        repeat(veces) {
            println(objeto.dispara())
            println(objeto)
        }
    }

}