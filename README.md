# log4j2-over-slf4j
log4j2到sfl4j的桥梁

- 查看物理CPU个数
```
cat /proc/cpuinfo| grep "physical id"| sort| uniq| wc -l
```

- 查看每个物理CPU中core的个数(即核数)
```
cat /proc/cpuinfo| grep "cpu cores"| uniq
```

- 查看内存大小
```
free -h
```
