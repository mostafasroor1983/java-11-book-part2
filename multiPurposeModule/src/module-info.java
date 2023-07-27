module zoo.tours.hybrid {
    requires zoo.tours.api;
    provides zoo.tours.api.Tour with zoo.tours.hybrid.QuickTourImpl;
    uses zoo.tours.api.Tour;
}
//javac -p mods -d multiPurposeModule multiPurposeModule/src/zoo/tours/hybrid/*.java multiPurposeModule/src/module-info.java
//jar -cvf mods/zoo.tours.hybrid.jar -C multiPurposeModule/ .