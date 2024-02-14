/**
 * Clase hija de ArmaDeFuego.
 * @param nombre :String nombre del tipo de arma
 * @param municion :Int cantidad de municion del arma
 * @param tipoDeMunicion :String tipo de municion que utiliza el arma
 * @param danio :Int Daño del arma
 * @param radio :TipoRadio indica el radio del arma
 * @param municionARestar :Int municion que gasta el arma cada vez que dispara
 */
class Casa(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Casa"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 1
    init {
        require(this.danio in 1..5) {"El daño debe ser entre 1 y 5"}
        require(this.radio == TipoRadio.REDUCIDO || this.radio == TipoRadio.CORTO) {"El radio debe ser reducido o corto"}
    }

    /**
     * Sobrescribe la función dispara para remplazar el string que devuelve cambiando munición por confeti
     * @return String texto cambiado para la casa
     */
    override fun dispara(): String {
        return super.dispara().replace("Munición", "Confeti")
    }

    /**
     * Sobrescribe la función toString de la clase padre para remplazar el string que devuelve cambiando munición por confeti
     * @return String texto cambiado para la casa
     */
    override fun toString(): String {
        return super.toString().replace("Munición", "Confeti")
    }
}