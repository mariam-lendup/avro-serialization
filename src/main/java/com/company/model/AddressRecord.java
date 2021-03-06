/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.company.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AddressRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2399884648117411082L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AddressRecord\",\"namespace\":\"com.company.model\",\"fields\":[{\"name\":\"streetaddress\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zip\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AddressRecord> ENCODER =
      new BinaryMessageEncoder<AddressRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AddressRecord> DECODER =
      new BinaryMessageDecoder<AddressRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AddressRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AddressRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AddressRecord>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AddressRecord to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AddressRecord from a ByteBuffer. */
  public static AddressRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence streetaddress;
  @Deprecated public java.lang.CharSequence city;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public java.lang.CharSequence zip;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AddressRecord() {}

  /**
   * All-args constructor.
   * @param streetaddress The new value for streetaddress
   * @param city The new value for city
   * @param state The new value for state
   * @param zip The new value for zip
   */
  public AddressRecord(java.lang.CharSequence streetaddress, java.lang.CharSequence city, java.lang.CharSequence state, java.lang.CharSequence zip) {
    this.streetaddress = streetaddress;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return streetaddress;
    case 1: return city;
    case 2: return state;
    case 3: return zip;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: streetaddress = (java.lang.CharSequence)value$; break;
    case 1: city = (java.lang.CharSequence)value$; break;
    case 2: state = (java.lang.CharSequence)value$; break;
    case 3: zip = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'streetaddress' field.
   * @return The value of the 'streetaddress' field.
   */
  public java.lang.CharSequence getStreetaddress() {
    return streetaddress;
  }

  /**
   * Sets the value of the 'streetaddress' field.
   * @param value the value to set.
   */
  public void setStreetaddress(java.lang.CharSequence value) {
    this.streetaddress = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'zip' field.
   * @return The value of the 'zip' field.
   */
  public java.lang.CharSequence getZip() {
    return zip;
  }

  /**
   * Sets the value of the 'zip' field.
   * @param value the value to set.
   */
  public void setZip(java.lang.CharSequence value) {
    this.zip = value;
  }

  /**
   * Creates a new AddressRecord RecordBuilder.
   * @return A new AddressRecord RecordBuilder
   */
  public static com.company.model.AddressRecord.Builder newBuilder() {
    return new com.company.model.AddressRecord.Builder();
  }

  /**
   * Creates a new AddressRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AddressRecord RecordBuilder
   */
  public static com.company.model.AddressRecord.Builder newBuilder(com.company.model.AddressRecord.Builder other) {
    return new com.company.model.AddressRecord.Builder(other);
  }

  /**
   * Creates a new AddressRecord RecordBuilder by copying an existing AddressRecord instance.
   * @param other The existing instance to copy.
   * @return A new AddressRecord RecordBuilder
   */
  public static com.company.model.AddressRecord.Builder newBuilder(com.company.model.AddressRecord other) {
    return new com.company.model.AddressRecord.Builder(other);
  }

  /**
   * RecordBuilder for AddressRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AddressRecord>
    implements org.apache.avro.data.RecordBuilder<AddressRecord> {

    private java.lang.CharSequence streetaddress;
    private java.lang.CharSequence city;
    private java.lang.CharSequence state;
    private java.lang.CharSequence zip;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.company.model.AddressRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.streetaddress)) {
        this.streetaddress = data().deepCopy(fields()[0].schema(), other.streetaddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.zip)) {
        this.zip = data().deepCopy(fields()[3].schema(), other.zip);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AddressRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.company.model.AddressRecord other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.streetaddress)) {
        this.streetaddress = data().deepCopy(fields()[0].schema(), other.streetaddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.zip)) {
        this.zip = data().deepCopy(fields()[3].schema(), other.zip);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'streetaddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getStreetaddress() {
      return streetaddress;
    }

    /**
      * Sets the value of the 'streetaddress' field.
      * @param value The value of 'streetaddress'.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder setStreetaddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.streetaddress = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'streetaddress' field has been set.
      * @return True if the 'streetaddress' field has been set, false otherwise.
      */
    public boolean hasStreetaddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'streetaddress' field.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder clearStreetaddress() {
      streetaddress = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.city = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder clearCity() {
      city = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder setState(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.state = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'zip' field.
      * @return The value.
      */
    public java.lang.CharSequence getZip() {
      return zip;
    }

    /**
      * Sets the value of the 'zip' field.
      * @param value The value of 'zip'.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder setZip(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.zip = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'zip' field has been set.
      * @return True if the 'zip' field has been set, false otherwise.
      */
    public boolean hasZip() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'zip' field.
      * @return This builder.
      */
    public com.company.model.AddressRecord.Builder clearZip() {
      zip = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AddressRecord build() {
      try {
        AddressRecord record = new AddressRecord();
        record.streetaddress = fieldSetFlags()[0] ? this.streetaddress : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.city = fieldSetFlags()[1] ? this.city : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.state = fieldSetFlags()[2] ? this.state : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.zip = fieldSetFlags()[3] ? this.zip : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AddressRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<AddressRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AddressRecord>
    READER$ = (org.apache.avro.io.DatumReader<AddressRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
