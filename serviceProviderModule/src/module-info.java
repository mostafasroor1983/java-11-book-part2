module zoo.tours.agency {
    requires zoo.tours.api;
    //We don't export the package that implements the interface since we don't want callers referring
    //to it directly. Instead, we use the provides directive.
    //This allows us to specify that we provide an implementation of the
    //interface with a specific implementation class.
    provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
}


//javac -p mods -d serviceProviderModule serviceProviderModule/src/zoo/tours/agency/*.java serviceProviderModule/src/module-info.java
//jar -cvf mods/zoo.tours.agency.jar -C serviceProviderModule/ .
//java -p mods -m zoo.visitor/zoo.visitor.Tourist