package ereh.saw.saltul

class DataManager {
    private val hymnsMap = HashMap<String, HymnInfo>()
    val hymns = ArrayList<Hymn>()

    init {
        initializeHymns()
    }

    private fun initializeHymns(){
        var hymn = HymnInfo(
            "Martin Lurther (1483-1546)",
            "trs Frederick Henry Hedge (1805-90)",
            "God the Father",
            "1",
            "A MIGHTY fortress is our God,",
            "Person and praise",
            "Ein' Feste Burg, 640",
            null,
            null,
            null
        )

        hymnsMap.set(hymn.no,hymn)
    }
}