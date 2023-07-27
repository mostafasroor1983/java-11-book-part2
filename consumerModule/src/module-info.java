module zoo.visitor {
    requires zoo.tours.api;
    requires zoo.tours.reservations;
}

//javac -p mods -d consumerModule consumerModule/src/zoo/visitor/*.java consumerModule/src/module-info.java
//jar -cvf mods/zoo.visitor.jar -C consumerModule/ .
//java -p mods -m zoo.visitor/zoo.visitor.Tourist