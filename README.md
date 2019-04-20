
	grails create-app numberbug
	cd numberbug
	grails
	create-domain-class Bug
	# add 1 properties to Bug.groovy     int num = 123456789
	generate-all numberbug.Bug 
	# create 1 Bug in BootStrap.groovy 	 Bug.withTransaction { new Bug().save(flush:true) }
	grails run-app


Try and view num in Safari or Chrome:
http://localhost:8080/bug/edit/1

Notice that the field is red and unpopulated.

This is because it is rendering

	<input type="number" name="num" value="123,456,789" required="" id="num">

Which is not valid markup for a input with type number.

Work arounds attempted:

Creating a PropertyEditor - Does not work for Edit page.


Creating a fields override gsp for long and int _displayWidget.gsp & _displayWidget.gsp - Does not work for the Edit page.


I would imagine a bug like this would be very confusing for a new user to Grails as extremely basic functionality such as editing a number does not work out of the box.

The default behaviour should be to not put commas in numbers do to the fact it breaks everything.
