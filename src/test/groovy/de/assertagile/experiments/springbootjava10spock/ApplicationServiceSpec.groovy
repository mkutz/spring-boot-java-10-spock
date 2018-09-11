package de.assertagile.experiments.springbootjava10spock


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class ApplicationServiceSpec extends Specification {

    @Autowired
    ApplicationContext context

    def "context loads"() {
        expect:
        context != null
    }

}
