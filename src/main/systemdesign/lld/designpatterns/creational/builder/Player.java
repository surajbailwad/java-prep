package main.systemdesign.lld.designpatterns.creational.builder;

public class Player {

    private String name;
    private String address;
    private String email;
    private int age;

    public Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static class PlayerBuilder {
        private String name;
        private String address;
        private String email;
        private int age;

        public PlayerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PlayerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PlayerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Player build() {
            return new Player(this);
        }


    }
}
