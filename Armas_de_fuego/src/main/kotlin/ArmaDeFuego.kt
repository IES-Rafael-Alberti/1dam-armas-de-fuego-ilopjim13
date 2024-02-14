import kotlin.random.Random

/**
 * Clase abstracta Arma de fuego con las funciones y las propiedades que heredarán las demas clases.
 * @property nombre :String nombre del tipo de arma
 * @property municion :Int cantidad de municion del arma
 * @property tipoDeMunicion :String tipo de municion que utiliza el arma
 * @property danio :Int Daño del arma
 * @property radio :TipoRadio indica el radio del arma
 * @property municionARestar :Int municion que gasta el arma cada vez que dispara
 */
abstract class ArmaDeFuego(private val nombre :String,
                           private var municion : Int,
                           private val tipoDeMunicion : String) {
    abstract val danio : Int
    abstract val radio: TipoRadio
    abstract val municionARestar : Int

    companion object {
        var cantidadMunicionExtra: Int = Random(5).nextInt(15)
    }


    /**
     * Dispara si tiene munición, si no es así recarga el arma comprobando que pueda hacerlo, si dispara retornará
     * un texto indicando que ha disparado y cuanta munición le queda y si no ha podido disparar lo indicará
     * con un texto diciendo que no puede disparar.
     * @return String devuelve el texto diciendo si ha disparado o no
     */
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

    /**
     * Recarga el arma con el doble de la munición a restar, si no puede hacerlo lo intentará con el número de
     * la munición a restar y si aún así tampoco puede devolverá un texto diciendo que no se pudo recargar
     * @return String devuelve el texto diciendo si ha recargado o no
     */
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

    /**
     * Muestra la información de las armas
     * @return String con la información de las armas
     */
    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio"
    }
}