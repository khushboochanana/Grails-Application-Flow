package grailsapplicationflow


class DemoController {
    def beforeInterceptor = {
        println "In Before Interceptor"
    }

    def index() {
        println "In Controller Demo Action"
    }

    def afterInterceptor = { model ->
        println "In After InterCeptor"
    }

}

