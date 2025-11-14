public class W11Prac2 {
    static void printNameAndVocalization(IAnimal animal) {
        System.out.println("Species: "+ animal.getSpecies());
        System.out.println("Vocalization: "+ animal.getSound());
    }

    public static void main(String[] args) {

        IAnimal[] animals = {new Pig(), new Cow(), new Chinchillas(), new GuineaPigs(), new Hamster(), new Hare()};
        for (IAnimal animal : animals) {
            printNameAndVocalization(animal);
        }
    }
}

interface IAnimal {
    public String getSpecies();
    default public String getSound() {
        return "squeak";
    }

}

class Pig implements IAnimal {
    public String getSpecies() {
        return "pig";
    }
    public String getSound() {
        return "oink";
    }
}

class Cow implements IAnimal {
    public String getSpecies() {
        return "cow";
    }
    public String getSound() {
        return "moo";
    }
}

class Chinchillas implements IAnimal {
    public String getSpecies() {
        return "Chinchillas";
    }
}
class GuineaPigs implements IAnimal {
    public String getSpecies() {
        return "Guinea Pigs";
    }
}
class Hamster implements IAnimal {
    public String getSpecies() {
        return "Hamster";
    }
}
class Hare implements IAnimal {
    public String getSpecies() {
        return "Hare";
    }
}