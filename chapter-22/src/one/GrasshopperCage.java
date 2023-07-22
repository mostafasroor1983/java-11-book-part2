package one;

public class GrasshopperCage {
    //The hacker can her use object of EvilComboLocks instead of object of ComboLocks1
    public static void openLock(ComboLocks1 comboLocks, String combo) {
        if (comboLocks.isComboValid("grasshopper", combo))
            System.out.println("Open!");
    }
}


//Hacker Harry is hard at work and has created this subclass of ComboLocks1.
//Hacker Harry can check whether the password is valid and email himself all the valid passwords.
class EvilComboLocks extends ComboLocks1 {
    public boolean isComboValid(String animal, String combo) {
        var valid = super.isComboValid(animal, combo);
        if (valid) {
            // email the password to Hacker Harry
        }
        return valid;
    }
}

// Luckily, there is an easy way to prevent this problem.
// Marking a sensitive class as final prevents any subclasses.
// Make ComboLocks1 as final to prevent the extensibility.