class Bazooka(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Bazooka"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 1
    init {
        require(this.danio in 10..30) {"El daño debe ser entre 10 y 30"}
        require(this.radio == TipoRadio.Intermedio || this.radio == TipoRadio.Amplio || this.radio == TipoRadio.Enorme) {"El radio debe estar entre intermedio y enorme"}
    }
}