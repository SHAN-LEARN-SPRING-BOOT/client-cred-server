# Setting up Keycloak  

* Install Keycloak
* Create New Realm
* Create New Client 
    - 'Enable Client Authentication'
    - 'Enable Service account roles'
* Add new 'Client Scopes' by picking correct realm
* Navigate to 'Client Scopes' under client and add the client scopes added at realm level (Ensure assigned type is 'default' and 'Include in token scope' is ON)
* Make a POST request to get access token 
    - URL sill be http://localhost:8080/realms/{{YOUR_REALM}}/protocol/openid-connect/token 
    - PAYLOAD will be as given below (x-www-form-urlencoded):
```
    grant_type: "client_credentials"
    client_id: "sb-poc-client-credential"
    client_secret: "<<YOUR_SECRET_GOES_HERE>>" 
``` 
* Retrieve the access token received in above API call response nad send it as "Bearer" token  
* Refer requests ***"1) GET Token -- Admin (Client Credentials Fow)
"*** , ***"APP_2_READ_API"*** and ***"APP_2_WRITE_API"*** in POSTMAN collection ***"spring-boot-3-poc-secure.postman_collection.json"*** 