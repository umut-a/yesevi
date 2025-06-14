// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: person/person.proto
// Protobuf Java Version: 4.31.1

package com.umut.yesevi.protobuf;

/**
 * Protobuf type {@code yesevi.PersonProtoArray}
 */
@com.google.protobuf.Generated
public final class PersonProtoArray extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:yesevi.PersonProtoArray)
    PersonProtoArrayOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      PersonProtoArray.class.getName());
  }
  // Use PersonProtoArray.newBuilder() to construct.
  private PersonProtoArray(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PersonProtoArray() {
    person_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umut.yesevi.protobuf.PersonProtos.internal_static_yesevi_PersonProtoArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umut.yesevi.protobuf.PersonProtos.internal_static_yesevi_PersonProtoArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umut.yesevi.protobuf.PersonProtoArray.class, com.umut.yesevi.protobuf.PersonProtoArray.Builder.class);
  }

  public static final int PERSON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.umut.yesevi.protobuf.PersonProto> person_;
  /**
   * <code>repeated .yesevi.PersonProto person = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.umut.yesevi.protobuf.PersonProto> getPersonList() {
    return person_;
  }
  /**
   * <code>repeated .yesevi.PersonProto person = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.umut.yesevi.protobuf.PersonProtoOrBuilder> 
      getPersonOrBuilderList() {
    return person_;
  }
  /**
   * <code>repeated .yesevi.PersonProto person = 1;</code>
   */
  @java.lang.Override
  public int getPersonCount() {
    return person_.size();
  }
  /**
   * <code>repeated .yesevi.PersonProto person = 1;</code>
   */
  @java.lang.Override
  public com.umut.yesevi.protobuf.PersonProto getPerson(int index) {
    return person_.get(index);
  }
  /**
   * <code>repeated .yesevi.PersonProto person = 1;</code>
   */
  @java.lang.Override
  public com.umut.yesevi.protobuf.PersonProtoOrBuilder getPersonOrBuilder(
      int index) {
    return person_.get(index);
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
    for (int i = 0; i < person_.size(); i++) {
      output.writeMessage(1, person_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < person_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, person_.get(i));
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
    if (!(obj instanceof com.umut.yesevi.protobuf.PersonProtoArray)) {
      return super.equals(obj);
    }
    com.umut.yesevi.protobuf.PersonProtoArray other = (com.umut.yesevi.protobuf.PersonProtoArray) obj;

    if (!getPersonList()
        .equals(other.getPersonList())) return false;
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
    if (getPersonCount() > 0) {
      hash = (37 * hash) + PERSON_FIELD_NUMBER;
      hash = (53 * hash) + getPersonList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umut.yesevi.protobuf.PersonProtoArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umut.yesevi.protobuf.PersonProtoArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.PersonProtoArray parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.umut.yesevi.protobuf.PersonProtoArray prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code yesevi.PersonProtoArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yesevi.PersonProtoArray)
      com.umut.yesevi.protobuf.PersonProtoArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umut.yesevi.protobuf.PersonProtos.internal_static_yesevi_PersonProtoArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umut.yesevi.protobuf.PersonProtos.internal_static_yesevi_PersonProtoArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umut.yesevi.protobuf.PersonProtoArray.class, com.umut.yesevi.protobuf.PersonProtoArray.Builder.class);
    }

    // Construct using com.umut.yesevi.protobuf.PersonProtoArray.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
      } else {
        person_ = null;
        personBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umut.yesevi.protobuf.PersonProtos.internal_static_yesevi_PersonProtoArray_descriptor;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.PersonProtoArray getDefaultInstanceForType() {
      return com.umut.yesevi.protobuf.PersonProtoArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.PersonProtoArray build() {
      com.umut.yesevi.protobuf.PersonProtoArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.PersonProtoArray buildPartial() {
      com.umut.yesevi.protobuf.PersonProtoArray result = new com.umut.yesevi.protobuf.PersonProtoArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.umut.yesevi.protobuf.PersonProtoArray result) {
      if (personBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          person_ = java.util.Collections.unmodifiableList(person_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
    }

    private void buildPartial0(com.umut.yesevi.protobuf.PersonProtoArray result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umut.yesevi.protobuf.PersonProtoArray) {
        return mergeFrom((com.umut.yesevi.protobuf.PersonProtoArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umut.yesevi.protobuf.PersonProtoArray other) {
      if (other == com.umut.yesevi.protobuf.PersonProtoArray.getDefaultInstance()) return this;
      if (personBuilder_ == null) {
        if (!other.person_.isEmpty()) {
          if (person_.isEmpty()) {
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonIsMutable();
            person_.addAll(other.person_);
          }
          onChanged();
        }
      } else {
        if (!other.person_.isEmpty()) {
          if (personBuilder_.isEmpty()) {
            personBuilder_.dispose();
            personBuilder_ = null;
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 internalGetPersonFieldBuilder() : null;
          } else {
            personBuilder_.addAllMessages(other.person_);
          }
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
            case 10: {
              com.umut.yesevi.protobuf.PersonProto m =
                  input.readMessage(
                      com.umut.yesevi.protobuf.PersonProto.parser(),
                      extensionRegistry);
              if (personBuilder_ == null) {
                ensurePersonIsMutable();
                person_.add(m);
              } else {
                personBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<com.umut.yesevi.protobuf.PersonProto> person_ =
      java.util.Collections.emptyList();
    private void ensurePersonIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        person_ = new java.util.ArrayList<com.umut.yesevi.protobuf.PersonProto>(person_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.umut.yesevi.protobuf.PersonProto, com.umut.yesevi.protobuf.PersonProto.Builder, com.umut.yesevi.protobuf.PersonProtoOrBuilder> personBuilder_;

    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public java.util.List<com.umut.yesevi.protobuf.PersonProto> getPersonList() {
      if (personBuilder_ == null) {
        return java.util.Collections.unmodifiableList(person_);
      } else {
        return personBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public int getPersonCount() {
      if (personBuilder_ == null) {
        return person_.size();
      } else {
        return personBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public com.umut.yesevi.protobuf.PersonProto getPerson(int index) {
      if (personBuilder_ == null) {
        return person_.get(index);
      } else {
        return personBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder setPerson(
        int index, com.umut.yesevi.protobuf.PersonProto value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.set(index, value);
        onChanged();
      } else {
        personBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder setPerson(
        int index, com.umut.yesevi.protobuf.PersonProto.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.set(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder addPerson(com.umut.yesevi.protobuf.PersonProto value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(value);
        onChanged();
      } else {
        personBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder addPerson(
        int index, com.umut.yesevi.protobuf.PersonProto value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(index, value);
        onChanged();
      } else {
        personBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder addPerson(
        com.umut.yesevi.protobuf.PersonProto.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder addPerson(
        int index, com.umut.yesevi.protobuf.PersonProto.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder addAllPerson(
        java.lang.Iterable<? extends com.umut.yesevi.protobuf.PersonProto> values) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, person_);
        onChanged();
      } else {
        personBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public Builder removePerson(int index) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.remove(index);
        onChanged();
      } else {
        personBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public com.umut.yesevi.protobuf.PersonProto.Builder getPersonBuilder(
        int index) {
      return internalGetPersonFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public com.umut.yesevi.protobuf.PersonProtoOrBuilder getPersonOrBuilder(
        int index) {
      if (personBuilder_ == null) {
        return person_.get(index);  } else {
        return personBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public java.util.List<? extends com.umut.yesevi.protobuf.PersonProtoOrBuilder> 
         getPersonOrBuilderList() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(person_);
      }
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public com.umut.yesevi.protobuf.PersonProto.Builder addPersonBuilder() {
      return internalGetPersonFieldBuilder().addBuilder(
          com.umut.yesevi.protobuf.PersonProto.getDefaultInstance());
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public com.umut.yesevi.protobuf.PersonProto.Builder addPersonBuilder(
        int index) {
      return internalGetPersonFieldBuilder().addBuilder(
          index, com.umut.yesevi.protobuf.PersonProto.getDefaultInstance());
    }
    /**
     * <code>repeated .yesevi.PersonProto person = 1;</code>
     */
    public java.util.List<com.umut.yesevi.protobuf.PersonProto.Builder> 
         getPersonBuilderList() {
      return internalGetPersonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.umut.yesevi.protobuf.PersonProto, com.umut.yesevi.protobuf.PersonProto.Builder, com.umut.yesevi.protobuf.PersonProtoOrBuilder> 
        internalGetPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.umut.yesevi.protobuf.PersonProto, com.umut.yesevi.protobuf.PersonProto.Builder, com.umut.yesevi.protobuf.PersonProtoOrBuilder>(
                person_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:yesevi.PersonProtoArray)
  }

  // @@protoc_insertion_point(class_scope:yesevi.PersonProtoArray)
  private static final com.umut.yesevi.protobuf.PersonProtoArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umut.yesevi.protobuf.PersonProtoArray();
  }

  public static com.umut.yesevi.protobuf.PersonProtoArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonProtoArray>
      PARSER = new com.google.protobuf.AbstractParser<PersonProtoArray>() {
    @java.lang.Override
    public PersonProtoArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersonProtoArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonProtoArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umut.yesevi.protobuf.PersonProtoArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

