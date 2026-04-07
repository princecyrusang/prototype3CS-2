class Cow implements Animal {
    private Integer legs = 4;
    private String sound = "Moo";
    private String food = "Grass";

    @Override
    public Animal clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void makeSound() { System.out.println("Cow says: " + sound); }

    @Override
    public String getType() { return "Cow"; }
}