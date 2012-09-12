lift-mongodb-record-calculated-id
=================================

I'm new to lift. I have MongoDB collection to store Location objects. Each object has the following fields:
- country (string)
- area (string)
- city (string)
- latitude (float)
- longitude (float)
The _id field is stored as a string: (country + ":" + area + ":" + city).toLowerCase().
Currently this is done manually. So the user of Location object needs to set city, area, country and _id.
I'm trying to find a way to change Location class so that the _id field is calculated automatically.
Please, point me to a direction how can this be done.
