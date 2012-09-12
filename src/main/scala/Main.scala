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
      .id((country + ":" + area + ":" + city).toLowerCase())
      .country(country)
      .area(area)
      .city(city)
      .latitude(latitude)
      .longitude(longitude)
      .save

    // val location = Location.createRecord
    // location.init(country, area, city)
    // location.latitude(latitude)
    // location.longitude(longitude)
    // location.save

    println("Ended.")
  }
}