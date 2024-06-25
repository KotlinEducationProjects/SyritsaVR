class Enemy () {

    var name = ""
    var health = 0
    var exp = 0
    var recomendedLvl = 0

    constructor(name: String, health: Int, exp: Int, recomendedLvl: Int) : this() {
        this.name = name
        this.health = health
        this.exp = exp
        this.recomendedLvl = recomendedLvl
    }

    fun destroyed(): Boolean {
        if (health <= 0) {
            return true
        } else return false
    }

    override fun toString(): String {
        return name
    }
}