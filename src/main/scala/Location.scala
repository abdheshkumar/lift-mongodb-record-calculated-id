import net.liftweb.mongodb.record._
import net.liftweb.mongodb.record.field._
import net.liftweb.record.field._

object Location extends Location with MongoMetaRecord[Location]

class Location private() extends MongoRecord[Location] with StringPk[Location] {
  def meta = Location

  // def init(country: String, area: String, city: String) = {
  //   this.id((country + ":" + area + ":" + city).toLowerCase())
  //   this.country(country)
  //   this.area(area)
  //   this.city(city)
  // }

  object country extends StringField(this, 100)
  object area extends StringField(this, 100)
  object city extends StringField(this, 100)

  object latitude extends DoubleField(this)
  object longitude extends DoubleField(this)
}