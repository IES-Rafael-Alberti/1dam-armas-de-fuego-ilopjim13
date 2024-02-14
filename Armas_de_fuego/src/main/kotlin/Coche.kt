/**
 * Clase hija de ArmaDeFuego.
 * @param nombre :String nombre del tipo de arma
 * @param municion :Int cantidad de municion del arma
 * @param tipoDeMunicion :String tipo de municion que utiliza el arma
 * @param danio :Int Daño del arma
 * @param radio :TipoRadio indica el radio del arma
 * @param municionARestar :Int municion que gasta el arma cada vez que dispara
 */
class Coche(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Coche"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 2
    init {
        require(this.danio in 5..10) {"El daño debe ser entre 5 y 10"}
        require(this.radio == TipoRadio.Intermedio || this.radio == TipoRadio.Corto) {"El radio debe ser intermedio o corto"}
    }

    /**
     * Sobrescribe la función dispara para remplazar el string que devuelve cambiando munición por ráfagas de luz
     * @return String texto cambiado para el coche
     */
    override fun dispara(): String {
        return super.dispara().replace("Munición", "Ráfagas de luz")
    }

    /**
     * Sobrescribe la función toString de la clase padre para remplazar el string que devuelve cambiando munición por ráfagas de luz
     * @return String texto cambiado para el coche
     */
    override fun toString(): String {
        return super.toString().replace("Munición", "Ráfagas de luz")
    }
}