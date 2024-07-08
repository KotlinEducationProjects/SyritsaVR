import kotlin.random.Random

fun letsBattle(hero: Hero) {
    for (enemy in takeNewQuest()) {
        useElixir(hero)
        startBattle(hero, enemy)
    }
}


private fun startBattle(hero: Hero, enemy: Enemy) {
    println("Враг $enemy нападает на $hero")
    if (hero.getLevel() >= enemy.recomendedLvl) {
        println("Герой вступает в бой")
        while (enemy.health > 0) {
            hero.restoreHp()
            if (Random.nextBoolean()) {
                enemy.hit(hero)
            } else println ("${Colours.greenBack}$hero промазал${Colours.reset}")
            if (Random.nextBoolean()) {
                hero.hit(enemy)
            } else println("${Colours.redBack}$enemy промазал${Colours.reset}")
        }
    } else println("Герой трусливо бежит")
    println("${Colours.yellow}${hero.name} health = ${hero.health} damage = ${hero.damage} experience =" +
            " ${hero.experience} level = ${hero.getLevel()}${Colours.reset}")
}
