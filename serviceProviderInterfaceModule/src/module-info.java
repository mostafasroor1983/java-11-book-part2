
module zoo.tours.api {
    exports zoo.tours.api;
}

//javac -d serviceProviderInterfaceModule serviceProviderInterfaceModule/src/zoo/tours/api/*.java serviceProviderInterfaceModule/src/module-info.java

//jar -cvf mods/zoo.tours.api.jar -C serviceProviderInterfaceModule/ .