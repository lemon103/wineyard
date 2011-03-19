package wineyard

class Wine {
    String name, description
    String lat, lon

    static hasMany = [recommendation:Recommendation]

    def String toString() { name }

    static constraints = {
        name(nullable:false, blank:false, unique:true)
        description(nullable:true, blank:true)
        lat(nullable:false, blank:false, unique:true)
        lon(nullable:false, blank:false, unique:true)
    }
}
