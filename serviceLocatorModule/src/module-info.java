module zoo.tours.reservations {
    exports zoo.tours.reservations;
    requires zoo.tours.api;
    uses zoo.tours.api.Tour;
}

//javac -p mods -d serviceLocatorModule serviceLocatorModule/src/zoo/tours/reservations/*.java serviceLocatorModule/src/module-info.java
//jar -cvf mods/zoo.tours.reservations.jar -C serviceLocatorModule/ .