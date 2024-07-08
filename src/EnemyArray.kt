enum class EnemyArray {
    ORK, DARK_ELF, RED_DRAGON, THIEF, SKELETON
}

private fun chooseEnemy(): EnemyArray {
    return EnemyArray.entries.random()
}

fun createEnemy(): Enemy {
    return when (chooseEnemy()) {
        EnemyArray.ORK -> Enemy(name = "Ork", health = 20, exp = 20, recomendedLvl = 3, damage = 5)
        EnemyArray.DARK_ELF -> Enemy(name = "Dark elf", health = 40, exp = 40, recomendedLvl = 4, damage = 10)
        EnemyArray.RED_DRAGON -> Enemy(name = "Red dragon", health = 120, exp = 80, recomendedLvl = 5, damage = 12)
        EnemyArray.THIEF -> Enemy(name = "Thief", health = 5, exp = 5, recomendedLvl = 1, damage = 1)
        EnemyArray.SKELETON -> Enemy(name = "Skeleton", health = 10, exp = 10, recomendedLvl = 2, damage = 2)
    }
}