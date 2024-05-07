package ru.otus.cars

sealed class TankMouth(startFuel: Int, car: Car? = null) {
    protected var isOpen = false
    open var carlink = car
    abstract var fuelContents: Int
    fun open() {
        this.isOpen = true
    }

    fun close() {
        this.isOpen = false
    }

    override fun toString(): String {
        return "Горлышко"
    }

    fun setCarLink(car: Car?) {
        this.carlink = car
    }
}