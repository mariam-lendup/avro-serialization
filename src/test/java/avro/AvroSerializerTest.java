package avro;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import javax.xml.bind.DatatypeConverter;

import avro.shaded.com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lendup.avro.schema.greensight.RuleGroupMessage_v0;
import lendup.avro.schema.greensight.RuleGroupMessage_v1;
import org.apache.avro.specific.SpecificRecord;
import org.junit.Test;
import scala.Char;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AvroSerializerTest {

    @Test
    public void testSerialize() {
        User user = User.newBuilder().setName("John Doe").setFavoriteColor("green")
                .setFavoriteNumber(null).build();

        AvroSerializer<User> avroSerializer = new AvroSerializer<>();
        assertThat(avroSerializer.serialize("avro.t", user))
                .isEqualTo(DatatypeConverter.parseHexBinary("104A6F686E20446F6502000A677265656E"));

        avroSerializer.close();
    }

    @Test
    public void testSerializeMessage() {

        List<Map<CharSequence,CharSequence>> context = ImmutableList.of(
                ImmutableMap.<CharSequence, CharSequence>builder()
                        .put("mapType", "loan")
                        .put("loanId", "80")
                        .put("loanAmount", "200")
                        .put("loanServicingType", "AMS")
                        .put("loanTotal", "300")
                        .put("loanBalance","100")
                        .build(),
                ImmutableMap.<CharSequence, CharSequence>builder()
                        .put("transactionId", "2")
                        .put("transactionType", "FUNDING")
                        .put("transactionDirection", "CREDIT")
                        .put("transactionAmount", "200")
                        .put("transactionExternalId", "abc")
                        .put("transactionState", "executed")
                        .put("transactionReturned", "false")
                        .put("mapType", "transaction")
                        .build(),
                ImmutableMap.<CharSequence, CharSequence>builder()
                        .put("transactionId", "2")
                        .put("transactionType", "")
                        .put("transactionDirection", "DEBIT")
                        .put("transactionAmount", "200")
                        .put("transactionExternalId", "abc")
                        .put("transactionState", "executed")
                        .put("transactionReturned", "false")
                        .put("mapType", "transaction")
                        .build()
        );

        Map<CharSequence, CharSequence> header = ImmutableMap.<CharSequence, CharSequence>builder()
                .put("source", "test")
                .put("name", "fooName")
                .put("eventId", valueOf("AEBAEB"))
                .put("contextVersion", "1")
                .put("createdAt", valueOf(System.currentTimeMillis()))
                .build();

        RuleGroupMessage_v0 message = RuleGroupMessage_v0.newBuilder()
                                                            .setContext(context)
                                                            .setHeader(header)
                                                            .setRuleGroups(Arrays.asList("money_movement"))
                                                            .build();

        AvroSerializer<RuleGroupMessage_v0> avroSerializer = new AvroSerializer<>();

        byte[] data = avroSerializer.serialize("avro.t", message);


        avroSerializer.close();

        AvroDeserializer<RuleGroupMessage_v0> avroDeserializer = new AvroDeserializer<>(RuleGroupMessage_v0.class);

        assertThat(avroDeserializer.deserialize("avro.t", data)).isInstanceOf(RuleGroupMessage_v0.class);

        RuleGroupMessage_v0 dMessage = avroDeserializer.deserialize("avro.t", data);

        System.out.println(dMessage);

        avroDeserializer.close();

    }

    @Test
    public void testSerializeNestedMapMessage() {

        List<Map<CharSequence,Map<CharSequence,CharSequence>>> context = ImmutableList.of(
                ImmutableMap.<CharSequence, Map<CharSequence,CharSequence>>builder()
                        .put("mapType", ImmutableMap.<CharSequence, CharSequence>builder().put("type", "loan").build())
                        .put("loanId", ImmutableMap.<CharSequence, CharSequence>builder().put("id", "80").put("sid", "90").build())
                        .build(),
                ImmutableMap.<CharSequence, Map<CharSequence,CharSequence>>builder()
                        .put("transactionId", ImmutableMap.<CharSequence, CharSequence>builder().put("tid", "2").put("stid", "5").build())
                        .put("transactionType", ImmutableMap.<CharSequence, CharSequence>builder().put("tt", "FUNDING").put("stt", "CREDIT").build())
                        .build()
        );

        Map<CharSequence, CharSequence> header = ImmutableMap.<CharSequence, CharSequence>builder()
                .put("source", "test")
                .put("name", "fooName")
                .put("eventId", valueOf("AEBAEB"))
                .put("contextVersion", "1")
                .put("createdAt", valueOf(System.currentTimeMillis()))
                .build();

        RuleGroupMessage_v1 message = RuleGroupMessage_v1.newBuilder()
                .setContext(context)
                .setHeader(header)
                .setRuleGroups(Arrays.asList("money_movement"))
                .build();

        AvroSerializer<RuleGroupMessage_v1> avroSerializer = new AvroSerializer<>();

        byte[] data = avroSerializer.serialize("avro.t", message);

        System.out.println(message.getSchema().getFullName());

        avroSerializer.close();

        AvroDeserializer<RuleGroupMessage_v1> avroDeserializer = new AvroDeserializer<>(RuleGroupMessage_v1.class);

        assertThat(avroDeserializer.deserialize("avro.t", data)).isInstanceOf(RuleGroupMessage_v1.class);

        RuleGroupMessage_v1 dMessage = avroDeserializer.deserialize("avro.t", data);
        CharSequence type = message.getContext().get(0).get("mapType").get("type");

        System.out.println(dMessage);

        avroDeserializer.close();

    }
}
