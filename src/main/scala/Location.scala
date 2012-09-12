import net.liftweb.mongodb.record._
import net.liftweb.mongodb.record.field._
import net.liftweb.record.field._

object Location extends Location with MongoMetaRecord[Location]

class Location private() extends MongoRecord[Location] {
  def meta = Location

  def set(country: String, area: String, city: String): Location = {
    set(country, area, city, 0, 0)
  }

  def set(country: String, area: String, city: String, latitude: Double, longitude: Double): Location = {
    this.id((country + ":" + area + ":" + city).toLowerCase())
    this.co(country)
    this.ar(area)
    this.ci(city)
    this.la(latitude)
    this.lo(longitude)
    this
  }

  object id extends StringField(this, 300) {
    override def name = "_id"
    override def defaultValue = ""
    override def shouldDisplay_? = false
  }

  def country: String = co.value
  def area: String = ar.value
  def city: String = ci.value
  def latitude: Double = la.value
  def longitude: Double = lo.value

  protected object co extends StringField(this, 100)
  protected object ar extends StringField(this, 100)
  protected object ci extends StringField(this, 100)

  protected object la extends DoubleField(this)
  protected object lo extends DoubleField(this)
}