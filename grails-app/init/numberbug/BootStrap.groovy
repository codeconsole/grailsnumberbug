package numberbug

class BootStrap {

    def init = { servletContext ->
    	Bug.withTransaction { new Bug().save(flush:true) }
    }
    def destroy = {
    }
}
