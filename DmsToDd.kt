
fun DmsToDd() {
    val latitude = "6°21'53.29\"N"
    val longitude = "2°27'1.83\"W"
    
    var splitLattitude = latitude.split("°","'","\\","\"",)
    var splitLongitude = longitude.split("°","'","\\","\"",)
    
    print(splitLattitude)
    print("\n"+splitLongitude)
  
    var newLatitude = splitLattitude[0].toInt() + (((splitLattitude[1].toInt()*60) + splitLattitude[2].toFloat()) / 3600)
    
    var newLongitude = splitLongitude[0].toInt() + (((splitLongitude[1].toInt()*60) + splitLongitude[2].toFloat()) / 3600)
   
    if(splitLattitude[0] == "S")
    newLatitude = -newLatitude
    if(splitLongitude[0] == "W")
    newLongitude = newLongitude * ()
    
    print("\n"+newLatitude)
    print("\n"+newLongitude)
}
