package ru.sbt.ss.comparison.dto;

import java.util.Objects;

public class MessageFromClient {

    private int id;
    private String source;
    private Data data;

    public static class Data {

        private String firstName;
        private String lastName;
        private String email;

        public Data(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
        public Data() {}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Data)) return false;
            Data data = (Data) o;
            return firstName.equals(data.firstName) && lastName.equals(data.lastName) && Objects.equals(email, data.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, email);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }
    }

    public MessageFromClient(int id, String source, Data data) {
        this.id = id;
        this.source = source;
        this.data = data;
    }

    public MessageFromClient() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageFromClient)) return false;
        MessageFromClient that = (MessageFromClient) o;
        return id == that.id && source.equals(that.source) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, data);
    }

    public int getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public Data getData() {
        return data;
    }
}
