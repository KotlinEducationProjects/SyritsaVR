enum class Quests {
    SAVE_VILLAGE, RESQUE_PRINCESS, FIND_OLD_CASTLE
}

private fun generateQuest(): Quests {
    return Quests.entries.random()
}

fun takeNewQuest(): ArrayList<Enemy> {
    return when(generateQuest()) {
        Quests.SAVE_VILLAGE -> {
            println("${Colours.perple}!!!Quest <<Save village>> started!!!${Colours.reset}")
            val enemies = ArrayList<Enemy>(20)
            while (enemies.size < 21) {
                enemies.add(createEnemy())
            }
            return enemies
        }

        Quests.RESQUE_PRINCESS -> {
            println("${Colours.perple}!!!Quest <<Resque princess>> started!!!${Colours.reset}")
            val enemies = ArrayList<Enemy>(40)
            while (enemies.size < 41) {
                enemies.add(createEnemy())
            }
            return enemies
        }

        Quests.FIND_OLD_CASTLE -> {
            println("${Colours.perple}!!!Quest <<Find old castle>> started!!!${Colours.reset}")
            val enemies = ArrayList<Enemy>(60)
            while (enemies.size < 61) {
                enemies.add(createEnemy())
            }
            return enemies
        }
    }
}
