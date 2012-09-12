import net.liftweb.mongodb.record._
import net.liftweb.mongodb.record.field._
import net.liftweb.record.field._

object Location extends Location with MongoMetaRecord[Location]

class Location private() extends MongoRecord[Location] with StringPk[Location] {
  def meta = Location

  override def defaultIdValue = (country.is + ":" + area.is + ":" + city.is).toLowerCase

  object country extends StringField(this, 100)
  object area extends StringField(this, 100)
  object city extends StringField(this, 100)

  object latitude extends DoubleField(this)
  object longitude extends DoubleField(this)
}
