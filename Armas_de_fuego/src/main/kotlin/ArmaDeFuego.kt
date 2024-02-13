import kotlin.random.Random

abstract class ArmaDeFuego(private val nombre :String,
                           private var municion : Int,
                           private val tipoDeMunicion : String) {
    abstract val danio : Int
    abstract val radio: TipoRadio
    abstract val municionARestar : Int

    companion object {
        var cantidadMunicionExtra: Int = Random(5).nextInt(15)
    }

    open fun dispara() : String {
        return if (municion < municionARestar) {
            if (cantidadMunicionExtra < municionARestar) "No hay suficiente municion para disparar"
            else {
                recarga()
                this.municion -= this.municionARestar
                "$nombre dispara. Munición restante: $municion"
            }
        } else {
            this.municion -= this.municionARestar
            "$nombre dispara. Munición restante: $municion"
        }
    }
    fun recarga() : String {
        return if (cantidadMunicionExtra - (municionARestar * 2) >= 0) {
            cantidadMunicionExtra -= (municionARestar * 2)
            municion += municionARestar * 2
            "$nombre recargada. Munición restante: $municion"
        } else if (cantidadMunicionExtra - municionARestar  >= 0) {
            cantidadMunicionExtra -= municionARestar
            municion += municionARestar
            "$nombre recargada. Munición restante: $municion"
        } else "No hay suficiente munición extra para recargar"
    }

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio"
    }
}