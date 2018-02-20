/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package lendup.avro.schema.greensight;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RuleGroupMessage_v1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2836653373893528385L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RuleGroupMessage_v1\",\"namespace\":\"lendup.avro.schema.greensight\",\"fields\":[{\"name\":\"header\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"ruleGroups\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"context\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"string\"}}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RuleGroupMessage_v1> ENCODER =
      new BinaryMessageEncoder<RuleGroupMessage_v1>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RuleGroupMessage_v1> DECODER =
      new BinaryMessageDecoder<RuleGroupMessage_v1>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<RuleGroupMessage_v1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<RuleGroupMessage_v1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RuleGroupMessage_v1>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this RuleGroupMessage_v1 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a RuleGroupMessage_v1 from a ByteBuffer. */
  public static RuleGroupMessage_v1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> header;
  @Deprecated public java.util.List<java.lang.CharSequence> ruleGroups;
  @Deprecated public java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> context;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RuleGroupMessage_v1() {}

  /**
   * All-args constructor.
   * @param header The new value for header
   * @param ruleGroups The new value for ruleGroups
   * @param context The new value for context
   */
  public RuleGroupMessage_v1(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> header, java.util.List<java.lang.CharSequence> ruleGroups, java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> context) {
    this.header = header;
    this.ruleGroups = ruleGroups;
    this.context = context;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return header;
    case 1: return ruleGroups;
    case 2: return context;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: header = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 1: ruleGroups = (java.util.List<java.lang.CharSequence>)value$; break;
    case 2: context = (java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'header' field.
   * @return The value of the 'header' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeader() {
    return header;
  }

  /**
   * Sets the value of the 'header' field.
   * @param value the value to set.
   */
  public void setHeader(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.header = value;
  }

  /**
   * Gets the value of the 'ruleGroups' field.
   * @return The value of the 'ruleGroups' field.
   */
  public java.util.List<java.lang.CharSequence> getRuleGroups() {
    return ruleGroups;
  }

  /**
   * Sets the value of the 'ruleGroups' field.
   * @param value the value to set.
   */
  public void setRuleGroups(java.util.List<java.lang.CharSequence> value) {
    this.ruleGroups = value;
  }

  /**
   * Gets the value of the 'context' field.
   * @return The value of the 'context' field.
   */
  public java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> getContext() {
    return context;
  }

  /**
   * Sets the value of the 'context' field.
   * @param value the value to set.
   */
  public void setContext(java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> value) {
    this.context = value;
  }

  /**
   * Creates a new RuleGroupMessage_v1 RecordBuilder.
   * @return A new RuleGroupMessage_v1 RecordBuilder
   */
  public static lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder newBuilder() {
    return new lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder();
  }

  /**
   * Creates a new RuleGroupMessage_v1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RuleGroupMessage_v1 RecordBuilder
   */
  public static lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder newBuilder(lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder other) {
    return new lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder(other);
  }

  /**
   * Creates a new RuleGroupMessage_v1 RecordBuilder by copying an existing RuleGroupMessage_v1 instance.
   * @param other The existing instance to copy.
   * @return A new RuleGroupMessage_v1 RecordBuilder
   */
  public static lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder newBuilder(lendup.avro.schema.greensight.RuleGroupMessage_v1 other) {
    return new lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder(other);
  }

  /**
   * RecordBuilder for RuleGroupMessage_v1 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RuleGroupMessage_v1>
    implements org.apache.avro.data.RecordBuilder<RuleGroupMessage_v1> {

    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> header;
    private java.util.List<java.lang.CharSequence> ruleGroups;
    private java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> context;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ruleGroups)) {
        this.ruleGroups = data().deepCopy(fields()[1].schema(), other.ruleGroups);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.context)) {
        this.context = data().deepCopy(fields()[2].schema(), other.context);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RuleGroupMessage_v1 instance
     * @param other The existing instance to copy.
     */
    private Builder(lendup.avro.schema.greensight.RuleGroupMessage_v1 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ruleGroups)) {
        this.ruleGroups = data().deepCopy(fields()[1].schema(), other.ruleGroups);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.context)) {
        this.context = data().deepCopy(fields()[2].schema(), other.context);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'header' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeader() {
      return header;
    }

    /**
      * Sets the value of the 'header' field.
      * @param value The value of 'header'.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder setHeader(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.header = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'header' field has been set.
      * @return True if the 'header' field has been set, false otherwise.
      */
    public boolean hasHeader() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'header' field.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder clearHeader() {
      header = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ruleGroups' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getRuleGroups() {
      return ruleGroups;
    }

    /**
      * Sets the value of the 'ruleGroups' field.
      * @param value The value of 'ruleGroups'.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder setRuleGroups(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.ruleGroups = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ruleGroups' field has been set.
      * @return True if the 'ruleGroups' field has been set, false otherwise.
      */
    public boolean hasRuleGroups() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ruleGroups' field.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder clearRuleGroups() {
      ruleGroups = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'context' field.
      * @return The value.
      */
    public java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> getContext() {
      return context;
    }

    /**
      * Sets the value of the 'context' field.
      * @param value The value of 'context'.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder setContext(java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>> value) {
      validate(fields()[2], value);
      this.context = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'context' field has been set.
      * @return True if the 'context' field has been set, false otherwise.
      */
    public boolean hasContext() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'context' field.
      * @return This builder.
      */
    public lendup.avro.schema.greensight.RuleGroupMessage_v1.Builder clearContext() {
      context = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RuleGroupMessage_v1 build() {
      try {
        RuleGroupMessage_v1 record = new RuleGroupMessage_v1();
        record.header = fieldSetFlags()[0] ? this.header : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[0]);
        record.ruleGroups = fieldSetFlags()[1] ? this.ruleGroups : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        record.context = fieldSetFlags()[2] ? this.context : (java.util.List<java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RuleGroupMessage_v1>
    WRITER$ = (org.apache.avro.io.DatumWriter<RuleGroupMessage_v1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RuleGroupMessage_v1>
    READER$ = (org.apache.avro.io.DatumReader<RuleGroupMessage_v1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
