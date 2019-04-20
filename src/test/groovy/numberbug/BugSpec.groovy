package numberbug

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BugSpec extends Specification implements DomainUnitTest<Bug> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
