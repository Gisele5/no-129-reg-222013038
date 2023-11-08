class MathBook {
    public void mathContent() {
        System.out.println("Math content from MathBook");
    }
}

class ComputerBook {
    public void computerContent() {
        System.out.println("Computer content from ComputerBook");
    }
}

class EconomicBook {
    public void economicContent() {
        System.out.println("Economic content from EconomicBook");
    }
}

class EnglishBook {
    public void englishContent() {
        System.out.println("English content from EnglishBook");
    }
}

class Library {
    public static void main(String[] args) {
        MathBook mathbook = new MathBook();
        ComputerBook computerbook = new ComputerBook();
        EconomicBook economicbook = new EconomicBook();
        EnglishBook englishbook = new EnglishBook();

        mathbook.mathContent();
        computerbook.computerContent();
        economicbook.economicContent();
        englishbook.englishContent();
    }
}