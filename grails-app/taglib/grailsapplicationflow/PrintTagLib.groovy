package grailsapplicationflow

class PrintTagLib {
    static defaultEncodeAs = [taglib: 'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def print = { attr, body ->

        println("from TAGLIB")
    }
}
