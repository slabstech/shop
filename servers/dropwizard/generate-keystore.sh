#!/usr/bin/env bash
KEYSTORE_FILE=src/main/resources/keystore.pfx
rm -f ${KEYSTORE_FILE}

keytool -genkey -alias dropwizard-server-shop \
    -keyalg RSA \
    -keysize 2048 \
    -keystore ${KEYSTORE_FILE} \
    -storepass changeit \
    -keypass changeit \
    -storetype PKCS12 \
    -dname "CN=dropwizard-server-shop, OU=Org Unit, O=Org, L=Locality, S=State, C=Country" \

echo "Wrote ${KEYSTORE_FILE}"