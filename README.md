# ENTRADA2

A scalable tool for converting DNS data (pcap format) to A Iceberg table using Parquet data files. 
Kubernetes 

# Build

Use spring-boot:build-image target to build the Docker image and then tag and push it to the official Docker Hub repository.

```
./mvnw spring-boot:build-image
docker tag entrada2:0.0.1-SNAPSHOT sidnlabs/entrada2:0.0.1-SNAPSHOT
docker push sidnlabs/entrada2:0.0.1-SNAPSHOT
```



# Uploading pcap file

Example:  
```
curl -X POST -F file=@trace_london_1_2023-08-16_13:56:14.pcap.gz \
-H "X-API-KEY: 94591089610224297274859827590711" \
-F server=ns4 \
-F location=london \
https://entrada-api.sidnlabs.nl/api/v1/upload
```


# Create more efficient Parquet data files

- qname only prefix or null when same as domainname
- use gzip for better column compression, not snappy
- use small 10k dictionary size, to prevent domainname column using dict
  we want bloomfilter for domainname column whichs is much
  more efficient when selecting domainnames in sql
- use sort by domainname for better gzip compression
