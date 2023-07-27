// module-info.java
module zoo.butterfly {
    exports zoo.butterfly;

    // circular dependencies
    //requires zoo.caterpillar;
}

//javac -d butterflyModule butterflyModule/src/zoo/butterfly/Butterfly.java butterflyModule/src/module-info.java