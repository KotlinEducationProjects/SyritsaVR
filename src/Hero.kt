class Hero(var name: String) {
    internal var level = 1
    internal var experience = 0
    internal var damage = 1

    private var expOnNewLvl = 10

    private fun levelUp() {
        if (experience >= expOnNewLvl) {
            level += 1
            expOnNewLvl += expOnNewLvl
            experience = 0
            damage += 1
            println("ПОЛУЧЕН НОВЫЙ УРОВЕНЬ!!!")
        }
        println("Need $expOnNewLvl experience for new level")
    }

    fun hit(enemy: Enemy) {
        enemy.health -= damage
        println("$enemy получил $damage урона")
        if (enemy.destroyed()) {
            experience += enemy.exp
            levelUp()
        }
    }

    override fun toString(): String {
        return name
    }
}