package ru.otus.cars

class LpgMouth(startFuel: Int = 0, car: Car? = null) : TankMouth(startFuel) {
    override var fuelContents: Int = 0
    override var carlink = car
    fun fuelLpg(litres: Int) {
        if (carlink != null)
            if (this.isOpen)
                this.fuelContents = +litres
            else throw Exception("Бак закрыт")
        else throw Exception("Taz заправлен но...Взрыв!")
    }

    override fun toString(): String {
        return "На газу"
    }
}