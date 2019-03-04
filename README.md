# STIX 2 implementation in Gson

Implementation of the STIX 2 specification in Java based on the Gson serializer including an implemetnation of STIX patterns

### Quickstart

Typically when consuming STIX messages you typically receive a Bundle. To deserialize a received Bundle do this:

```java
Bundle bundle = Stix2Gson.PRODUCTION.fromJson(jsonString, Bundle.class);
```

In the next example we programmatically create a STIX Identity and serialize it to JSON.

```java
//create a UUID type 4 in line with the STIX spec
UUID uuid = UUID.randomUUID();
//create Identity object
Identity identity = new Identity(
        "identity--" + uuid.toString(),
        "CS-Aware",
        "organisation",
        LocalDateTime.now(),
        LocalDateTime.now()
);
//set additional attributes
identity.setDescription("This is the CS-Aware prototype.");
//serialize it
String serializedJson = Stix2Gson.PRODUCTION.toJson(identity);
 ```       
 


### Other Implementations

#### STIX-Java (Jackson based implementation)

If you are looking for a jackson based implementation, take a look at the [STIX-Java](https://github.com/StephenOTT/STIX-Java) library. 



`This project has received funding from the European Union’s Horizon 2020 research and innovation programme under grant agreement No 740723. This communication reflects only the author's view and the Commission is not responsible for any use that may be made of the information it contains.
`