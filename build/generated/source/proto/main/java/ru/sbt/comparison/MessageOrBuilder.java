// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

// Protobuf Java Version: 3.25.1
package ru.sbt.comparison;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ru.sbt.comparison.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string source = 2;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string source = 2;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>string first_name = 3;</code>
   * @return Whether the firstName field is set.
   */
  boolean hasFirstName();
  /**
   * <code>string first_name = 3;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 3;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 4;</code>
   * @return Whether the lastName field is set.
   */
  boolean hasLastName();
  /**
   * <code>string last_name = 4;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 4;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 5;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>string email = 5;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 5;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  ru.sbt.comparison.Message.DataCase getDataCase();
}
