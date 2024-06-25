fun letsBattle(hero: Hero) {
    takeNewQuest()
    for (enemy in takeNewQuest()) {
        useElixir(hero)
        startBattle(hero, enemy)
        getReward(enemy)
    }
}


private fun startBattle(hero: Hero, enemy: Enemy) {
    println("Враг $enemy нападает на $hero")
    if (hero.getLevel() >= enemy.recomendedLvl) {
        println("Герой вступает в бой")
        while (enemy.health > 0) {
            hero.hit(enemy)
        }
    } else println("Герой трусливо бежит")
    println("${hero.name} damage = ${hero.damage} experience = ${hero.experience} level = ${hero.getLevel()}")
}

private fun getReward(enemy: Enemy) {
    if (enemy.destroyed()) println("$enemy уничтожен, герой получил ${enemy.exp} опыта")
}
