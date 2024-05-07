package ru.otus.cars

object FuelStation {
    fun refuelingTheCar(car: Car, litres: Int) {
        try {
            if (car.mouth is LpgMouth) {
                car.mouth.open()
                (car.mouth as LpgMouth).fuelLpg(litres)
                car.mouth.close()
                println("заправил машину $car на $litres литров. Газ")
            } else {
                car.mouth.open()
                (car.mouth as PetrolMouth).fuelPetrol(litres)
                car.mouth.close()
                println("заправил машину $car на $litres литров. Бензин")
            }
        } catch (e: Exception) {
            println("не пытайтесь заправить ваш ТАЗ")

        }


    }

}