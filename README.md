#### Infrastructure

![Alt text](resources/diagram.png?raw=true "Diagram")


#### Creation experiment Pods
![Alt text](resources/flow.png?raw=true "Flow")


```
 helm install stable/grafana

 helm install stable/influxdb --name influxdb --namespace navetes

 curl -i -XPOST http://localhost:8086/query --data-urlencode "q=CREATE DATABASE tracking"

 ```
