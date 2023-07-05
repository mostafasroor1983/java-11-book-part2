package overridden;

class CanNotHopException extends Exception {
}

class Hopper {
    public void hop() {
    }

    public void hop1() throws CanNotHopException {
    }

    public void hop2() throws Exception {
    }
}

class Bunny extends Hopper {
    // you can't add new checked exception or border checked exception in the overridden method.
    // just we can delete checked exception,
    // add a new unchecked exception or narrower checked exception in the overridden method.
    // public void hop() throws CanNotHopException { } // DOES NOT COMPILE

    // exception can be deleted in the overridden method
    public void hop1() {
    }

    // narrower exception is allowed in the overridden method
    public void hop2() throws CanNotHopException {
    }
}