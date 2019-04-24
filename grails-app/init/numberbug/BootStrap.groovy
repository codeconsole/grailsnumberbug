package numberbug

class BootStrap {

    def init = { servletContext ->
    	Bug.withTransaction { new Bug().save(flush:true) }
    	Person.withTransaction { new Person(someUpperCaseString:'TeSt', someLowerCaseString:'TeSt', someOtherString:'TeSt').save(flush:true) }
    }
    def destroy = {
    }
}
