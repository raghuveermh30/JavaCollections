package builderpattern;

public class Register {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNum;
    private final String password;
    private final String confirmPassword;

    public Register(RegisterBuilder registerBuilder) {
        this.firstName = registerBuilder.firstName;
        this.lastName = registerBuilder.lastName;
        this.email = registerBuilder.email;
        this.phoneNum = registerBuilder.phoneNum;
        this.password = registerBuilder.password;
        this.confirmPassword = registerBuilder.confirmPassword;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static class RegisterBuilder {

        private String firstName;
        private String lastName;
        private String email;
        private String phoneNum;
        private String password;
        private String confirmPassword;

        //Generate Setters
        public RegisterBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegisterBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegisterBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public RegisterBuilder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public RegisterBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public RegisterBuilder setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
            return this;
        }

        public Register build() {
            return new Register(this);
        }
    }
}
