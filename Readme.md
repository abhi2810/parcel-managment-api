Parcel

Id int
name string
createdBy int
createdOn String
isFrom int
goingTo int
isDispatched boolean
isDelivered boolean


GET:
/parcel/
/parcel/{id}
/parcel/isFrom/{from}
/parcel/goingTo/{to}
/parcel/createdBy/{createdBy}
/parcel/createdOn/{createdOn}

POST:
/parcel/id

PUT:
/parcel/id

DELETE:
/parcel/id/{id}

