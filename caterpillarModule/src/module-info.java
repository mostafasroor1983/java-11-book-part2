module zoo.caterpillar {
    requires zoo.butterfly;
}

//javac -p mods -d caterpillarModule caterpillarModule/src/zoo/caterpillar/*.java caterpillarModule/src/module-info.java
//jar -cvf mods/zoo.caterpillar.jar -C caterpillarModule/ .