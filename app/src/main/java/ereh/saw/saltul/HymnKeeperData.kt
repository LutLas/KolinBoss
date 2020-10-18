package ereh.saw.saltul

class HymnInfo(
     val author1:String,
     val author2:String?,
     val majorGroup:String,
     val no:String,
     val p1:String,
     val subGroup:String?,
     val title1:String,
     val title2:String?,
     val title3:String?,
     val title4:String?
)

class Hymn(
     var hymn: HymnInfo,
     var hymnNo:String
)