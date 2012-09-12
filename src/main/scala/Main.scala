import com.mongodb.Mongo
import net.liftweb.mongodb.{DefaultMongoIdentifier, MongoDB}

object Main {
  def main(args: Array[String]) = {
    println("Started.")

    MongoDB.defineDb(DefaultMongoIdentifier, new Mongo, "test")

    val country = "Russia"
    val area = "Samara Region"
    val city = "Samara"
    val latitude = 53.233333
    val longitude = 50.166667

    val location = Location.createRecord
    location.set(country, area, city, latitude, longitude).save

    println("Country:" + location.country)
    println("Area:" + location.area)
    println("City:" + location.city)
    println("Latitude:" + location.latitude)
    println("Longitude:" + location.longitude)

    println("Ended.")
  }
}