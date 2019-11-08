// @generated: This file is autogenerated by the Structs compiler, DO NOT EDIT MANUALLY

package io.structs.testing;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.ResultSetFuture;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public final class TestingMessageStruct {
  public enum Fields {
    ID("id", "id"),
    FIELD_DOUBLE("field_double", "field_double"),
    FIELD_FLOAT("field_float", "field_float"),
    FIELD_INT32("field_int32", "field_int32"),
    FIELD_INT64("field_int64", "field_int64"),
    FIELD_BOOL("field_bool", "field_bool"),
    FIELD_STRING("field_string", "field_string"),
    FIELD_BYTES("field_bytes", "field_bytes"),
    FIELD_ENUM("field_enum", "field_enum"),
    FIELD_TIMESTAMP("field_timestamp", "field_timestamp"),
    FIELD_DOUBLE_VALUE("field_double_value", "field_double_value"),
    FIELD_FLOAT_VALUE("field_float_value", "field_float_value"),
    FIELD_INT64_VALUE("field_int64_value", "field_int64_value"),
    FIELD_INT32_VALUE("field_int32_value", "field_int32_value"),
    FIELD_BOOL_VALUE("field_bool_value", "field_bool_value"),
    FIELD_STRING_VALUE("field_string_value", "field_string_value"),
    FIELD_BYTES_VALUE("field_bytes_value", "field_bytes_value"),
    LIST_OF_DOUBLE("list_of_double", "list_of_double"),
    LIST_OF_FLOAT("list_of_float", "list_of_float"),
    LIST_OF_INT32("list_of_int32", "list_of_int32"),
    LIST_OF_INT64("list_of_int64", "list_of_int64"),
    LIST_OF_BOOL("list_of_bool", "list_of_bool"),
    LIST_OF_STRING("list_of_string", "list_of_string"),
    LIST_OF_ENUM("list_of_enum", "list_of_enum");

    public final String fieldName;

    public final String path;

    Fields(String fieldName, String path) {
      this.fieldName = fieldName;
      this.path = path;
    }

    public static Iterable<Fields> all() {
      com.google.common.collect.ImmutableList.Builder<Fields> b = com.google.common.collect.ImmutableList.builder();
      b.add(ID);
      b.add(FIELD_DOUBLE);
      b.add(FIELD_FLOAT);
      b.add(FIELD_INT32);
      b.add(FIELD_INT64);
      b.add(FIELD_BOOL);
      b.add(FIELD_STRING);
      b.add(FIELD_BYTES);
      b.add(FIELD_ENUM);
      b.add(FIELD_TIMESTAMP);
      b.add(FIELD_DOUBLE_VALUE);
      b.add(FIELD_FLOAT_VALUE);
      b.add(FIELD_INT64_VALUE);
      b.add(FIELD_INT32_VALUE);
      b.add(FIELD_BOOL_VALUE);
      b.add(FIELD_STRING_VALUE);
      b.add(FIELD_BYTES_VALUE);
      b.add(LIST_OF_DOUBLE);
      b.add(LIST_OF_FLOAT);
      b.add(LIST_OF_INT32);
      b.add(LIST_OF_INT64);
      b.add(LIST_OF_BOOL);
      b.add(LIST_OF_STRING);
      b.add(LIST_OF_ENUM);
      return b.build();
    }

    private static boolean isSelected(Fields field, com.google.protobuf.FieldMask mask) {
      for (String path: mask.getPathsList()) {
        if (path.equals(field.path) || field.path.startsWith(path + ".")) {
          return true;
        }
      }
      return false;
    }

    private static  com.google.common.collect.ImmutableList<Fields> selectFields(com.google.protobuf.FieldMask mask) {
      com.google.common.collect.ImmutableList.Builder<Fields> b = com.google.common.collect.ImmutableList.builder();

      for (Fields field : Fields.values()) {
        if (isSelected(field, mask)) {
          b.add(field);
        }
      }
      return b.build();
    }

    private Object selectIn(io.structs.testing.TestingProto.TestingMessage obj) {
      Object y = null;
      switch (this) {
        
        case ID:
          y = obj.getId();
          break;
        
        case FIELD_DOUBLE:
          y = obj.getFieldDouble();
          break;
        
        case FIELD_FLOAT:
          y = obj.getFieldFloat();
          break;
        
        case FIELD_INT32:
          y = obj.getFieldInt32();
          break;
        
        case FIELD_INT64:
          y = obj.getFieldInt64();
          break;
        
        case FIELD_BOOL:
          y = obj.getFieldBool();
          break;
        
        case FIELD_STRING:
          y = obj.getFieldString();
          break;
        
        case FIELD_BYTES:
          y = obj.getFieldBytes().asReadOnlyByteBuffer();
          break;
        
        case FIELD_ENUM:
          int val = obj.getFieldEnumValue();
          y = val;
          break;
        
        case FIELD_TIMESTAMP:
          if (obj.hasFieldTimestamp()) {
            y = new java.util.Date(com.google.protobuf.util.Timestamps.toMillis(obj.getFieldTimestamp()));
          }
          break;
        
        case FIELD_DOUBLE_VALUE:
          if (obj.hasFieldDoubleValue()) {
            y = obj.getFieldDoubleValue().getValue();
          }
          break;
        
        case FIELD_FLOAT_VALUE:
          if (obj.hasFieldFloatValue()) {
            y = obj.getFieldFloatValue().getValue();
          }
          break;
        
        case FIELD_INT64_VALUE:
          if (obj.hasFieldInt64Value()) {
            y = obj.getFieldInt64Value().getValue();
          }
          break;
        
        case FIELD_INT32_VALUE:
          if (obj.hasFieldInt32Value()) {
            y = obj.getFieldInt32Value().getValue();
          }
          break;
        
        case FIELD_BOOL_VALUE:
          if (obj.hasFieldBoolValue()) {
            y = obj.getFieldBoolValue().getValue();
          }
          break;
        
        case FIELD_STRING_VALUE:
          if (obj.hasFieldStringValue()) {
            y = obj.getFieldStringValue().getValue();
          }
          break;
        
        case FIELD_BYTES_VALUE:
          if (obj.hasFieldBytesValue()) {
            y = obj.getFieldBytesValue().getValue().asReadOnlyByteBuffer();
          }
          break;
        
        case LIST_OF_DOUBLE:
          
          {
            java.util.List<Double> list = new java.util.ArrayList<>();
            for (Double x : obj.getListOfDoubleList()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_FLOAT:
          
          {
            java.util.List<Float> list = new java.util.ArrayList<>();
            for (Float x : obj.getListOfFloatList()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_INT32:
          
          {
            java.util.List<Integer> list = new java.util.ArrayList<>();
            for (Integer x : obj.getListOfInt32List()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_INT64:
          
          {
            java.util.List<Long> list = new java.util.ArrayList<>();
            for (Long x : obj.getListOfInt64List()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_BOOL:
          
          {
            java.util.List<Boolean> list = new java.util.ArrayList<>();
            for (Boolean x : obj.getListOfBoolList()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_STRING:
          
          {
            java.util.List<String> list = new java.util.ArrayList<>();
            for (String x : obj.getListOfStringList()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
        case LIST_OF_ENUM:
          
          {
            java.util.List<Integer> list = new java.util.ArrayList<>();
            for (Integer x : obj.getListOfEnumValueList()) {
              list.add(x);
            }
            y = list;
          }
          break;
        
      }
      return y;
    }
  }

  private static final com.google.common.reflect.TypeToken<Double> listOfDoubles = new com.google.common.reflect.TypeToken<Double>() {};

  private static final com.google.common.reflect.TypeToken<Float> listOfFloats = new com.google.common.reflect.TypeToken<Float>() {};

  private static final com.google.common.reflect.TypeToken<Integer> listOfInts = new com.google.common.reflect.TypeToken<Integer>() {};

  private static final com.google.common.reflect.TypeToken<Long> listOfLongs = new com.google.common.reflect.TypeToken<Long>() {};

  private static final com.google.common.reflect.TypeToken<Boolean> listOfBools = new com.google.common.reflect.TypeToken<Boolean>() {};

  private static final com.google.common.reflect.TypeToken<String> listOfStrings = new com.google.common.reflect.TypeToken<String>() {};

  private final Session session;
  private final com.google.common.base.Supplier<PreparedStatement> selectAllStmt;
  private final com.google.common.base.Supplier<PreparedStatement> insertAllStmt;

  public TestingMessageStruct(Session session) {
    this.session = session;
    this.selectAllStmt = com.google.common.base.Suppliers.memoize(() -> {
      return createSelectAllStmt(session);
    });

    this.insertAllStmt = com.google.common.base.Suppliers.memoize(() -> {
      return createInsertAllStmt(session);
    });
  }

  private static PreparedStatement createSelectAllStmt(Session session) {
    Iterable<String> names = com.google.common.collect.Iterables.transform(Fields.all(), x -> x.fieldName);
    StringBuilder sb = new StringBuilder("select ");
    com.google.common.base.Joiner.on(',').appendTo(sb, names);
    sb.append(" from testing_messages where id=?");
    return session.prepare(sb.toString());
  }

  public java.util.Optional<io.structs.testing.TestingProto.TestingMessage> load(String id) {
    PreparedStatement stmt = selectAllStmt.get();
    BoundStatement bound = stmt.bind(id);
    ResultSet rs = session.execute(bound);
    Row row = rs.one();
    if (row == null) {
      return java.util.Optional.empty();
    }

    return java.util.Optional.of(ofRowOrDie(row));
  }

  public com.google.common.util.concurrent.ListenableFuture<java.util.Optional<io.structs.testing.TestingProto.TestingMessage>> loadAsync(String id) {
    PreparedStatement stmt = selectAllStmt.get();
    BoundStatement bound = stmt.bind(id);
    ResultSetFuture rsF = session.executeAsync(bound);
    return com.google.common.util.concurrent.Futures.transform(rsF, rs -> {
      Row row = rs.one();
      if (row == null) {
        return java.util.Optional.empty();
      }

      return java.util.Optional.of(ofRowOrDie(row));
    });
  }

  private static io.structs.testing.TestingProto.TestingMessage ofRowOrDie(Row row) {
    try {
      return ofRow(row);
    } catch (com.google.protobuf.InvalidProtocolBufferException ex) {
      throw io.grpc.Status.fromThrowable(ex).asRuntimeException();
    }
  }

  private static io.structs.testing.TestingProto.TestingMessage ofRow(Row row) throws com.google.protobuf.InvalidProtocolBufferException {
    io.structs.testing.TestingProto.TestingMessage.Builder b = io.structs.testing.TestingProto.TestingMessage.newBuilder();

    {
      int idx = row.getColumnDefinitions().getIndexOf("id");
      if (!row.isNull(idx)) {
        String value = row.getString(idx);
        b.setId(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_double");
      if (!row.isNull(idx)) {
        double value = row.getDouble(idx);
        b.setFieldDouble(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_float");
      if (!row.isNull(idx)) {
        float value = row.getFloat(idx);
        b.setFieldFloat(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_int32");
      if (!row.isNull(idx)) {
        int value = row.getInt(idx);
        b.setFieldInt32(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_int64");
      if (!row.isNull(idx)) {
        long value = row.getLong(idx);
        b.setFieldInt64(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_bool");
      if (!row.isNull(idx)) {
        boolean value = row.getBool(idx);
        b.setFieldBool(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_string");
      if (!row.isNull(idx)) {
        String value = row.getString(idx);
        b.setFieldString(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_bytes");
      if (!row.isNull(idx)) {
        java.nio.ByteBuffer value = row.getBytes(idx);
        b.setFieldBytes(com.google.protobuf.ByteString.copyFrom(value));
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_enum");
      if (!row.isNull(idx)) {
        int value = row.getInt(idx);
        b.setFieldEnumValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_timestamp");
      if (!row.isNull(idx)) {
        java.util.Date value = row.getTimestamp(idx);
        b.setFieldTimestamp(com.google.protobuf.util.Timestamps.fromMillis(value.getTime()));
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_double_value");
      if (!row.isNull(idx)) {
        double value = row.getDouble(idx);
        b.getFieldDoubleValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_float_value");
      if (!row.isNull(idx)) {
        float value = row.getFloat(idx);
        b.getFieldFloatValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_int64_value");
      if (!row.isNull(idx)) {
        long value = row.getLong(idx);
        b.getFieldInt64ValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_int32_value");
      if (!row.isNull(idx)) {
        int value = row.getInt(idx);
        b.getFieldInt32ValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_bool_value");
      if (!row.isNull(idx)) {
        boolean value = row.getBool(idx);
        b.getFieldBoolValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_string_value");
      if (!row.isNull(idx)) {
        String value = row.getString(idx);
        b.getFieldStringValueBuilder().setValue(value);
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("field_bytes_value");
      if (!row.isNull(idx)) {
        java.nio.ByteBuffer value = row.getBytes(idx);
        b.getFieldBytesValueBuilder().setValue(com.google.protobuf.ByteString.copyFrom(value));
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_double");
      if (!row.isNull(idx)) {
        java.util.List<Double> value = row.getList(idx, listOfDoubles);
        for (double x : value) {
          b.addListOfDouble(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_float");
      if (!row.isNull(idx)) {
        java.util.List<Float> value = row.getList(idx, listOfFloats);
        for (float x : value) {
          b.addListOfFloat(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_int32");
      if (!row.isNull(idx)) {
        java.util.List<Integer> value = row.getList(idx, listOfInts);
        for (int x : value) {
          b.addListOfInt32(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_int64");
      if (!row.isNull(idx)) {
        java.util.List<Long> value = row.getList(idx, listOfLongs);
        for (long x : value) {
          b.addListOfInt64(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_bool");
      if (!row.isNull(idx)) {
        java.util.List<Boolean> value = row.getList(idx, listOfBools);
        for (boolean x : value) {
          b.addListOfBool(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_string");
      if (!row.isNull(idx)) {
        java.util.List<String> value = row.getList(idx, listOfStrings);
        for (String x : value) {
          b.addListOfString(x);
        }
      }
    }

    {
      int idx = row.getColumnDefinitions().getIndexOf("list_of_enum");
      if (!row.isNull(idx)) {
        java.util.List<Integer> value = row.getList(idx, listOfInts);
        for (int x : value) {
          b.addListOfEnumValue(x);
        }
      }
    }

    
    return b.build();
  }

  private static PreparedStatement createInsertAllStmt(Session session) {
    StringBuilder sb = new StringBuilder();
    sb.append("INSERT INTO testing_messages (");
    sb.append("id, field_double, field_float, field_int32, field_int64, field_bool, field_string, field_bytes, field_enum, field_timestamp, field_double_value, field_float_value, field_int64_value, field_int32_value, field_bool_value, field_string_value, field_bytes_value, list_of_double, list_of_float, list_of_int32, list_of_int64, list_of_bool, list_of_string, list_of_enum) ");
    sb.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

    return session.prepare(sb.toString());
  }

  public void save(io.structs.testing.TestingProto.TestingMessage obj) {
    PreparedStatement stmt = insertAllStmt.get();
    Object[] boundObjs = new Object[24];

    {
      Object o = null;
      o = obj.getId();
      boundObjs[0] = o;
    }

    {
      Object o = null;
      o = obj.getFieldDouble();
      boundObjs[1] = o;
    }

    {
      Object o = null;
      o = obj.getFieldFloat();
      boundObjs[2] = o;
    }

    {
      Object o = null;
      o = obj.getFieldInt32();
      boundObjs[3] = o;
    }

    {
      Object o = null;
      o = obj.getFieldInt64();
      boundObjs[4] = o;
    }

    {
      Object o = null;
      o = obj.getFieldBool();
      boundObjs[5] = o;
    }

    {
      Object o = null;
      o = obj.getFieldString();
      boundObjs[6] = o;
    }

    {
      Object o = null;
      o = obj.getFieldBytes().asReadOnlyByteBuffer();
      boundObjs[7] = o;
    }

    {
      Object o = null;
      int val = obj.getFieldEnumValue();
      o = val;
      boundObjs[8] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldTimestamp()) {
        o = new java.util.Date(com.google.protobuf.util.Timestamps.toMillis(obj.getFieldTimestamp()));
      }
      boundObjs[9] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldDoubleValue()) {
        o = obj.getFieldDoubleValue().getValue();
      }
      boundObjs[10] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldFloatValue()) {
        o = obj.getFieldFloatValue().getValue();
      }
      boundObjs[11] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldInt64Value()) {
        o = obj.getFieldInt64Value().getValue();
      }
      boundObjs[12] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldInt32Value()) {
        o = obj.getFieldInt32Value().getValue();
      }
      boundObjs[13] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldBoolValue()) {
        o = obj.getFieldBoolValue().getValue();
      }
      boundObjs[14] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldStringValue()) {
        o = obj.getFieldStringValue().getValue();
      }
      boundObjs[15] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldBytesValue()) {
        o = obj.getFieldBytesValue().getValue().asReadOnlyByteBuffer();
      }
      boundObjs[16] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Double> list = new java.util.ArrayList<>();
        for (Double x : obj.getListOfDoubleList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[17] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Float> list = new java.util.ArrayList<>();
        for (Float x : obj.getListOfFloatList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[18] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (Integer x : obj.getListOfInt32List()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[19] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Long> list = new java.util.ArrayList<>();
        for (Long x : obj.getListOfInt64List()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[20] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Boolean> list = new java.util.ArrayList<>();
        for (Boolean x : obj.getListOfBoolList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[21] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<String> list = new java.util.ArrayList<>();
        for (String x : obj.getListOfStringList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[22] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (Integer x : obj.getListOfEnumValueList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[23] = o;
    }

    BoundStatement bound = stmt.bind(boundObjs);
    session.execute(bound);
  }

  public com.google.common.util.concurrent.ListenableFuture<Void> saveAsync(io.structs.testing.TestingProto.TestingMessage obj) {
    PreparedStatement stmt = insertAllStmt.get();
    Object[] boundObjs = new Object[24];

    {
      Object o = null;
      o = obj.getId();
      boundObjs[0] = o;
    }

    {
      Object o = null;
      o = obj.getFieldDouble();
      boundObjs[1] = o;
    }

    {
      Object o = null;
      o = obj.getFieldFloat();
      boundObjs[2] = o;
    }

    {
      Object o = null;
      o = obj.getFieldInt32();
      boundObjs[3] = o;
    }

    {
      Object o = null;
      o = obj.getFieldInt64();
      boundObjs[4] = o;
    }

    {
      Object o = null;
      o = obj.getFieldBool();
      boundObjs[5] = o;
    }

    {
      Object o = null;
      o = obj.getFieldString();
      boundObjs[6] = o;
    }

    {
      Object o = null;
      o = obj.getFieldBytes().asReadOnlyByteBuffer();
      boundObjs[7] = o;
    }

    {
      Object o = null;
      int val = obj.getFieldEnumValue();
      o = val;
      boundObjs[8] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldTimestamp()) {
        o = new java.util.Date(com.google.protobuf.util.Timestamps.toMillis(obj.getFieldTimestamp()));
      }
      boundObjs[9] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldDoubleValue()) {
        o = obj.getFieldDoubleValue().getValue();
      }
      boundObjs[10] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldFloatValue()) {
        o = obj.getFieldFloatValue().getValue();
      }
      boundObjs[11] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldInt64Value()) {
        o = obj.getFieldInt64Value().getValue();
      }
      boundObjs[12] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldInt32Value()) {
        o = obj.getFieldInt32Value().getValue();
      }
      boundObjs[13] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldBoolValue()) {
        o = obj.getFieldBoolValue().getValue();
      }
      boundObjs[14] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldStringValue()) {
        o = obj.getFieldStringValue().getValue();
      }
      boundObjs[15] = o;
    }

    {
      Object o = null;
      if (obj.hasFieldBytesValue()) {
        o = obj.getFieldBytesValue().getValue().asReadOnlyByteBuffer();
      }
      boundObjs[16] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Double> list = new java.util.ArrayList<>();
        for (Double x : obj.getListOfDoubleList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[17] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Float> list = new java.util.ArrayList<>();
        for (Float x : obj.getListOfFloatList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[18] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (Integer x : obj.getListOfInt32List()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[19] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Long> list = new java.util.ArrayList<>();
        for (Long x : obj.getListOfInt64List()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[20] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Boolean> list = new java.util.ArrayList<>();
        for (Boolean x : obj.getListOfBoolList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[21] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<String> list = new java.util.ArrayList<>();
        for (String x : obj.getListOfStringList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[22] = o;
    }

    {
      Object o = null;
      
      {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (Integer x : obj.getListOfEnumValueList()) {
          list.add(x);
        }
        o = list;
      }
      boundObjs[23] = o;
    }

    BoundStatement bound = stmt.bind(boundObjs);
    ResultSetFuture rsF = session.executeAsync(bound);
    return com.google.common.util.concurrent.Futures.transform(rsF, x -> null);
  }

  public void update(io.structs.testing.TestingProto.TestingMessage obj, com.google.protobuf.FieldMask mask) {
    mask = com.google.protobuf.util.FieldMaskUtil.normalize(mask);
    if (!com.google.protobuf.util.FieldMaskUtil.isValid(io.structs.testing.TestingProto.TestingMessage.getDescriptor(), mask)) {
      throw new IllegalArgumentException("illegal mask: " + mask);
    }

    StringBuilder sb = new StringBuilder();
    sb.append("UPDATE testing_messages SET ");
    java.util.List<Fields> fields = Fields.selectFields(mask);
    for (int i = 0; i < fields.size(); ++i) {
      Fields field = fields.get(i);
      sb.append(field.fieldName).append("=?");
      if (i < fields.size() - 1) {
        sb.append(", ");
      }
    }

    sb.append("  where id=?");

    String stmtStr = sb.toString();
    System.out.println(stmtStr);
    PreparedStatement stmt = session.prepare(stmtStr);
    Object[] boundObjs = new Object[fields.size() + 1];
    int i = 0;
    while (i < fields.size()) {
      Fields field = fields.get(i);
      boundObjs[i] = field.selectIn(obj);
      ++i;
    }

    
    boundObjs[i++] = Fields.ID.selectIn(obj);
    ++i;

    BoundStatement bound = stmt.bind(boundObjs);
    session.execute(bound);
  }
}
