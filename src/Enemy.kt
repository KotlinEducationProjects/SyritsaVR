class Enemy () {

    var name = ""
    var health = 0
    var exp = 0
    var recomendedLvl = 0
    var damage = 1

    constructor(name: String, health: Int, exp: Int, recomendedLvl: Int, damage: Int) : this() {
        this.name = name
        this.health = health
        this.exp = exp
        this.recomendedLvl = recomendedLvl
        this.damage = damage
    }

    fun destroyed(): Boolean {
        return health <= 0
    }

    fun hit(hero: Hero) {
        hero.health -= damage
        println("${Colours.red}$hero получил $damage урона${Colours.reset}")
        if (hero.dead()) {
            hero.respawn()
        }
    }

    override fun toString(): String {
        return name
    }
}