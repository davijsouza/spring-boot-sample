#!/bin/sh
yum install -y https://repo.saltstack.com/yum/redhat/salt-repo-latest-1.el6.noarch.rpm
yum install -y epel-release
yum install -y salt-minion
echo master: 192.168.88.101 > /etc/salt/minion.d/minion.conf
echo $1 > /etc/salt/minion_id
chkconfig salt-minion on
service salt-minion start
