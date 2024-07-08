enum class HeroWeapon {
    CLASSIC_SWORD, FIRE_SWORD, LEGENDARY_SWORD
}

fun randomSword(): HeroWeapon {
    return HeroWeapon.entries.random()
}
