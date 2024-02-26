interface Character {
    void introduceYourself();
}

class Warrior implements Character {
    @Override
    public void introduceYourself() {
        System.out.println("Hello Im Warrior");
    }
}

class Mage implements Character {
    @Override
    public void introduceYourself() {
        System.out.println("Hello Im Mage");
    }
}

class CharacterFactory {
    public Character createCharacter(String characterType) {
        if (characterType == null) {
            return null;
        }
        if (characterType.equalsIgnoreCase("WARRIOR")) {
            return new Warrior();
        } else if (characterType.equalsIgnoreCase("MAGE")) {
            return new Mage();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character character1 = characterFactory.createCharacter("WARRIOR");
        Character character2 = characterFactory.createCharacter("MAGE");

        character1.introduceYourself();
        character2.introduceYourself();
    }
}
