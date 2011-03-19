package wineyard

class Recommendation {

    static belongsTo = [wine:Wine,expert:Expert]

    static constraints = {
    }
}
