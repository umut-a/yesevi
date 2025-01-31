// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: employee.proto
// Protobuf Java Version: 4.27.0

package com.umut.yesevi.protobuf;

/**
 * Protobuf type {@code yesevi.EmployeeArray}
 */
public final class EmployeeArray extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:yesevi.EmployeeArray)
    EmployeeArrayOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      EmployeeArray.class.getName());
  }
  // Use EmployeeArray.newBuilder() to construct.
  private EmployeeArray(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EmployeeArray() {
    employee_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeeArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeeArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umut.yesevi.protobuf.EmployeeArray.class, com.umut.yesevi.protobuf.EmployeeArray.Builder.class);
  }

  public static final int EMPLOYEE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.umut.yesevi.protobuf.EmployeePro> employee_;
  /**
   * <code>repeated .yesevi.EmployeePro employee = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.umut.yesevi.protobuf.EmployeePro> getEmployeeList() {
    return employee_;
  }
  /**
   * <code>repeated .yesevi.EmployeePro employee = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.umut.yesevi.protobuf.EmployeeProOrBuilder> 
      getEmployeeOrBuilderList() {
    return employee_;
  }
  /**
   * <code>repeated .yesevi.EmployeePro employee = 1;</code>
   */
  @java.lang.Override
  public int getEmployeeCount() {
    return employee_.size();
  }
  /**
   * <code>repeated .yesevi.EmployeePro employee = 1;</code>
   */
  @java.lang.Override
  public com.umut.yesevi.protobuf.EmployeePro getEmployee(int index) {
    return employee_.get(index);
  }
  /**
   * <code>repeated .yesevi.EmployeePro employee = 1;</code>
   */
  @java.lang.Override
  public com.umut.yesevi.protobuf.EmployeeProOrBuilder getEmployeeOrBuilder(
      int index) {
    return employee_.get(index);
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
    for (int i = 0; i < employee_.size(); i++) {
      output.writeMessage(1, employee_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < employee_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, employee_.get(i));
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
    if (!(obj instanceof com.umut.yesevi.protobuf.EmployeeArray)) {
      return super.equals(obj);
    }
    com.umut.yesevi.protobuf.EmployeeArray other = (com.umut.yesevi.protobuf.EmployeeArray) obj;

    if (!getEmployeeList()
        .equals(other.getEmployeeList())) return false;
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
    if (getEmployeeCount() > 0) {
      hash = (37 * hash) + EMPLOYEE_FIELD_NUMBER;
      hash = (53 * hash) + getEmployeeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umut.yesevi.protobuf.EmployeeArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umut.yesevi.protobuf.EmployeeArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.EmployeeArray parseFrom(
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
  public static Builder newBuilder(com.umut.yesevi.protobuf.EmployeeArray prototype) {
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
   * Protobuf type {@code yesevi.EmployeeArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yesevi.EmployeeArray)
      com.umut.yesevi.protobuf.EmployeeArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeeArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeeArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umut.yesevi.protobuf.EmployeeArray.class, com.umut.yesevi.protobuf.EmployeeArray.Builder.class);
    }

    // Construct using com.umut.yesevi.protobuf.EmployeeArray.newBuilder()
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
      if (employeeBuilder_ == null) {
        employee_ = java.util.Collections.emptyList();
      } else {
        employee_ = null;
        employeeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeeArray_descriptor;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeeArray getDefaultInstanceForType() {
      return com.umut.yesevi.protobuf.EmployeeArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeeArray build() {
      com.umut.yesevi.protobuf.EmployeeArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeeArray buildPartial() {
      com.umut.yesevi.protobuf.EmployeeArray result = new com.umut.yesevi.protobuf.EmployeeArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.umut.yesevi.protobuf.EmployeeArray result) {
      if (employeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          employee_ = java.util.Collections.unmodifiableList(employee_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.employee_ = employee_;
      } else {
        result.employee_ = employeeBuilder_.build();
      }
    }

    private void buildPartial0(com.umut.yesevi.protobuf.EmployeeArray result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umut.yesevi.protobuf.EmployeeArray) {
        return mergeFrom((com.umut.yesevi.protobuf.EmployeeArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umut.yesevi.protobuf.EmployeeArray other) {
      if (other == com.umut.yesevi.protobuf.EmployeeArray.getDefaultInstance()) return this;
      if (employeeBuilder_ == null) {
        if (!other.employee_.isEmpty()) {
          if (employee_.isEmpty()) {
            employee_ = other.employee_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEmployeeIsMutable();
            employee_.addAll(other.employee_);
          }
          onChanged();
        }
      } else {
        if (!other.employee_.isEmpty()) {
          if (employeeBuilder_.isEmpty()) {
            employeeBuilder_.dispose();
            employeeBuilder_ = null;
            employee_ = other.employee_;
            bitField0_ = (bitField0_ & ~0x00000001);
            employeeBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEmployeeFieldBuilder() : null;
          } else {
            employeeBuilder_.addAllMessages(other.employee_);
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
              com.umut.yesevi.protobuf.EmployeePro m =
                  input.readMessage(
                      com.umut.yesevi.protobuf.EmployeePro.parser(),
                      extensionRegistry);
              if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                employee_.add(m);
              } else {
                employeeBuilder_.addMessage(m);
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

    private java.util.List<com.umut.yesevi.protobuf.EmployeePro> employee_ =
      java.util.Collections.emptyList();
    private void ensureEmployeeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        employee_ = new java.util.ArrayList<com.umut.yesevi.protobuf.EmployeePro>(employee_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.umut.yesevi.protobuf.EmployeePro, com.umut.yesevi.protobuf.EmployeePro.Builder, com.umut.yesevi.protobuf.EmployeeProOrBuilder> employeeBuilder_;

    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public java.util.List<com.umut.yesevi.protobuf.EmployeePro> getEmployeeList() {
      if (employeeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(employee_);
      } else {
        return employeeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public int getEmployeeCount() {
      if (employeeBuilder_ == null) {
        return employee_.size();
      } else {
        return employeeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public com.umut.yesevi.protobuf.EmployeePro getEmployee(int index) {
      if (employeeBuilder_ == null) {
        return employee_.get(index);
      } else {
        return employeeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder setEmployee(
        int index, com.umut.yesevi.protobuf.EmployeePro value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.set(index, value);
        onChanged();
      } else {
        employeeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder setEmployee(
        int index, com.umut.yesevi.protobuf.EmployeePro.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.set(index, builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder addEmployee(com.umut.yesevi.protobuf.EmployeePro value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.add(value);
        onChanged();
      } else {
        employeeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder addEmployee(
        int index, com.umut.yesevi.protobuf.EmployeePro value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmployeeIsMutable();
        employee_.add(index, value);
        onChanged();
      } else {
        employeeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder addEmployee(
        com.umut.yesevi.protobuf.EmployeePro.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.add(builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder addEmployee(
        int index, com.umut.yesevi.protobuf.EmployeePro.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.add(index, builderForValue.build());
        onChanged();
      } else {
        employeeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder addAllEmployee(
        java.lang.Iterable<? extends com.umut.yesevi.protobuf.EmployeePro> values) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, employee_);
        onChanged();
      } else {
        employeeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder clearEmployee() {
      if (employeeBuilder_ == null) {
        employee_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        employeeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public Builder removeEmployee(int index) {
      if (employeeBuilder_ == null) {
        ensureEmployeeIsMutable();
        employee_.remove(index);
        onChanged();
      } else {
        employeeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public com.umut.yesevi.protobuf.EmployeePro.Builder getEmployeeBuilder(
        int index) {
      return getEmployeeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public com.umut.yesevi.protobuf.EmployeeProOrBuilder getEmployeeOrBuilder(
        int index) {
      if (employeeBuilder_ == null) {
        return employee_.get(index);  } else {
        return employeeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public java.util.List<? extends com.umut.yesevi.protobuf.EmployeeProOrBuilder> 
         getEmployeeOrBuilderList() {
      if (employeeBuilder_ != null) {
        return employeeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(employee_);
      }
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public com.umut.yesevi.protobuf.EmployeePro.Builder addEmployeeBuilder() {
      return getEmployeeFieldBuilder().addBuilder(
          com.umut.yesevi.protobuf.EmployeePro.getDefaultInstance());
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public com.umut.yesevi.protobuf.EmployeePro.Builder addEmployeeBuilder(
        int index) {
      return getEmployeeFieldBuilder().addBuilder(
          index, com.umut.yesevi.protobuf.EmployeePro.getDefaultInstance());
    }
    /**
     * <code>repeated .yesevi.EmployeePro employee = 1;</code>
     */
    public java.util.List<com.umut.yesevi.protobuf.EmployeePro.Builder> 
         getEmployeeBuilderList() {
      return getEmployeeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.umut.yesevi.protobuf.EmployeePro, com.umut.yesevi.protobuf.EmployeePro.Builder, com.umut.yesevi.protobuf.EmployeeProOrBuilder> 
        getEmployeeFieldBuilder() {
      if (employeeBuilder_ == null) {
        employeeBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.umut.yesevi.protobuf.EmployeePro, com.umut.yesevi.protobuf.EmployeePro.Builder, com.umut.yesevi.protobuf.EmployeeProOrBuilder>(
                employee_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        employee_ = null;
      }
      return employeeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:yesevi.EmployeeArray)
  }

  // @@protoc_insertion_point(class_scope:yesevi.EmployeeArray)
  private static final com.umut.yesevi.protobuf.EmployeeArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umut.yesevi.protobuf.EmployeeArray();
  }

  public static com.umut.yesevi.protobuf.EmployeeArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployeeArray>
      PARSER = new com.google.protobuf.AbstractParser<EmployeeArray>() {
    @java.lang.Override
    public EmployeeArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmployeeArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmployeeArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umut.yesevi.protobuf.EmployeeArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

