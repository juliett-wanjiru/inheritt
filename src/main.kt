fun main(){
    var car=Car("subaru","x42","blue",5)
    car.carry(28)
    car.identity("white","subaru","legacy")
    car.calculateParkingFees(7)
    var bus=Bus("green","bugati","x32",80)
    bus.calculateParkingFees(6)
    bus.maxTripFare(900.0)

}
open class Car(var make:String, var model: String, var color:String, var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Carrying $x people")

        }
    }

    fun identity(color: String, make: String, model: String) {
        println("i am a $color $make $model")
    }


    open fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        println(fees)
        return fees
    }
}

class Bus(color: String,model: String,make: String,capacity: Int):Car (make,model,color,capacity) {
    fun maxTripFare(fare: Double): Double {
        var maxTripFare = fare * capacity
        println(maxTripFare)
        return maxTripFare
    }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var product=hours* capacity
        println(product)
        return product

    }


}
