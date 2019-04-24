
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

Bug 2 - @BindingFormat not working

As Documented Here:
http://docs.grails.org/latest/guide/theWebLayer.html#dataBinding

in the section "Custom Formatted Converters"

Setup:

	1. Create FormattedStringValueConverter.groovy with code provided in documentation.
	
	2. Update grails-app/conf/spring/resources.groovy according to documentation
	
	3. Create Person.groovy with code provided in documentation.
	
	4. Create a sample Person object in BootStrap.groovy to demonstrate converter.
	
	5. run-app and visit http://localhost:8080/person/index

http://localhost:8080/person/index
