// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: employee.proto
// Protobuf Java Version: 4.27.0

package com.umut.yesevi.protobuf;

/**
 * Protobuf type {@code yesevi.EmployeePro}
 */
public final class EmployeePro extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:yesevi.EmployeePro)
    EmployeeProOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      EmployeePro.class.getName());
  }
  // Use EmployeePro.newBuilder() to construct.
  private EmployeePro(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EmployeePro() {
    title_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeePro_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeePro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umut.yesevi.protobuf.EmployeePro.class, com.umut.yesevi.protobuf.EmployeePro.Builder.class);
  }

  private int bitField0_;
  public static final int RECID_FIELD_NUMBER = 1;
  private double recid_ = 0D;
  /**
   * <code>optional double recid = 1;</code>
   * @return Whether the recid field is set.
   */
  @java.lang.Override
  public boolean hasRecid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional double recid = 1;</code>
   * @return The recid.
   */
  @java.lang.Override
  public double getRecid() {
    return recid_;
  }

  public static final int SHARE_FIELD_NUMBER = 2;
  private float share_ = 0F;
  /**
   * <code>optional float share = 2;</code>
   * @return Whether the share field is set.
   */
  @java.lang.Override
  public boolean hasShare() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional float share = 2;</code>
   * @return The share.
   */
  @java.lang.Override
  public float getShare() {
    return share_;
  }

  public static final int JOBCODE_FIELD_NUMBER = 3;
  private int jobcode_ = 0;
  /**
   * <code>optional int32 jobcode = 3;</code>
   * @return Whether the jobcode field is set.
   */
  @java.lang.Override
  public boolean hasJobcode() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 jobcode = 3;</code>
   * @return The jobcode.
   */
  @java.lang.Override
  public int getJobcode() {
    return jobcode_;
  }

  public static final int TITLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>optional string title = 4;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string title = 4;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        title_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string title = 4;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, recid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(2, share_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, jobcode_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, title_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, recid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, share_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, jobcode_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, title_);
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
    if (!(obj instanceof com.umut.yesevi.protobuf.EmployeePro)) {
      return super.equals(obj);
    }
    com.umut.yesevi.protobuf.EmployeePro other = (com.umut.yesevi.protobuf.EmployeePro) obj;

    if (hasRecid() != other.hasRecid()) return false;
    if (hasRecid()) {
      if (java.lang.Double.doubleToLongBits(getRecid())
          != java.lang.Double.doubleToLongBits(
              other.getRecid())) return false;
    }
    if (hasShare() != other.hasShare()) return false;
    if (hasShare()) {
      if (java.lang.Float.floatToIntBits(getShare())
          != java.lang.Float.floatToIntBits(
              other.getShare())) return false;
    }
    if (hasJobcode() != other.hasJobcode()) return false;
    if (hasJobcode()) {
      if (getJobcode()
          != other.getJobcode()) return false;
    }
    if (hasTitle() != other.hasTitle()) return false;
    if (hasTitle()) {
      if (!getTitle()
          .equals(other.getTitle())) return false;
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
    if (hasRecid()) {
      hash = (37 * hash) + RECID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getRecid()));
    }
    if (hasShare()) {
      hash = (37 * hash) + SHARE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getShare());
    }
    if (hasJobcode()) {
      hash = (37 * hash) + JOBCODE_FIELD_NUMBER;
      hash = (53 * hash) + getJobcode();
    }
    if (hasTitle()) {
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umut.yesevi.protobuf.EmployeePro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umut.yesevi.protobuf.EmployeePro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.umut.yesevi.protobuf.EmployeePro parseFrom(
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
  public static Builder newBuilder(com.umut.yesevi.protobuf.EmployeePro prototype) {
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
   * Protobuf type {@code yesevi.EmployeePro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yesevi.EmployeePro)
      com.umut.yesevi.protobuf.EmployeeProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeePro_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeePro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umut.yesevi.protobuf.EmployeePro.class, com.umut.yesevi.protobuf.EmployeePro.Builder.class);
    }

    // Construct using com.umut.yesevi.protobuf.EmployeePro.newBuilder()
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
      recid_ = 0D;
      share_ = 0F;
      jobcode_ = 0;
      title_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umut.yesevi.protobuf.EmployeeProtos.internal_static_yesevi_EmployeePro_descriptor;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeePro getDefaultInstanceForType() {
      return com.umut.yesevi.protobuf.EmployeePro.getDefaultInstance();
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeePro build() {
      com.umut.yesevi.protobuf.EmployeePro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umut.yesevi.protobuf.EmployeePro buildPartial() {
      com.umut.yesevi.protobuf.EmployeePro result = new com.umut.yesevi.protobuf.EmployeePro(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umut.yesevi.protobuf.EmployeePro result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recid_ = recid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.share_ = share_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jobcode_ = jobcode_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.title_ = title_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umut.yesevi.protobuf.EmployeePro) {
        return mergeFrom((com.umut.yesevi.protobuf.EmployeePro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umut.yesevi.protobuf.EmployeePro other) {
      if (other == com.umut.yesevi.protobuf.EmployeePro.getDefaultInstance()) return this;
      if (other.hasRecid()) {
        setRecid(other.getRecid());
      }
      if (other.hasShare()) {
        setShare(other.getShare());
      }
      if (other.hasJobcode()) {
        setJobcode(other.getJobcode());
      }
      if (other.hasTitle()) {
        title_ = other.title_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 9: {
              recid_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 21: {
              share_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 24: {
              jobcode_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              title_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private double recid_ ;
    /**
     * <code>optional double recid = 1;</code>
     * @return Whether the recid field is set.
     */
    @java.lang.Override
    public boolean hasRecid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional double recid = 1;</code>
     * @return The recid.
     */
    @java.lang.Override
    public double getRecid() {
      return recid_;
    }
    /**
     * <code>optional double recid = 1;</code>
     * @param value The recid to set.
     * @return This builder for chaining.
     */
    public Builder setRecid(double value) {

      recid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional double recid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recid_ = 0D;
      onChanged();
      return this;
    }

    private float share_ ;
    /**
     * <code>optional float share = 2;</code>
     * @return Whether the share field is set.
     */
    @java.lang.Override
    public boolean hasShare() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float share = 2;</code>
     * @return The share.
     */
    @java.lang.Override
    public float getShare() {
      return share_;
    }
    /**
     * <code>optional float share = 2;</code>
     * @param value The share to set.
     * @return This builder for chaining.
     */
    public Builder setShare(float value) {

      share_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional float share = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShare() {
      bitField0_ = (bitField0_ & ~0x00000002);
      share_ = 0F;
      onChanged();
      return this;
    }

    private int jobcode_ ;
    /**
     * <code>optional int32 jobcode = 3;</code>
     * @return Whether the jobcode field is set.
     */
    @java.lang.Override
    public boolean hasJobcode() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 jobcode = 3;</code>
     * @return The jobcode.
     */
    @java.lang.Override
    public int getJobcode() {
      return jobcode_;
    }
    /**
     * <code>optional int32 jobcode = 3;</code>
     * @param value The jobcode to set.
     * @return This builder for chaining.
     */
    public Builder setJobcode(int value) {

      jobcode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 jobcode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobcode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      jobcode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>optional string title = 4;</code>
     * @return Whether the title field is set.
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string title = 4;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          title_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string title = 4;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string title = 4;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 4;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:yesevi.EmployeePro)
  }

  // @@protoc_insertion_point(class_scope:yesevi.EmployeePro)
  private static final com.umut.yesevi.protobuf.EmployeePro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umut.yesevi.protobuf.EmployeePro();
  }

  public static com.umut.yesevi.protobuf.EmployeePro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployeePro>
      PARSER = new com.google.protobuf.AbstractParser<EmployeePro>() {
    @java.lang.Override
    public EmployeePro parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmployeePro> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmployeePro> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umut.yesevi.protobuf.EmployeePro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

