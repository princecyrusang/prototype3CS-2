class Horse implements Animal {
    private Integer legs = 4;
    private String sound = "Neigh";
    private String food = "Hay";
    private String color = "Brown";

    @Override
    public Animal clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void makeSound() { System.out.println("Horse says: " + sound); }

    @Override
    public String getType() { return "Horse"; }
}