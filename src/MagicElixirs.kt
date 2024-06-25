enum class MagicElixirs {
    EXP_ELIXIR, STRAIGHT_ELIXIR, LVL_ELIXIR
}

private fun getElixir(): MagicElixirs {
    return MagicElixirs.entries.random()
}

fun useElixir(hero: Hero) {
    when (getElixir()) {
        MagicElixirs.STRAIGHT_ELIXIR -> hero.damage += 1
        MagicElixirs.EXP_ELIXIR -> hero.experience += 10
        MagicElixirs.LVL_ELIXIR -> {
            var levelUp = hero.getLevel()
            levelUp += 1
            hero.setLevel(levelUp)
        }
    }
}
