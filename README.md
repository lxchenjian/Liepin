# 补充
1、mac电脑上的软件
(1) sourcetree 的gitee管理

2、git的命令
(1) 合并分支代码
右击->git ->merge changes->选择分支
push


# 不改动代码情况下，运行多端口的同一微服务
1、将配置文件中的 端口-> ${port:7001}
右击services里面的服务，选择 copy.....
然后在VM options:  -DPORT=7002
