package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,@SerializedName("formatted_address") val address:String)

data class Location(val lng: String, val lat:String)

/*{"status":"ok","query":"北京",
"places":[
{"name":"北京市","location":{"lat":39.9041999,"lng":116.4073963},
"formatted_address":"中国北京市"},
{"name":"北京西站","location":{"lat":39.89491,"lng":116.322056},
"formatted_address":"中国 北京市 丰台区 莲花池东路118号"},
{"name":"北京南站","location":{"lat":39.865195,"lng":116.378545},
"formatted_address":"中国 北京市 丰台区 永外大街车站路12号"},
{"name":"北京站(地铁站)","location":{"lat":39.904983,"lng":116.427287},
"formatted_address":"中国 北京市 东城区 2号线"}
]} */