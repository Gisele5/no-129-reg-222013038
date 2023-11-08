// Class Districts
class Districts {
    public void methodDistricts() {
        System.out.println("Method from Class Districts");
    }
}

// Class Muhanga
class Muhanga {
    public void methodMuhanga() {
        System.out.println("Method from Class Muhanga");
    }
}

// Class Ruhango
class Ruhango {
    public void methodRuhango() {
        System.out.println("Method from Class Ruhango");
    }
}

// Class Musanze
class Musanze {
    public void methodMusanze() {
        System.out.println("Method from Class Musanze");
    }
}

// Class Huye
class Huye {
    public void methodHuye() {
        System.out.println("Method from Class Huye");
    }
}

// Cars class to create objects and call methods from Districts, Muhanga, Ruhango, Musanze, and Huye
class Cars {
    public static void main(String[] args) {
        Districts objDistricts = new Districts();
        Muhanga objMuhanga = new Muhanga();
        Ruhango objRuhango = new Ruhango();
        Musanze objMusanze = new Musanze();
        Huye objHuye = new Huye();

        // Calling methods from each class
        objDistricts.methodDistricts();
        objMuhanga.methodMuhanga();
        objRuhango.methodRuhango();
        objMusanze.methodMusanze();
        objHuye.methodHuye();
    }
}
