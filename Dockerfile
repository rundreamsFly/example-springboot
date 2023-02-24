# 指定基础镜像
FROM registry.cn-chengdu.aliyuncs.com/rundreams-devops/jre:8-tzdata
# 指定作者名和E-mail
MAINTAINER rundreams "rundreams@yeah.net"
#指定挂载点
VOLUME /tmp
#将本地文件或目录复制到由dockerfile构建的镜像中
ADD springboot.jar springboot.jar
#设置环境变量
ENV JAVA_OPTS=""
#提供容器运行的默认命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot.jar"]