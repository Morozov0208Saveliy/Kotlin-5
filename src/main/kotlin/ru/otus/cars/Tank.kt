package ru.otus.cars

interface Tank : CarOutput {
    val mouth: TankMouth

    fun getContents(): Int

    fun receiveFuel(liters: Int)

}