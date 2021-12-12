module zoo.staff {

    // this module doesn't export any package outside
    //requires zoo.animal.feeding;
    //requires zoo.animal.care;
    requires transitive zoo.animal.talks;
}