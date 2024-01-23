package ui.models;

import lombok.*;
import ui.config.ConfigReader;

    @EqualsAndHashCode
    @ToString
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class User {
        private String userFirstName;
        private String lastName;
        private String userEmail;
        private String password;
        private String passwordConfirmation;
        private String userPermanentAddress;


        public User(ConfigReader.UserCredits syrgakFirstName, ConfigReader.UserCredits syrgakLastName, ConfigReader.UserCredits syrgakEmail, ConfigReader.UserCredits syrgakPassword, ConfigReader.UserCredits syrgakPassword1) {
        }
    }

