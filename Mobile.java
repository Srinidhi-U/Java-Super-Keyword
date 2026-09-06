class Mobile {
    String brand = "Samsung";

    Mobile() {
        this("iPhone");
    }

    Mobile(String brand) {
        this.brand = brand;
    }

    void show() {
        System.out.println("Mobile Brand: " + this.brand);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.thisShow();
    }

    void thisShow() {
        this.show();
    }
}
