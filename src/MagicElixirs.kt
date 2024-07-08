enum class MagicElixirs {
    EXP_ELIXIR, STRAIGHT_ELIXIR, LVL_ELIXIR, HP_ELIXIR
}

private fun getElixir(): MagicElixirs {
    return MagicElixirs.entries.random()
}

fun useElixir(hero: Hero) {
    when (getElixir()) {
        MagicElixirs.STRAIGHT_ELIXIR -> {
            println("${Colours.blue}$hero пьет эликсир, его сила увеличилась${Colours.reset}")
            hero.damage += 1}
        MagicElixirs.EXP_ELIXIR -> {
            println("${Colours.blue}$hero пьет эликсир, его опыт увеличился${Colours.reset}")
            hero.experience += 10
        }
        MagicElixirs.LVL_ELIXIR -> {
            println("${Colours.blue}$hero пьет эликсир, его уровень растет${Colours.reset}")
            var levelUp = hero.getLevel()
            levelUp += 1
            hero.setLevel(levelUp)
        }
        MagicElixirs.HP_ELIXIR -> {
            println("${Colours.blue}$hero пьет эликсир, его здоровье восстановлено${Colours.reset}")
            when (hero.getLevel()) {
                in 1..3 -> hero.health += 20
                in 4..5 -> hero.health += 40
                in 6..8 -> hero.health += 80
                else -> hero.health += 100
            }
        }
    }
}
