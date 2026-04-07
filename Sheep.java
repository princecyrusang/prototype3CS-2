class Sheep implements Animal {
    private Integer legs = 4;
    private String sound = "Baaa";
    private String food = "Grass";
    private String name;

    public Sheep(String name) { this.name = name; }

    @Override
    public Animal clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void makeSound() { System.out.println(name + " says: " + sound); }

    @Override
    public String getType() { return "Sheep"; }
}