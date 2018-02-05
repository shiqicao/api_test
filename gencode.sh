#!/bin/bash
swagger-codegen generate -i ./swagger.yaml -l spring \
   -D hideGenerationTimestamp=true \
   -D interfaceOnly=true
