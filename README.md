# springboot-logback
## 基于docker es kibana
###获取镜像
* docker pull elasticsearch
* docker pull mobz/elasticsearch-head:5 (最好用这个，我下载过最新的发现都是错误的启动不了)
* docker pull kibana
### 启动es
docker run -d --name es-master1 -p 9200:9200 -p 9300:9300 -v $PWD/elasticsearch/es-master.yml:/usr/share/elasticsearch/config/elasticsearch.yml elasticsearch
### 启动es-head
docker run -d -p 9100:9100 --name es-head mobz/elasticsearch-head:5
### 启动 kibana
* docker run --name kibana -p 5601:5601 -v $PWD/kibana/kibana.yml:/etc/kibana/kibana.yml  -d kibana
* $PWD/kibana/kibana.yml 是本地的目录文件
* /etc/kibana/kibana.yml 是虚拟机中的文件
* **在项目的根目录已经放了一个kibana.yml,elasticsearch.url是指宿主机的ip（最好用宿主机ip），不然会产生调用直接的错误**
