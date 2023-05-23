# Docker Build & Up

目标: 快速部署体验系统，帮助了解系统之间的依赖关系。

## 功能文件列表

```text
.
├── Docker-HOWTO.md
├── docker-compose.yml
├── docker.env
├── fly-server
│   ├── Dockerfile
│   └── nginx.conf
└── fly-ui-admin
    ├── .dockerignore
    └── Dockerfile
```

## Maven build (Optional)

```shell
# 创建maven缓存volume
docker volume create --name fly-maven-repo

docker run -it --rm --name fly-maven \
    -v fly-maven-repo:/root/.m2 \
    -v $PWD:/usr/src/mymaven \
    -w /usr/src/mymaven \
    maven mvn clean install package '-Dmaven.test.skip=true'
```

## Docker Compose Build

```shell
docker compose --env-file docker.env build
```

## Docker Compose Up

```shell
docker compose --env-file docker.env up -d
```

第一次执行，由于数据库未初始化，因此yudao-server容器会运行失败。执行如下命令初始化数据库：

```shell
docker exec -i fly-mysql \
    sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD" fly' \
    < ./sql/mysql/fly.sql
```

注意：这里用docker compose exec 会出现 `the input device is not a TTY` 报错

## Server:Port

- admin: http://localhost:8080
- API: http://localhost:48080
- mysql: root/123456, port: 3308
- redis: port: 6379
