# Impact Faible
- Remove the 'ApiResponses' wrapper from this annotation group. [java:S1710]
- Remove this unused import 'java.util.List'. [java:S1128]
- Rename this generic name to match the regular expression '^[A-Z][0-9]?$'. [java:S119]
- Rename this bean to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [java:S6830]
- This block of commented-out lines of code should be removed. [java:S125]
- Reorder the modifiers to comply with the Java Language Specification. [java:S1124]
- Add a private constructor to hide the implicit public one. [java:S1118]

# Impact Moyen
- Explicitly specify the time zone by passing a ZoneId or a Clock to the .now() method. [java:S8688]
- Replace this use of System.out by a logger. [java:S106]
- ID is not used in the interface. [java:S2326]

# Impact Important
- Replace this persistent entity with a simple POJO or DTO object. [java:S4684]
