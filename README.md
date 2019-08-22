# Play with quarkus


````bash
mvn io.quarkus:quarkus-maven-plugin:0.21.1:create     -DprojectGroupId=fr.isitc     -DprojectArtifactId=roadplanner     -DclassName="fr.istic.rest.TrajetResource" -Dpath="/trajets"   -Dextensions="keycloak, smallrye-fault-tolerance, resteasy-jsonb, hibernate-validator, openapi, hibernate-orm-panache, flyway, agroal, narayana-jta, jdbc-mariadb, smallrye-opentracing, mailer, scheduler"
```

````bash
export access_token=$(\                                                                    en
    curl -X POST http://localhost:8180/auth/realms/quarkus/protocol/openid-connect/token \
    --user backend-service:secret \
    -H 'content-type: application/x-www-form-urlencoded' \
    -d 'username=alice&password=alice&grant_type=password' | jq --raw-output '.access_token' \
 )
```

````bash
curl -X GET   http://localhost:8080/api/gifts   -H "Authorization: Bearer "$access_token```
```
