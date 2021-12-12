module zoo.animal.talks {
   // exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    // no need to required feeding after requires transitive for zoo.animal.care
    //requires zoo.animal.feeding;
    //requires zoo.animal.care;
    requires transitive zoo.animal.care;
}
