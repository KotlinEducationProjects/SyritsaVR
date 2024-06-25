//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val hero = Hero("Vallard")
    val ork = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork2 = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork3 = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork4 = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork5 = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork6 = Enemy("Ork", health = 5, exp = 5, recomendedLvl = 1)
    val ork7 = Enemy("Big ork", health = 10, exp = 10, recomendedLvl = 3)
    val darkElf = Enemy("Elf", health = 50, exp = 20, recomendedLvl = 5)

    val enemyArray = listOf(ork, ork2, ork3, ork4, ork5, ork6, ork7, darkElf)

    letsBattle(hero)
    println ("${hero.name} damage = ${hero.damage} experience = ${hero.experience} level = ${hero.getLevel()}")
}
