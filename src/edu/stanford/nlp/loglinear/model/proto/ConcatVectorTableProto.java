// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConcatVectorTable.proto

package edu.stanford.nlp.loglinear.model.proto;

import com.google.protobuf.CodedOutputStream;

public final class ConcatVectorTableProto {
  private ConcatVectorTableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConcatVectorTableOrBuilder extends
      // @@protoc_insertion_point(interface_extends:edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    java.util.List<java.lang.Integer> getDimensionSizeList();
    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    int getDimensionSizeCount();
    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    int getDimensionSize(int index);

    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> 
        getFactorTableList();
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector getFactorTable(int index);
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    int getFactorTableCount();
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    java.util.List<? extends edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder> 
        getFactorTableOrBuilderList();
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder getFactorTableOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable}
   */
  public static final class ConcatVectorTable extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable)
      ConcatVectorTableOrBuilder {
    // Use ConcatVectorTable.newBuilder() to construct.
    private ConcatVectorTable(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConcatVectorTable(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConcatVectorTable defaultInstance;
    public static ConcatVectorTable getDefaultInstance() {
      return defaultInstance;
    }

    public ConcatVectorTable getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConcatVectorTable(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                dimensionSize_ = new java.util.ArrayList<>();
                mutable_bitField0_ |= 0x00000001;
              }
              dimensionSize_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                dimensionSize_ = new java.util.ArrayList<>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dimensionSize_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                factorTable_ = new java.util.ArrayList<>();
                mutable_bitField0_ |= 0x00000002;
              }
              factorTable_.add(input.readMessage(edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          dimensionSize_ = java.util.Collections.unmodifiableList(dimensionSize_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          factorTable_ = java.util.Collections.unmodifiableList(factorTable_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.class, edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.Builder.class);
    }

    public static com.google.protobuf.Parser<ConcatVectorTable> PARSER =
        new com.google.protobuf.AbstractParser<ConcatVectorTable>() {
      public ConcatVectorTable parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConcatVectorTable(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConcatVectorTable> getParserForType() {
      return PARSER;
    }

    public static final int DIMENSIONSIZE_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> dimensionSize_;
    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getDimensionSizeList() {
      return dimensionSize_;
    }
    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    public int getDimensionSizeCount() {
      return dimensionSize_.size();
    }
    /**
     * <code>repeated int32 dimensionSize = 1;</code>
     */
    public int getDimensionSize(int index) {
      return dimensionSize_.get(index);
    }

    public static final int FACTORTABLE_FIELD_NUMBER = 2;
    private java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> factorTable_;
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    public java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> getFactorTableList() {
      return factorTable_;
    }
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    public java.util.List<? extends edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder> 
        getFactorTableOrBuilderList() {
      return factorTable_;
    }
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    public int getFactorTableCount() {
      return factorTable_.size();
    }
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector getFactorTable(int index) {
      return factorTable_.get(index);
    }
    /**
     * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
     */
    public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder getFactorTableOrBuilder(
        int index) {
      return factorTable_.get(index);
    }

    private void initFields() {
      dimensionSize_ = java.util.Collections.emptyList();
      factorTable_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFactorTableCount(); i++) {
        if (!getFactorTable(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (Integer aDimensionSize_ : dimensionSize_) {
        output.writeInt32(1, aDimensionSize_);
      }
      for (ConcatVectorProto.ConcatVector aFactorTable_ : factorTable_) {
        output.writeMessage(2, aFactorTable_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (Integer aDimensionSize_ : dimensionSize_) {
          dataSize += CodedOutputStream
                  .computeInt32SizeNoTag(aDimensionSize_);
        }
        size += dataSize;
        size += 1 * getDimensionSizeList().size();
      }
      for (ConcatVectorProto.ConcatVector aFactorTable_ : factorTable_) {
        size += CodedOutputStream
                .computeMessageSize(2, aFactorTable_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(byte... data)throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable)
        edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTableOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.class, edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.Builder.class);
      }

      // Construct using edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFactorTableFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        dimensionSize_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (factorTableBuilder_ == null) {
          factorTable_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          factorTableBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor;
      }

      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable getDefaultInstanceForType() {
        return edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.getDefaultInstance();
      }

      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable build() {
        edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable buildPartial() {
        edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable result = new edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          dimensionSize_ = java.util.Collections.unmodifiableList(dimensionSize_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensionSize_ = dimensionSize_;
        if (factorTableBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            factorTable_ = java.util.Collections.unmodifiableList(factorTable_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.factorTable_ = factorTable_;
        } else {
          result.factorTable_ = factorTableBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable) {
          return mergeFrom((edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable other) {
        if (other == edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable.getDefaultInstance()) return this;
        if (!other.dimensionSize_.isEmpty()) {
          if (dimensionSize_.isEmpty()) {
            dimensionSize_ = other.dimensionSize_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionSizeIsMutable();
            dimensionSize_.addAll(other.dimensionSize_);
          }
          onChanged();
        }
        if (factorTableBuilder_ == null) {
          if (!other.factorTable_.isEmpty()) {
            if (factorTable_.isEmpty()) {
              factorTable_ = other.factorTable_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFactorTableIsMutable();
              factorTable_.addAll(other.factorTable_);
            }
            onChanged();
          }
        } else {
          if (!other.factorTable_.isEmpty()) {
            if (factorTableBuilder_.isEmpty()) {
              factorTableBuilder_.dispose();
              factorTableBuilder_ = null;
              factorTable_ = other.factorTable_;
              bitField0_ = (bitField0_ & ~0x00000002);
              factorTableBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFactorTableFieldBuilder() : null;
            } else {
              factorTableBuilder_.addAllMessages(other.factorTable_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getFactorTableCount(); i++) {
          if (!getFactorTable(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (edu.stanford.nlp.loglinear.model.proto.ConcatVectorTableProto.ConcatVectorTable) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> dimensionSize_ = java.util.Collections.emptyList();
      private void ensureDimensionSizeIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          dimensionSize_ = new java.util.ArrayList<>(dimensionSize_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getDimensionSizeList() {
        return java.util.Collections.unmodifiableList(dimensionSize_);
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public int getDimensionSizeCount() {
        return dimensionSize_.size();
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public int getDimensionSize(int index) {
        return dimensionSize_.get(index);
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public Builder setDimensionSize(
          int index, int value) {
        ensureDimensionSizeIsMutable();
        dimensionSize_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public Builder addDimensionSize(int value) {
        ensureDimensionSizeIsMutable();
        dimensionSize_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public Builder addAllDimensionSize(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDimensionSizeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dimensionSize_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dimensionSize = 1;</code>
       */
      public Builder clearDimensionSize() {
        dimensionSize_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> factorTable_ =
        java.util.Collections.emptyList();
      private void ensureFactorTableIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          factorTable_ = new java.util.ArrayList<>(factorTable_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder> factorTableBuilder_;

      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> getFactorTableList() {
        if (factorTableBuilder_ == null) {
          return java.util.Collections.unmodifiableList(factorTable_);
        } else {
          return factorTableBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public int getFactorTableCount() {
        if (factorTableBuilder_ == null) {
          return factorTable_.size();
        } else {
          return factorTableBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector getFactorTable(int index) {
        if (factorTableBuilder_ == null) {
          return factorTable_.get(index);
        } else {
          return factorTableBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder setFactorTable(
          int index, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector value) {
        if (factorTableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFactorTableIsMutable();
          factorTable_.set(index, value);
          onChanged();
        } else {
          factorTableBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder setFactorTable(
          int index, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder builderForValue) {
        if (factorTableBuilder_ == null) {
          ensureFactorTableIsMutable();
          factorTable_.set(index, builderForValue.build());
          onChanged();
        } else {
          factorTableBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder addFactorTable(edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector value) {
        if (factorTableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFactorTableIsMutable();
          factorTable_.add(value);
          onChanged();
        } else {
          factorTableBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder addFactorTable(
          int index, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector value) {
        if (factorTableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFactorTableIsMutable();
          factorTable_.add(index, value);
          onChanged();
        } else {
          factorTableBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder addFactorTable(
          edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder builderForValue) {
        if (factorTableBuilder_ == null) {
          ensureFactorTableIsMutable();
          factorTable_.add(builderForValue.build());
          onChanged();
        } else {
          factorTableBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder addFactorTable(
          int index, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder builderForValue) {
        if (factorTableBuilder_ == null) {
          ensureFactorTableIsMutable();
          factorTable_.add(index, builderForValue.build());
          onChanged();
        } else {
          factorTableBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder addAllFactorTable(
          java.lang.Iterable<? extends edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector> values) {
        if (factorTableBuilder_ == null) {
          ensureFactorTableIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, factorTable_);
          onChanged();
        } else {
          factorTableBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder clearFactorTable() {
        if (factorTableBuilder_ == null) {
          factorTable_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          factorTableBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public Builder removeFactorTable(int index) {
        if (factorTableBuilder_ == null) {
          ensureFactorTableIsMutable();
          factorTable_.remove(index);
          onChanged();
        } else {
          factorTableBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder getFactorTableBuilder(
          int index) {
        return getFactorTableFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder getFactorTableOrBuilder(
          int index) {
        if (factorTableBuilder_ == null) {
          return factorTable_.get(index);  } else {
          return factorTableBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public java.util.List<? extends edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder> 
           getFactorTableOrBuilderList() {
        if (factorTableBuilder_ != null) {
          return factorTableBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(factorTable_);
        }
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder addFactorTableBuilder() {
        return getFactorTableFieldBuilder().addBuilder(
            edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.getDefaultInstance());
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder addFactorTableBuilder(
          int index) {
        return getFactorTableFieldBuilder().addBuilder(
            index, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.getDefaultInstance());
      }
      /**
       * <code>repeated .edu.stanford.nlp.loglinear.model.proto.ConcatVector factorTable = 2;</code>
       */
      public java.util.List<edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder> 
           getFactorTableBuilderList() {
        return getFactorTableFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVector.Builder, edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.ConcatVectorOrBuilder> 
          getFactorTableFieldBuilder() {
        if (factorTableBuilder_ == null) {
          factorTableBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<>(
                  factorTable_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          factorTable_ = null;
        }
        return factorTableBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable)
    }

    static {
      defaultInstance = new ConcatVectorTable(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:edu.stanford.nlp.loglinear.model.proto.ConcatVectorTable)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ConcatVectorTable.proto\022&edu.stanford." +
      "nlp.loglinear.model.proto\032\022ConcatVector." +
      "proto\"u\n\021ConcatVectorTable\022\025\n\rdimensionS" +
      "ize\030\001 \003(\005\022I\n\013factorTable\030\002 \003(\01324.edu.sta" +
      "nford.nlp.loglinear.model.proto.ConcatVe" +
      "ctorB@\n&edu.stanford.nlp.loglinear.model" +
      ".protoB\026ConcatVectorTableProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.getDescriptor(),
        }, assigner);
    internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_edu_stanford_nlp_loglinear_model_proto_ConcatVectorTable_descriptor,
        new java.lang.String[] { "DimensionSize", "FactorTable", });
    edu.stanford.nlp.loglinear.model.proto.ConcatVectorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
