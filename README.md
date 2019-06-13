![Alt text](resources/diagram.png?raw=true "Diagram")


```
 helm install stable/grafana

 helm install stable/influxdb --name influxdb --namespace navetes

 curl -i -XPOST http://localhost:8086/query --data-urlencode "q=CREATE DATABASE tracking"

 ```
