package grailsapplicationflow

class ApplicationFilterFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                println("In Before From Filter")

            }
            after = { Map model ->
                println("In After  From Filter")
            }
            afterView = { Exception e ->
                println("In After View From  Filter")
            }
        }
    }
}
