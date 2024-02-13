fun main() {

    val pistola = Pistola(8, "9mm", 4, TipoRadio.Corto)
    val rifle = Rifle(15, "7.62", 7, TipoRadio.Intermedio)
    val bazooka = Bazooka(3, "RPG", 23, TipoRadio.Enorme)

    val armas = listOf(pistola, rifle, bazooka)

    val disparos = (1..12).map { armas.random() to (1..3).random() }

    println("Munición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")


    disparos.forEach { println(it) }


}