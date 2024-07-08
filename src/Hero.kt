import kotlin.system.exitProcess

class Hero(var name: String) {
    private var level = 1
    internal var experience = 0
    internal var damage = 1
    internal var health = 20
    private var maxHealth = 20
    var sword = "RUSTY_SWORD"

    private var requiredExp = 10

    private fun levelUp() {
        if (experience >= requiredExp) {
            level += 1
            experience -= requiredExp
            requiredExp += requiredExp
            damage += 1
            maxHealth += 20
            health = maxHealth
            println("ПОЛУЧЕН НОВЫЙ УРОВЕНЬ!!!")
        }
        println("Need $requiredExp experience for new level")
    }

    fun hit(enemy: Enemy) {
        enemy.health -= damage
        println("${Colours.green}$enemy получил $damage урона${Colours.reset}")
        if (enemy.destroyed()) {
            getSword()
            println("$enemy уничтожен, герой получил ${enemy.exp} опыта")
            experience += enemy.exp
            levelUp()
        }
    }

    fun dead(): Boolean {
        return health <= 0
    }

    fun respawn() {
            println("Герой погиб в неравной битве")
            experience = 0
            health = 20
            println("Герой воскресает в больнице. Опыт = $experience, здоровье = $health")
    }

    fun restoreHp() {
        if (health in 1..10) {
            Thread.sleep(500)
            health = maxHealth/2
            println("Герой решает восстановить жизни, придется подождать")
        }
    }

    private fun getSword() {
        when(randomSword()) {
            HeroWeapon.CLASSIC_SWORD -> {
                if (sword == "FIRE_SWORD" || sword == "LEGENDARY_SWORD") {
                    println("У героя уже есть меч получше")
                } else {
                    damage += 1
                    sword = "CLASSIC_SWORD"
                    println("Герой получил классический меч, атака увеличина")
                }
            }
            HeroWeapon.FIRE_SWORD -> {
                if (sword == "LEGENDARY_SWORD") {
                    println("У героя уже есть меч получше")
                } else {
                    damage += 2
                    sword = "FIRE_SWORD"
                    println("Герой получил меч огня, атака увеличина")
                }
            }
            HeroWeapon.LEGENDARY_SWORD -> {
                if (sword == "LEGENDARY_SWORD") {
                    println("У героя и так легендарный меч")
                } else {
                    damage += 3
                    sword = "LEGENDARY_SWORD"
                    println("Герой получил легендарный меч, атака увеличина")
                }
            }
        }
    }

    fun getLevel(): Int {
        return level
    }

    fun setLevel(level: Int) {
        this.level = level
    }

    override fun toString(): String {
        return name
    }
}