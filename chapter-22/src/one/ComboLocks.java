package one;

import java.util.Map;

public class ComboLocks {
    //This is terrible because the combos object has public access.
    //This is also poor encapsulation. A key security principle is to
    //limit access as much as possible.
    public Map<String, String> combos;
}


//It would be better to make the combos object private and write a method to provide the
//necessary functionality.
/*final*/ class ComboLocks1 {
    //This is far better; we don't expose the combinations map to any
    //classes outside the ComboLocks class.
    private Map<String, String> combos;

    public boolean isComboValid(String animal, String combo) {
        var correctCombo = combos.get(animal);
        return combo.equals(correctCombo);
    }
}