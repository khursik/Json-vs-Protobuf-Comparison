// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

// Protobuf Java Version: 3.25.1
package ru.sbt.comparison;

/**
 * Protobuf type {@code ru.sbt.comparison.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ru.sbt.comparison.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    source_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.sbt.comparison.MessageOuterClass.internal_static_ru_sbt_comparison_Message_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.sbt.comparison.MessageOuterClass.internal_static_ru_sbt_comparison_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.sbt.comparison.Message.class, ru.sbt.comparison.Message.Builder.class);
  }

  private int dataCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FIRST_NAME(3),
    LAST_NAME(4),
    EMAIL(5),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 3: return FIRST_NAME;
        case 4: return LAST_NAME;
        case 5: return EMAIL;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_ = 0;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int SOURCE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object source_ = "";
  /**
   * <code>string source = 2;</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>string source = 2;</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_NAME_FIELD_NUMBER = 3;
  /**
   * <code>string first_name = 3;</code>
   * @return Whether the firstName field is set.
   */
  public boolean hasFirstName() {
    return dataCase_ == 3;
  }
  /**
   * <code>string first_name = 3;</code>
   * @return The firstName.
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = "";
    if (dataCase_ == 3) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataCase_ == 3) {
        data_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string first_name = 3;</code>
   * @return The bytes for firstName.
   */
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = "";
    if (dataCase_ == 3) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataCase_ == 3) {
        data_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_NAME_FIELD_NUMBER = 4;
  /**
   * <code>string last_name = 4;</code>
   * @return Whether the lastName field is set.
   */
  public boolean hasLastName() {
    return dataCase_ == 4;
  }
  /**
   * <code>string last_name = 4;</code>
   * @return The lastName.
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = "";
    if (dataCase_ == 4) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataCase_ == 4) {
        data_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string last_name = 4;</code>
   * @return The bytes for lastName.
   */
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = "";
    if (dataCase_ == 4) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataCase_ == 4) {
        data_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 5;
  /**
   * <code>string email = 5;</code>
   * @return Whether the email field is set.
   */
  public boolean hasEmail() {
    return dataCase_ == 5;
  }
  /**
   * <code>string email = 5;</code>
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (dataCase_ == 5) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataCase_ == 5) {
        data_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string email = 5;</code>
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = "";
    if (dataCase_ == 5) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataCase_ == 5) {
        data_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    if (dataCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, data_);
    }
    if (dataCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, data_);
    }
    if (dataCase_ == 5) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
    }
    if (dataCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, data_);
    }
    if (dataCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, data_);
    }
    if (dataCase_ == 5) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, data_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.sbt.comparison.Message)) {
      return super.equals(obj);
    }
    ru.sbt.comparison.Message other = (ru.sbt.comparison.Message) obj;

    if (getId()
        != other.getId()) return false;
    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 3:
        if (!getFirstName()
            .equals(other.getFirstName())) return false;
        break;
      case 4:
        if (!getLastName()
            .equals(other.getLastName())) return false;
        break;
      case 5:
        if (!getEmail()
            .equals(other.getEmail())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    switch (dataCase_) {
      case 3:
        hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getFirstName().hashCode();
        break;
      case 4:
        hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getLastName().hashCode();
        break;
      case 5:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.sbt.comparison.Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sbt.comparison.Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sbt.comparison.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sbt.comparison.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sbt.comparison.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sbt.comparison.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sbt.comparison.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sbt.comparison.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.sbt.comparison.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.sbt.comparison.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.sbt.comparison.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sbt.comparison.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.sbt.comparison.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ru.sbt.comparison.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ru.sbt.comparison.Message)
      ru.sbt.comparison.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.sbt.comparison.MessageOuterClass.internal_static_ru_sbt_comparison_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.sbt.comparison.MessageOuterClass.internal_static_ru_sbt_comparison_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.sbt.comparison.Message.class, ru.sbt.comparison.Message.Builder.class);
    }

    // Construct using ru.sbt.comparison.Message.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0;
      source_ = "";
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.sbt.comparison.MessageOuterClass.internal_static_ru_sbt_comparison_Message_descriptor;
    }

    @java.lang.Override
    public ru.sbt.comparison.Message getDefaultInstanceForType() {
      return ru.sbt.comparison.Message.getDefaultInstance();
    }

    @java.lang.Override
    public ru.sbt.comparison.Message build() {
      ru.sbt.comparison.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.sbt.comparison.Message buildPartial() {
      ru.sbt.comparison.Message result = new ru.sbt.comparison.Message(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ru.sbt.comparison.Message result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.source_ = source_;
      }
    }

    private void buildPartialOneofs(ru.sbt.comparison.Message result) {
      result.dataCase_ = dataCase_;
      result.data_ = this.data_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.sbt.comparison.Message) {
        return mergeFrom((ru.sbt.comparison.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.sbt.comparison.Message other) {
      if (other == ru.sbt.comparison.Message.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getDataCase()) {
        case FIRST_NAME: {
          dataCase_ = 3;
          data_ = other.data_;
          onChanged();
          break;
        }
        case LAST_NAME: {
          dataCase_ = 4;
          data_ = other.data_;
          onChanged();
          break;
        }
        case EMAIL: {
          dataCase_ = 5;
          data_ = other.data_;
          onChanged();
          break;
        }
        case DATA_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              source_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              dataCase_ = 3;
              data_ = s;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              dataCase_ = 4;
              data_ = s;
              break;
            } // case 34
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              dataCase_ = 5;
              data_ = s;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <code>string source = 2;</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source = 2;</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source = 2;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      source_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string source = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      source_ = getDefaultInstance().getSource();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string source = 2;</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      source_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>string first_name = 3;</code>
     * @return Whether the firstName field is set.
     */
    @java.lang.Override
    public boolean hasFirstName() {
      return dataCase_ == 3;
    }
    /**
     * <code>string first_name = 3;</code>
     * @return The firstName.
     */
    @java.lang.Override
    public java.lang.String getFirstName() {
      java.lang.Object ref = "";
      if (dataCase_ == 3) {
        ref = data_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataCase_ == 3) {
          data_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string first_name = 3;</code>
     * @return The bytes for firstName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = "";
      if (dataCase_ == 3) {
        ref = data_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataCase_ == 3) {
          data_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string first_name = 3;</code>
     * @param value The firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataCase_ = 3;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string first_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstName() {
      if (dataCase_ == 3) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string first_name = 3;</code>
     * @param value The bytes for firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataCase_ = 3;
      data_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string last_name = 4;</code>
     * @return Whether the lastName field is set.
     */
    @java.lang.Override
    public boolean hasLastName() {
      return dataCase_ == 4;
    }
    /**
     * <code>string last_name = 4;</code>
     * @return The lastName.
     */
    @java.lang.Override
    public java.lang.String getLastName() {
      java.lang.Object ref = "";
      if (dataCase_ == 4) {
        ref = data_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataCase_ == 4) {
          data_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string last_name = 4;</code>
     * @return The bytes for lastName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = "";
      if (dataCase_ == 4) {
        ref = data_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataCase_ == 4) {
          data_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string last_name = 4;</code>
     * @param value The lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataCase_ = 4;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string last_name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastName() {
      if (dataCase_ == 4) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string last_name = 4;</code>
     * @param value The bytes for lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataCase_ = 4;
      data_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string email = 5;</code>
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return dataCase_ == 5;
    }
    /**
     * <code>string email = 5;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (dataCase_ == 5) {
        ref = data_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataCase_ == 5) {
          data_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = "";
      if (dataCase_ == 5) {
        ref = data_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataCase_ == 5) {
          data_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataCase_ = 5;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      if (dataCase_ == 5) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataCase_ = 5;
      data_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ru.sbt.comparison.Message)
  }

  // @@protoc_insertion_point(class_scope:ru.sbt.comparison.Message)
  private static final ru.sbt.comparison.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.sbt.comparison.Message();
  }

  public static ru.sbt.comparison.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @java.lang.Override
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.sbt.comparison.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
